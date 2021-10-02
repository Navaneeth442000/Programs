import java.awt.*;
import java.applet.*;
/* <applet code="Greater" width ="500" height="500">
<param name=num1 value=10>
<param name=num2 value=30>
<param name=num3 value=20>
</applet>

*/

public class Greater extends Applet {

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


int max=(val1>val2)?(val1>val3?val1:val3):(val2>val3?val2:val3);

result=max;

}

public void paint(Graphics g)
{
g.drawString("Largest is:"+result,40,50);
}
}


