import java.applet.Applet;
import java.awt.*;
//<applet code="LetterApplet.class" width="500" height="300"></applet>
public class LetterApplet extends Applet implements Runnable {
 int x = 0;
 Thread t;
                  public void init() {
t = new Thread(this);
t.start();
}
public void paint(Graphics g) {
g.setFont(new Font("Arial", Font.BOLD, 40));
g.drawString("GURU", x, 100);
}
public void run() {
while (true) {
x += 5;
if (x > getWidth()) x = 0;
repaint();
try {
Thread.sleep(100);
} catch (Exception e) {}
}
}
}
