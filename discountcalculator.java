import java.awt.*;
import java.awt.event.*;

class Assignment3 extends Frame implements ActionListener
{
 Label l1,l2,l3,l4,l5,l6;
 TextField t1,t2;
 Button b1,b2;
 Assignment3()
 {
   super("Price");
   setLayout(null);
   setSize(500,400);
   setVisible(true);
   l1=new Label("Enter price:");
   l2=new Label("Enter discount % :");
   l3=new Label("The Price is:");
   l4=new Label("The Price is with Gst 12.5%:");
   l5=new Label(null);
   l6=new Label(null);
   t1=new TextField();
   t2=new TextField();
   b1=new Button("Calculate");
   b2=new Button("Clear");
   l1.setBounds(100,50,120,20);
   add(l1);
   t1.setBounds(240,50,50,20);
   add(t1);
   l2.setBounds(100,80,130,20);
   add(l2);
   t2.setBounds(240,80,50,20);
   add(t2);
   l3.setBounds(100,110,100,20);
   add(l3);
   l4.setBounds(100,130,160,20);
   add(l4);
   l5.setBounds(210,110,60,20);
   add(l5);
   l6.setBounds(210,110,60,20);
   add(l6);
   b1.setBounds(200,150,50,20);
   add(b1);
   b2.setBounds(270,150,50,20);
   add(b2);
   b1.addActionListener(this);
   b2.addActionListener(this);
  
   addWindowListener( new WindowAdapter() {
    public void windowClosing(WindowEvent we)
    {
     System.exit(0);
    }
   });
 }

 public void actionPerformed(ActionEvent ae)
 {
  float a,b,c;
  if(ae.getSource()==b1)
  {
   a=Float.parseFloat(t1.getText().trim());
   b=Float.parseFloat(t2.getText().trim());
   c=a*b/100;
   l5.setText(Float.toString(c));
   /* I dont know why it wont output on the next label */
   a=Float.parseFloat(t1.getText().trim());
   b=Float.parseFloat(t2.getText().trim());
   c=(float) (a*b*12.5/100);
   l6.setText(Float.toString(c));
   }
  else
  {
   t1.setText(null);
   t2.setText(null);
   l5.setText(null);
   l6.setText(null);
  }
 }

 public static void main(String s[])
 {
  Assignment3 ob=new Assignment3();
 }
}
