//��飺���񲼾ֹ���������


import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_GridLayout {
	public static void main(String[] args){
		JFrame app=new JFrame("���񲼾ֹ�����");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(520,120);
		Container c=app.getContentPane();
		c.setLayout(new GridLayout(2,3));
		String s;
		JButton b;
		for(int i=0;i<5;i++){
			s="��ť"+(i+1);
			b=new JButton(s);
			c.add(b);
		}
		app.setVisible(true);
		
		//���񲼾ֹ������Ĵ���
		/*
		 * public GridLayout(int row, int col, int hgap, int vgap)
		 * 
		 * ����row��colָ�������������������������������Ĭ��Ϊ1
		 * ����hgap��vgapָ���������������ˮƽ��϶����ֱ��϶����������Ĭ��Ϊ0
		 */
		
		//�����ֹ������Ĵ���
		/*
		 * public FlowLayout(int align, int hgap, int vgap)
		 * 
		 * ����alignָ�����뷽ʽ������룬�ж��룬�Ҷ��룩��������������Ĭ��Ϊ�ж���
		 * ����hgap��vgapָ���������������ˮƽ��϶����ֱ��϶����������Ĭ��Ϊ5
		 */
	}
}
