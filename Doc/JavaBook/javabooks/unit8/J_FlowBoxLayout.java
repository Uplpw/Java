//��飺��ϲ��ֹ���������

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class J_FlowBoxLayout {
	public static void main(String[] args){
		JFrame app=new JFrame("��ϲ��ֹ�����");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(220, 150);
		Container c=app.getContentPane();
		
		//c.setLayout(new FlowLayout());
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		//��������������з�ʽ����������С���仯
		
		JPanel[] p=new JPanel[3];
		int i;
		for(i=0;i<3;i++){
			p[i]=new JPanel();
			p[i].setLayout(new BoxLayout(p[i], BoxLayout.X_AXIS));
			c.add(p[i]);
		}
		
		String s;
		JButton b;
		int[] pj={0, 1, 1, 2 , 2, 2};
		for(i=0;i<6;i++){
			s="��ť"+(i+1);
			b=new JButton(s);
			p[pj[i]].add(b);
		}
		app.setVisible(true);
	}
}
