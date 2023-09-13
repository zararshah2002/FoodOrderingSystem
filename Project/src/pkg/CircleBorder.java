package pkg;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

public class CircleBorder extends AbstractBorder {
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.BLACK);  // Set the border color here
        
        // Calculate the radius for the circle (half of the button's width or height)
        int radius = Math.min(width, height) / 2;
        
        // Calculate the center of the circle
        int centerX = x + width / 2 - radius;
        int centerY = y + height / 2 - radius;
        
        // Draw the circle border
        g.drawOval(centerX, centerY, radius * 2, radius * 2);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(c.getHeight() / 2, c.getWidth() / 2, c.getHeight() / 2, c.getWidth() / 2);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        int padding = Math.min(c.getWidth(), c.getHeight()) / 2;
        insets.left = insets.top = insets.right = insets.bottom = padding;
        return insets;
    }
}
