//��飺�ڿ������ӱ�ǩ


import java.awt.*;
import javax.swing.*;
public class J_LabelFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//����Frame������J_LabelFrame
	public J_LabelFrame(){
		String[] s={"�ı���ǩ","�ı���ͼ������","�ı���ͼ����·�"};
		//���ñ�ǩ����������
		
		ImageIcon[] ic={null, new ImageIcon("img.jpg"), new ImageIcon("img.jpg")};
		//���ñ�ǩ��ͼ��/��Ƭ
		
		int ih[]={0, JLabel.LEFT, JLabel.CENTER};
		int iv[]={0, JLabel.CENTER, JLabel.BOTTOM};
		//���ñ�ǩͼ����������ݵĶ�Ӧ��ʽ
		
		Container c=getContentPane();//��ȡ���������ݴ����Ա�������
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		//����   ����/���   �Ĳ��ַ�ʽ
		
		for(int i=0;i<3;i++){
			JLabel aLabel=new JLabel(s[i],ic[i],JLabel.LEFT);
			if(i>0){
				aLabel.setHorizontalTextPosition(ih[i]);//ˮƽ������뷽ʽ
				aLabel.setVerticalTextPosition(iv[i]);//��ֱ������뷽ʽ
			}
			aLabel.setToolTipText("��"+(i+1)+"����ǩ");
			
			c.add(aLabel);
			//����ǩ�����ӵ�   ����/���   ��
		}
		//���ñ�ǩ�����Ա�ǩ���в���
	}
	
	public static void main(String[] args){
		J_LabelFrame app=new J_LabelFrame();
		//����   ����/���   ����ʵ��
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ø�   ����/���   ���Թر�
		
		app.setSize(360,150);//���ô�С
		app.setVisible(true);//�����Ƿ�ɼ�
	}
}
