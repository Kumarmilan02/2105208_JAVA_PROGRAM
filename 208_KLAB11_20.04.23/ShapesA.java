//write a applet  program to draw a straight line, 
//a rectangle, square, rounded rectangle, circle, and 
//filled circle and an arc and give them different color

import java.awt.*;
import java.applet.*;

public class ShapesA extends Applet 
{
    public void paint(Graphics g) 
    {
        // Draw the line
        g.setColor(Color.RED); 
        g.drawLine(10, 10, 100, 10);
        
        // Draw the rectangle
        g.setColor(Color.BLUE);
        g.drawRect(10, 20, 90, 50);
        
        // Draw the square
        g.setColor(Color.GREEN); 
        g.drawRect(10, 80, 50, 50);
        
        // Draw the rounded rectangle
        g.setColor(Color.ORANGE);
        g.drawRoundRect(10, 140, 90, 50, 20, 20);
        
        // Draw the circle
        g.setColor(Color.MAGENTA);
        g.drawOval(10, 210, 80, 80);
        
        // Draw the filled circle
         g.setColor(Color.YELLOW);
        g.fillOval(120, 10, 80, 80);
        
        // Draw the arc
        g.setColor(Color.PINK);
        g.drawArc(120, 110, 80, 80, 45, 90);
    }
}
/* <applet code="ShapesA.class" width="400" height="400">
   </applet>
*/