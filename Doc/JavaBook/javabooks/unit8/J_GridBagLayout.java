//��飺��������ֹ���������

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_GridBagLayout {
	public static void main(String[] args){
		JFrame app=new JFrame("��������ֹ�����");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(320,160);
		Container c=app.getContentPane();
		GridBagLayout gr=new GridBagLayout();
		c.setLayout(gr);
		
		//�����������
		int[] gx={0, 1, 2, 3, 1, 0, 0, 2};
		int[] gy={0, 0, 0, 0, 1, 2, 3, 2};
		
		//��������Ĵ�С
		int[] gw={1, 1, 1, 1, GridBagConstraints.REMAINDER, 2, 2, 2};
		int[] gh={2, 1, 1, 1, 1, 1, 1, 2};
		
		GridBagConstraints gc=new GridBagConstraints();
		String s;
		JButton b;
		for(int i=0;i<gx.length;i++){
			s="��ť"+(i+1);
			b=new JButton(s);
			
			//�������꣬�ڣ�gridx+1����/�ڣ�gridy+1����
			gc.gridx=gx[i];
			gc.gridy=gy[i];
			
			gc.gridwidth=gw[i];
			gc.gridheight=gh[i];
			
			gc.fill=GridBagConstraints.BOTH;
			//���ģʽ��ͬʱ��������Ŀ�Ⱥ͸߶�ʹ�������ȫ����ָ��������
			
			gr.setConstraints(b, gc);
			//��������Լ��
			
			c.add(b);
		}
		app.setVisible(true);
	}
}
