import java.awt.*;
import java.applet.*;
/*
<applet code="App" width ="500" height="500">
<param name=num1 value=10>
<param name=num2 value=30>
<param name=num3 value=20>
</applet>
*/

public class App extends Applet {

String param;
int result;
public void start()
{

param=getParameter("num1");
int val1=Integer.parseInt(param);
param=getParameter("num2");
int val2=Integer.parseInt(param);
param=getParameter("num3");
int val3=Integer.parseInt(param);


if(val1>val2)
{
if(val1>val3)
result=val1;
else
result=val3;
}
else
{
if(val2>val3)
result=val2;
else
result=val3;
}

}

public void paint(Graphics g)
{
g.drawString("Largest is:"+result,40,50);
}
}


