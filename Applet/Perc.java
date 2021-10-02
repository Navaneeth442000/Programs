import java.awt.*;
import java.applet.*;
/*
<applet code="Perc" width=300 height=80>
</applet>
*/
public class Perc extends Applet 
{
TextField m1,m2,m3,m4,m5;
public void init()
{
m1 = new TextField(10);
m2 = new TextField(10);
m3 = new TextField(10);
m4 = new TextField(10);
m5 = new TextField(10);
add(m1);
add(m2);
add(m3);
add(m4);
add(m5);
}
public void paint(Graphics g)
{
int a,b,c,d,e;
float total,percentage;
String str;
str=m1.getText();
a=Integer.parseInt(str);
str=m2.getText();
b=Integer.parseInt(str);
str=m3.getText();
c=Integer.parseInt(str);
str=m4.getText();
d=Integer.parseInt(str);
str=m5.getText();
e=Integer.parseInt(str);
total=a+b+c+d+e;
percentage=(total*100)/500;
g.drawString("Total  " + total, 20, 10);
g.drawString("Percentage  " + percentage, 20, 30);
if(percentage>50)
{
g.drawOval(150,10,50,50);
g.fillOval(160,20,10,10);
g.fillOval(180,20,10,10);
g.drawArc(160,25,30,20,180,180);
}
else
{
g.drawOval(150,10,50,50);
g.fillOval(160,20,10,10);
g.fillOval(180,20,10,10);
g.drawArc(160,35,30,20,0,180);
}
}
}