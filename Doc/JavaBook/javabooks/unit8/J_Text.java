//��飺�ı��༭����


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class J_Text {
	public static void main(String[] args){
		
		JFrame app=new JFrame("�ı��༭������");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(320,180);
		Container c=app.getContentPane();
		c.setLayout(new FlowLayout());
		
		//�����ı��༭������
		JTextField[] t={
				new JTextField("�����ı�:",8), new JTextField("��ʾ", 15),
				new JTextField("�����ı�:",8), new JPasswordField("��ʾ", 15),
				new JTextField("�����ı�:",8), new JTextField("kpl", 15),
				new JTextField("�����ı�:",8), new JPasswordField("kpllpl", 15)
		}; 
		
		//�����ı��Ƿ���Ա༭
		for(int i=0;i<t.length;i+=2)
			t[i].setEditable(false);
		
		//���ı��༭���������
		for(int i=0;i<t.length;i++)
			c.add(t[i]);
		
		app.setVisible(true);
		
		//�ı��༭��Ĵ���
		/*
		 //�ı��༭��Ĵ���
		 public JTextField()  
		 public JTextField(String text)
		 public JTextField(int columns)
		 public JTextField(String text, int columns)
		 
		 //����ʽ�ı��༭��Ĵ���
		 public JPasswordField()
		 public JPasswordField(String text)
		 public JPasswordField(int columns)
		 public JPasswordField(String text, int columns)
		 
		 ����textָ�����ı��༭����ʾ�ĳ�ʼ�ı���Ϣ
		 ����columnsָ���ı���Ŀ��
		 
		 //��Ա����
		 public String getText()   ��ȡ�ı���Ϣ
		 
		 public String setText(String s)   �����ı���Ϣ  s
		 */
	}
}
