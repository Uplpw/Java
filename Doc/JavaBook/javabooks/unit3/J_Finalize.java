//��飺ʵ���������������

class J_Book{
	public int book_num;
	public J_Book(int i){
		book_num=i;
	}
	protected void finalize(){
		switch (book_num){
			case 1:
				System.out.println("��Ʈ��");
				break;
			case 2:
				System.out.println("��Java������ƽ̡̳�");
				break;
			case 3:
				System.out.println("��������ա�");
				break;
			case 4:
				System.out.println("�����ݿ�ԭ��̡̳�");
				break;
		}
		System.out.println("��Ӧ��ʵ������洢��Ԫ������");
	}
}              //�����洢��Ԫ����
public class J_Finalize{
	public static void main(String args[]){
		J_Book book1=new J_Book(1);//ʵ�����������ñ���ָ�򣬲������������ᱻ����
		new J_Book(2);
		new J_Book(3);
		new J_Book(4);//ʵ������û�����ñ���ָ�����������ᱻ����
		System.gc();
	}
}
