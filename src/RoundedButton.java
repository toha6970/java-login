import javax.swing.JButton;
import java.awt.*;
public class RoundedButton extends JButton{
    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the button background
        if (getModel().isPressed()) {
            g2.setColor(Color.LIGHT_GRAY);
        } else {
            g2.setColor(Color.CYAN);
        }
        g2.fillRoundRect(0, 0, getWidth()-2, getHeight()-4, getHeight(), getHeight());
        
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
