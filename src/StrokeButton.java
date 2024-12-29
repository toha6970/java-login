import javax.swing.JButton;
import java.awt.*;
public class StrokeButton extends JButton{
    
    public StrokeButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the border (stroke)
        g2.setColor(Color.CYAN); // Border color
        g2.setStroke(new BasicStroke(2)); // Border thickness
        g2.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 4, getHeight(), getHeight());

        // Draw the button text
        g2.setColor(getForeground());
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = ((getHeight() + fm.getAscent() - fm.getDescent()) / 2) - 2;
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(120, 40);
    }
}
