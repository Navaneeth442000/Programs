import java.awt.*;
import java.applet.*;
/*
<applet code="Arcs" width=300 height=200>
</applet>
*/
public class Arcs extends Applet {
       public void paint(Graphics g) {
       g.fillArc( 10, 40, 70, 70, 90, 270);
       g.fillArc( 50, 100, 70, 70, 90, -270);
       }
}