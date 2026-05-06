import java.awt.*;
import java.applet.*;
//<applet code="Move.class" width="800" height="400"></applet>
public class Move extends Applet
{
                public void paint(Graphics g)
{
try
{
for (int i = 10; i <= 500; i = i + 20)
{
Font f0 = new Font("Arial", Font.BOLD, 50);
g.setFont(f0);
g.setColor(Color.BLACK);
g.fillRect(0, 0, 800, 400);
g.setColor(Color.YELLOW);
g.drawString("GURU", 100, 100);
Thread.sleep(1000);
g.setColor(Color.BLACK);
g.fillRect(0, 0, 500, 500);
g.setColor(Color.WHITE);      g.drawString("BCA DEPARTMENT", 100, 100);
Thread.sleep(1000);
}
}
catch (Exception e){}
}
}
