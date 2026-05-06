import java.awt.*;
import java.awt.event.*;
public class Arith extends Frame implements ActionListener
{
public static void main(String args[])
{
    }
Arith f=new Arith();
f.setTitle("Arithmetic");
f.setSize(500, 700);
f.setVisible(true);
   Label l0, l1, l2, l3;
TextField t1, t2, t3;
Button b1, b2, b3,b4,b5;
 Arith() {
   l0 = new Label("Arithmetic Operations");
Font fo=new Font("arial", Font.BOLD, 28);
l0.setFont(fo);
l0.setForeground(Color.RED);
l1 = new Label("Number 1");
l2 = new Label("Number 2"); l3 = new Label("Result");
                       t1 = new TextField(30);
t2 = new TextField(30);
t3 = new TextField(30);
b1 = new Button("Add");
b2 = new Button("Sub");
b3 = new Button("Mul");
b4 = new Button("Div");
b5 = new Button(" ");
add(l0);
l0.setBounds(100, 50, 300, 30);
add(l1);
l1.setBounds(50, 100, 80, 30);
add(t1);
t1.setBounds(150, 100, 100, 30);
l2.setBounds(50, 140, 80, 30);
add(l2);
t2.setBounds(150, 140, 100, 30);
add(t2);
l3.setBounds(50, 180, 80, 30);
add(l3);
t3.setBounds(150, 180, 100, 30);
add(t3);
b1.setBounds(50, 220, 50, 30);            }
b1.addActionListener(this);
add(b1);
b2.setBounds(100, 220, 50, 30);
b2.addActionListener(this);
add(b2);
b3.setBounds(150, 220, 50, 30);
b3.addActionListener(this);
add(b3);
b4.setBounds(200, 220, 50, 30);
b4.addActionListener(this);
add(b4);
add(b5);
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
 {
 String s1=t1.getText();
 String s2=t2.getText();
 int a=Integer.parseInt(s1);
 int b=Integer.parseInt(s2);
 int c=a+b;
 t3.setText(""+c);
 }
if(ae.getSource()==b2)
 {
 String s1=t1.getText();
 String s2=t2.getText();
 int a=Integer.parseInt(s1); int b=Integer.parseInt(s2);
 int c=a-b;
 t3.setText(""+c);
 }
if(ae.getSource()==b3)
 {
 String s1=t1.getText();
 String s2=t2.getText();
 int a=Integer.parseInt(s1);
 int b=Integer.parseInt(s2);
 int c=a*b;
 t3.setText(""+c);
 }
if(ae.getSource()==b4)
 {
 String s1=t1.getText();
 String s2=t2.getText();
 int a=Integer.parseInt(s1);
 int b=Integer.parseInt(s2);
 int c=a/b;
 t3.setText(""+c);
 }
}
}
