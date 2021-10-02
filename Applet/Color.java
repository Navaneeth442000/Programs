import java.applet.*;
import java.awt.*;

/*
<applet code="Color" width="200" height="200">
</applet>
*/

public class Color extends Applet{

   public void paint(Graphics g){
   g.drawOval(70,30,100,100);
   g.fillOval(100,100,100,100);
   g.fillRect(30,50,30,50);
   g.drawLine(25,25,200,25);

}
}