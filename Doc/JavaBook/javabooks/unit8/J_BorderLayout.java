//��飺�߽粼�ֹ���������

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class J_BorderLayout {
	public static void main(String args[]){
		JFrame app=new JFrame("�߽粼�ֹ�����");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(360,200);
		Container c=app.getContentPane();
		
		c.setLayout(new BorderLayout(10,10));
		//�����ʡ�ԣ���ΪJFrameĬ�ϱ߽粼�ֹ�����
		
		c.add(new JButton("��"), BorderLayout.EAST);
		c.add(new JButton("��"), BorderLayout.WEST);
		c.add(new JButton("��"), BorderLayout.SOUTH);
		c.add(new JButton("��"), BorderLayout.NORTH);
		
		//��߽粼������������λ��������
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		for(int i=0;i<5;i++){
			JButton bb=new JButton("***");
			p.add(bb);
		}
		
		c.add(p, BorderLayout.CENTER);
		app.setVisible(true);
		
		//���ֹ������Ĵ���
		/*
		 * public BorderLayout(int hgap, int vgap)
		 * ����hgap��vgapָ���������������ˮƽ��϶����ֱ��϶����������Ĭ��Ϊ0
		 */
	}
}
