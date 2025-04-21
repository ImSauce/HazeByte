
package Frames;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ProductDetailUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ProductDetailUI::createUI);
    }

    public static void createUI() {
        JFrame frame = new JFrame("Product Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(950, 550);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(new Color(28, 28, 40));

        JPanel container = new JPanel(new GridBagLayout());
        container.setBackground(new Color(28, 28, 40));
        container.setBorder(new EmptyBorder(30, 30, 30, 30));

        JPanel card = new JPanel(new GridBagLayout());
        card.setBackground(new Color(36, 36, 50));
        card.setBorder(new CompoundBorder(
                new LineBorder(new Color(60, 60, 80), 1, true),
                new EmptyBorder(20, 20, 20, 20)
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 15, 10, 15);
        gbc.fill = GridBagConstraints.BOTH;

        // === Left Side (Image + Name + Description) ===
        JPanel left = new JPanel();
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        left.setBackground(new Color(36, 36, 50));

        JLabel image = new JLabel("Insert Image", SwingConstants.CENTER);
        image.setPreferredSize(new Dimension(250, 150));
        image.setBackground(new Color(50, 50, 70));
        image.setOpaque(true);
        image.setForeground(Color.LIGHT_GRAY);
        image.setBorder(BorderFactory.createDashedBorder(Color.GRAY));

        JLabel name = new JLabel("jhk");
        name.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        JLabel id = new JLabel("ID: #789");
        id.setForeground(Color.LIGHT_GRAY);

        JTextArea description = new JTextArea(4, 20);
        description.setText("Product description...");
        styleTextArea(description);

        left.add(image);
        left.add(Box.createVerticalStrut(15));
        left.add(name);
        left.add(id);
        left.add(Box.createVerticalStrut(15));
        left.add(new JLabel("Description:"));
        left.add(description);

        // === Right Side (Details) ===
        JPanel right = new JPanel(new GridLayout(8, 2, 10, 10));
        right.setBackground(new Color(36, 36, 50));

        addField(right, "Cost", "₱999.00");
        addField(right, "Quantity", "3");
        addField(right, "Discount %", "10");
        addField(right, "Total Discount", "₱299.70");
        addField(right, "Subtotal", "₱2697.30");
        addField(right, "Total", "₱2997.00");
        addField(right, "Status", "Returned");

        JTextArea reason = new JTextArea(3, 20);
        styleTextArea(reason);
        right.add(new JLabel("Reason:"));
        right.add(new JScrollPane(reason));

        // === Add Panels to Card ===
        gbc.gridx = 0;
        gbc.gridy = 0;
        card.add(left, gbc);
        gbc.gridx = 1;
        card.add(right, gbc);

        container.add(card);
        root.add(container);
        frame.setContentPane(root);
        frame.setVisible(true);
    }

    private static void addField(JPanel panel, String label, String value) {
        JLabel lbl = new JLabel(label + ":");
        lbl.setForeground(Color.LIGHT_GRAY);
        lbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JTextField field = new JTextField(value);
        field.setEditable(false);
        field.setBackground(new Color(48, 48, 65));
        field.setForeground(Color.WHITE);
        field.setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8));
        panel.add(lbl);
        panel.add(field);
    }

    private static void styleTextArea(JTextArea area) {
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBackground(new Color(48, 48, 65));
        area.setForeground(Color.WHITE);
        area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
    }
}
