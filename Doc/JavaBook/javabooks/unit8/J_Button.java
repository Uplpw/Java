//��飺����ʽ��ť����ѡ��͵�ѡ��ť����


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;    //��ѡ��ť��
import javax.swing.ImageIcon;
import javax.swing.JButton;       //����ʽ��ť
import javax.swing.JCheckBox;    //��ѡ����
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class J_Button extends JFrame{
	public J_Button(){
		
		super("��ť����");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		int i;
		//��������ʽ��ť����ӵ������
		ImageIcon[] ic={new ImageIcon("left.gif"), new ImageIcon("right.gif")};
		JButton[] b={new JButton("��", ic[0]), new JButton("�м�"), 
										new JButton("��", ic[1])};
		for(i=0;i<b.length;i++)
			c.add(b[i]);
		
		//������ѡ����ӵ������
		JCheckBox[] ck={new JCheckBox("��"), new JCheckBox("��")};
		for(i=0;i<ck.length;i++){
			c.add(ck[i]);
			ck[i].setSelected(true);  //����ѡ��״̬
		}
		
		//������ѡ��ť����ӵ������
		//��ѡ��ť������ͨ����ť��ButtonGroupʵ��
		JRadioButton[] r={new JRadioButton("��"), new JRadioButton("��")};
		ButtonGroup rg=new ButtonGroup();
		for(i=0;i<r.length;i++){
			c.add(r[i]);
			rg.add(r[i]);   //��ѡ��ť������ʵ�֣�����ѡ��ť��ӵ���ť����
		}
		r[0].setSelected(true); //����ѡ��״̬
		r[1].setSelected(true);
		
		
		//����ʽ��ť�Ĵ���
		/*
		 * public JButton()
		 * public JButton(Icon icon)
		 * public JButton(String text)
		 * public JButton(String text, Icon icon)
		 * 
		 * ����iconָ������ʽ��ť��ͼ��, ��û���򲻺�ͼ��
		 * ����textָ������ʽ��ť���ı���Ϣ, ��û���򲻺��ı���Ϣ
		 * 
		 */
		
		
		//��ѡ��Ĵ���
		/*
		 * public JCheckBox()
		 * public JCheckBox(Icon icon)
		 * public JCheckBox(Icon icon, boolean selected)
		 * public JCheckBox(String text)
		 * public JCheckBox(String text, boolean selected)
		 * public JCheckBox(String text, Icon icon)
		 * public JCheckBox(String text, Icon icon, boolean selected)
		 * 
		 * ����iconָ����ѡ���ͼ��, ��û���򲻺�ͼ��
		 * ����textָ����ѡ����ı���Ϣ, ��û���򲻺��ı���Ϣ
		 * ����selectedΪtrueʱָ����ѡ���Ƿ��ڱ�ѡ��״̬,������δѡ��״̬
		 * 
		 */
		
		
		//��ѡ��ť�Ĵ���
		/*
		 * public JRadioButton()
		 * public JRadioButton(Icon icon)
		 * public JRadioButton(Icon icon, boolean selected)
		 * public JRadioButton(String text)
		 * public JRadioButton(String text, boolean selected)
		 * public JRadioButton(String text, Icon icon)
		 * public JRadioButton(String text, Icon icon, boolean selected)
		 * 
		 * ����icon\selected\text������ͬ
		 */
	}
	
	public static void main(String[] args){
		
		J_Button app=new J_Button();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(200, 120);
		app.setVisible(true);
		
	}
}


