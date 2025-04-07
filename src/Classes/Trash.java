//
//   public void LoadImage() {
//        try {
//            byte[] imagedata = rs.getBytes("imageFile");
//
//            if (imagedata != null && imagedata.length > 0) {
//                format1 = new ImageIcon(imagedata);
//                Image mm = format1.getImage();
//                Image img2 = mm.getScaledInstance(211, 217, Image.SCALE_SMOOTH);
//                ImageIcon image = new ImageIcon(img2);
//                EditImage.setIcon(image);
//            } else {
//                setDefaultImage(); // fallback if byte array is empty
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            setDefaultImage(); // fallback on error
//        }
//    }
//   
//   
//   public void setDefaultImage() {
//        try {
//            ImageIcon ii = new ImageIcon("insertimage.jpg"); // Make sure this image exists in your project directory
//            Image img = ii.getImage().getScaledInstance(211, 217, Image.SCALE_SMOOTH);
//            EditImage.setIcon(new ImageIcon(img));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Default image not found!");
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
//        }
//    }