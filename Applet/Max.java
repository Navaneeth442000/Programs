import java.awt.*;
import java.applet.*;
/*
<applet code="Max" width=300 height=80>
<param name=num1 value=10>
<param name=num2 value=20>
<param name=num3 value=5>
</applet>
*/
public class Max extends Applet
{
String param;
int res;
int temp;
public void start()
{
param=getParameter("num1");
int val1=Integer.parseInt(param);
param=getParameter("num2");
int val2=Integer.parseInt(param);
param=getParameter("num3");
int val3=Integer.parseInt(param);

temp=val1>val2?val1:val2;
res=val3>temp?val3:temp;
}
public void paint(Graphics g)
{
g.drawString("maximum of 3 numbers is"+res,10,20);
}
}