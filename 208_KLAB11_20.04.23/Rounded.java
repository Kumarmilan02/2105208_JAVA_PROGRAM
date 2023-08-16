import java.awt.*;
import java.applet.*;

public class Rounded extends Applet 
{
    public void paint(Graphics g) 
    {
        Graphics2D g2d = (Graphics2D) g;

        int x = 50; // x-coordinate of top-left corner of rectangle
        int y = 50; // y-coordinate of top-left corner of rectangle
        int width = 100; // width of rectangle
        int height = 50; // height of rectangle
        int arcWidth = 20; // width of arc for rounded corners
        int arcHeight = 20; // height of arc for rounded corners

        //g2d.setColor(Color.BLUE); // set color of rectangle
        g2d.fillRoundRect(x, y, width, height, arcWidth, arcHeight); // draw rounded rectangle
    }
}
/* <applet code="Rounded.class" width="400" height="400">
   </applet>
*/
