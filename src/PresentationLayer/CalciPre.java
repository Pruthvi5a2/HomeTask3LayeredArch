package PresentationLayer;
import javax.swing.*;

import java.awt.TextField;
import java.awt.event.*;
import BussinessLayer.ArithematicOp;
public class CalciPre implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3;
	TextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	CalciPre()
	{
		f=new JFrame();
		l1=new JLabel("First Number");
		l2=new JLabel("Second Number");
		l3=new JLabel("Result");
		
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		b5=new JButton("Exit");
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		b5.setBounds(290,250,50,20);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		ArithematicOp Ap=new ArithematicOp();
		String a=t1.getText();
		String b=t2.getText();
		if(a.equals("")||b.equals(""))
			JOptionPane.showMessageDialog(null,"Enter Correct Numbers");
		else
		{
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			
		if(e.getSource()==b1)
		{
			t3.setText(String.valueOf(Ap.add(n1,n2)));
			t1.setText("");
			t2.setText("");
		}
		else if(e.getSource()==b2)
		{
			t3.setText(String.valueOf(Ap.sub(n1,n2)));
			t1.setText("");
			t2.setText("");
		}
		else if(e.getSource()==b3)
		{
			t3.setText(String.valueOf(Ap.mul(n1,n2)));
			t1.setText("");
			t2.setText("");
		}
		else if(e.getSource()==b4)
		{
			t3.setText(String.valueOf(Ap.div(n1,n2)));
			t1.setText("");
			t2.setText("");
		}
		else if(e.getSource()==b5)
		{
			System.exit(0);
		}
		}
	}
	public static void main(String p[])
	{
		new CalciPre();
	}
}
