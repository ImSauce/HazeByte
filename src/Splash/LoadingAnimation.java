
package Splash;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingAnimation extends JPanel implements ActionListener {
    private final Timer timer;
    private int angle = 0;

    public LoadingAnimation() {
        setPreferredSize(new Dimension(50, 50)); // smaller size
        setOpaque(false);

        timer = new Timer(50, this); // updates every 50ms
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Enable anti-aliasing for smooth edges
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int size = Math.min(getWidth(), getHeight()) - 10;
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;

        // Spinner arc
        g2.setStroke(new BasicStroke(4));
        g2.setColor(new Color(33,188,54)); // bright green

        g2.drawArc(x, y, size, size, angle, 270); // 3/4 circle

        g2.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angle = (angle + 10) % 360; // rotate smoothly
        repaint();
    }

    public void stop() {
        timer.stop();
    }

    public void start() {
        if (!timer.isRunning()) {
            timer.start();
        }
    }
}