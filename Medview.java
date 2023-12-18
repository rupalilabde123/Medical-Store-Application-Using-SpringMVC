package mypack;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medview extends Frame{
	
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3,b4;
	
	public Medview() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		
		l1=new Label("id: ");
		l2=new Label("Tablet Name: ");
		l3=new Label("Company :");
		l4=new Label("Price");
		
		t1=new TextField(30);
		t2=new TextField(30);
		t3=new TextField(30);
		t4=new TextField(30);
		
		b1=new Button("Add");
		b2=new Button("Delete");
		b3=new Button("Update");
		b4=new Button("Clear");
		
		b1.addActionListener(new medicalController(this));
		b2.addActionListener(new medicalController(this));
		b3.addActionListener(new medicalController(this));
		b4.addActionListener(new medicalController(this));
		
		add(l1); add(t1); 
		add(l2); add(t2); 
		add(l3); add(t3); 
		add(l4); add(t4); 
		add(b1); add(b2);		
		add(b3); add(b4); 
		
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
			System.exit(0);
			}
		}
		);	
}
	public static void main(String[] args) {
		new Medview();
	}	
		
}
	
	
	
	


