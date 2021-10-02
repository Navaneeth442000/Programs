class Sample extends Thread{

int a;

Sample(int a)
{
this.a=a;
}

public void run()
{

for(int i=0;i<10;i++)
System.out.println("count:"+i+" thread:"+a);
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}

public class SampleThread{
public static void main(String[] args)
{

Sample s1=new Sample(1);
Sample s2=new Sample(2);
Sample s3=new Sample(3);

s1.start();
s2.start();
s3.start();
}
}