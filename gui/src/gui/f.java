package gui;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

 public class myapplet extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b;
	public void init()
	{
	l1=new Label("First Number");
	l2=new Label("Second Number");
	t1=new TextField();
	t2=new TextField();
	b=new Button("Add");
	l3=new Label();
	setLayout(null);
	l1.setBounds(30,50,100,20);
	l2.setBounds(30,100,100,20);
	t1.setBounds(150,50,100,20);
	t2.setBounds(150,100,100,20);
	b.setBounds(100,150,80,20);
	l3.setBounds(30,180,80,20);
	add(l1);
	add(l2);
	add(t1);
	add(t2);
	add(b);
	add(l3);
	b.addActionListener(new MyHandler());
	}
	public class MyHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,r,c;
			a=Integer.parseInt(t1.getText());
			r=Integer.parseInt(t2.getText());
			c=a+r;
			l3.setText("result="+c);
		}
	}
}

