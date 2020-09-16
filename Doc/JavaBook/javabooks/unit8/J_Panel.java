import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

//import com.sun.xml.internal.ws.api.server.Container;
import java.awt.*;

public class J_Panel {

	public static void main(String[] args){
		JFrame f=new JFrame("Panel");
		java.awt.Container c=f.getContentPane();
		c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(320, 210);
		
		Panel[] p=new Panel[2];
		for(int i=0;i<2;i++){
			p[i]=new Panel();
			p[i].setBackground(Color.gray);
			//p[i].setVisible(true);
		}
		
		//p[0].setLocation(0,50);
		p[0].setPreferredSize(new Dimension(240,40));
		p[0].setLayout(new FlowLayout());
		TextField textField = new TextField(30);
		p[0].add(textField);
		f.add(p[0]);
		
		//p[1].setLocation(100,150);
		p[1].setPreferredSize(new Dimension(120,120));
		GridLayout gl1=new GridLayout(5,5);
		p[1].setLayout(gl1);
		
		p[1].add(new Button("sin"));
		p[1].add(new Button("cos"));
		p[1].add(new Button("CE"));
		p[1].add(new Button("DE"));
		p[1].add(new Button("+"));
		
		p[1].add(new Button("log"));
		p[1].add(new Button("7"));
		p[1].add(new Button("8"));
		p[1].add(new Button("9"));
		p[1].add(new Button("-"));
		
		p[1].add(new Button("x*y"));
		p[1].add(new Button("4"));
		p[1].add(new Button("5"));
		p[1].add(new Button("6"));
		p[1].add(new Button("*"));

		p[1].add(new Button("¡Ì"));
		p[1].add(new Button("1"));
		p[1].add(new Button("2"));
		p[1].add(new Button("3"));
		p[1].add(new Button("/"));
		
		p[1].add(new Button("1/x"));	
		p[1].add(new Button("+/-"));
		p[1].add(new Button("0"));
		p[1].add(new Button("."));
		p[1].add(new Button("="));
		f.add(p[1]);
		f.setVisible(true);
	}
}
