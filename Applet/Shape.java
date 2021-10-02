import java.awt.*;
import java.applet.*;
import java.awt.event

/*
<applet code="Shape" width=500 height=500>
</applet>
*/

public class Shape extends Applet{

public void paint(Graphics g)
{

g.setColor(Color.red);
g.fillOval(50,50,20,20);
g.fillOval(90,50,20,20);
g.drawArc(53,65,53,53,180,180);
g.drawOval(20,20,120,120);



g.fillOval(150,150,20,20);
g.fillOval(190,150,20,20);
g.drawArc(153,178,53,53,180,-180);
g.drawOval(120,120,120,120);

int []x={250,300,350};
int []y={100,20,100};
g.drawPolygon(x,y,3);


int []x1={250,250,350,350};
int []y1={100,200,100,200};
g.drawPolygon(x1,y1,2);
g.drawLine(250,200,350,200);
g.drawLine(350,200,350,100);
g.drawRect(285,150,30,50);
}
}