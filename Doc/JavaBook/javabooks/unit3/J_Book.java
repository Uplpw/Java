//���: ������ĳ�Ա��ͳ�Ա�����ľ�̬������Ǿ�̬���Ե�����

class Book{
	public int m_id;       //
	public static int m_booknumber;
	
	public Book(){
		m_booknumber++;
	}//Book���췽������
	
	public void mb_info(){
		System.out.println("��ǰ��ı��:"+m_id);
	}//����mb_info����
	
	public static void mb_infoStatic(){
		System.out.println("���������:"+m_booknumber);
	}//����mb_infoStatic����
}
public class J_Book {
	public static void main(String[] args){
		Book book1=new Book();
		Book book2=new Book();         //����Book����
		
		book1.m_id=10001;
		book2.m_id=20001;              //��ֵ
		
		System.out.print("book1��Ӧ��");
		book1.mb_info();
		System.out.print("book2��Ӧ��");
		book2.mb_info();
		
		Book.mb_infoStatic();
		
		System.out.println("�Ƚϣ�book1.m_booknumber==Book.m_booknumber���Ľ����:"
							+(book1.m_booknumber==Book.m_booknumber));
		System.out.println("�Ƚϣ�book2.m_booknumber==Book.m_booknumber���Ľ����:"
				+(book2.m_booknumber==Book.m_booknumber));
	}
}
