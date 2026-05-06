import java.awt.*;
import java.applet.*;
//<applet code="Moving.class" width="500" height="500"></applet>
public class Moving extends Applet
{
               public void paint(Graphics g)
{
try
{
for (int i = 10; i <= 500; i = i + 20)
{
g.setColor(Color.BLACK);
g.fillRect(0, 0, 500, 500);
g.setColor(Color.RED);
g.fillOval(i, 10, 100, 100);
Thread.sleep(1000);
}
}
catch (Exception e){} 
}
}
