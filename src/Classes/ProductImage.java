package Classes;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProductImage {
    
    private static final HashMap<Integer, ImageIcon> imageCache = new HashMap<>();
    private static final int WIDTH = 218;
    private static final int HEIGHT = 218;

    public static ImageIcon getImageIcon(byte[] imageData) {
        if (imageData != null) {
            ImageIcon format = new ImageIcon(imageData);
            Image img = format.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        }
        return null;
    }

    public static void preloadAllImages(Connection con) {
        String query = "SELECT id, imageFile FROM product";
        try (PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
            String userHome = System.getProperty("user.home");
            File cacheDir = new File(userHome + "/HazeByteCache/");
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }

            while (rs.next()) {
                
                int productId = rs.getInt("id");
                byte[] imageData = rs.getBytes("imageFile");

                if (imageData != null) {
                    File imageFile = new File(cacheDir, productId + ".png");

                    if (!imageFile.exists()) {
                        BufferedImage original = ImageIO.read(new ByteArrayInputStream(imageData));
                        if (original != null) {
                            Image resized = original.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
                            BufferedImage bufferedResized = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
                            bufferedResized.getGraphics().drawImage(resized, 0, 0, null);
                            ImageIO.write(bufferedResized, "png", imageFile);
                        }
                    }

                    ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
                    imageCache.put(productId, icon);
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadImageAndSetToLabel(int productId, JLabel label, Connection con) {
        if (imageCache.containsKey(productId)) {
            label.setIcon(imageCache.get(productId));
            return;
        }

        try {
            String userHome = System.getProperty("user.home");
            File cacheDir = new File(userHome + "/HazeByteCache/");
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }

            File imageFile = new File(cacheDir, productId + ".png");

            if (imageFile.exists()) {
                ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
                imageCache.put(productId, icon);
                label.setIcon(icon);
                return;
            }

            PreparedStatement pst = con.prepareStatement("SELECT imageFile FROM product WHERE id=?");
            pst.setInt(1, productId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                byte[] imageData = rs.getBytes("imageFile");
                if (imageData != null) {
                    BufferedImage original = ImageIO.read(new ByteArrayInputStream(imageData));
                    if (original != null) {
                        Image resized = original.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
                        BufferedImage bufferedResized = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
                        bufferedResized.getGraphics().drawImage(resized, 0, 0, null);
                        ImageIO.write(bufferedResized, "png", imageFile);

                        ImageIcon icon = new ImageIcon(bufferedResized);
                        imageCache.put(productId, icon);
                        label.setIcon(icon);
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static void loadHistoryImageAndSetToLabel(int id, JLabel label, Connection con) {
        if (imageCache.containsKey(id)) {
            label.setIcon(imageCache.get(id));
            label.setText("");
            return;
        }

        String sql = "SELECT imageFile FROM history WHERE id = ?";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    byte[] imgBytes = rs.getBytes("imageFile");

                    if (imgBytes != null && imgBytes.length > 0) {
                        ImageIcon icon = new ImageIcon(imgBytes);
                        Image img = icon.getImage().getScaledInstance(213, 207, Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon = new ImageIcon(img);
                        imageCache.put(id, scaledIcon);
                        label.setIcon(scaledIcon);
                        label.setText("");
                    } else {
                        label.setIcon(null);
                        label.setText("No Image");
                    }
                } else {
                    label.setIcon(null);
                    label.setText("No Image Found");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            label.setIcon(null);
            label.setText("Error loading image");
        }
    }


}
