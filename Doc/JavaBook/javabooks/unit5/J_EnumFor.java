//��飺�ڶ���for���ļ�д������,for�����ö������������Ӧ������


enum E_SEASON1{
	����, �ļ�, �＾, ����;
}
public class J_EnumFor {
	public static void main(String[] args){
		for(E_SEASON1 c : E_SEASON1.values())//���ö�����б���
			System.out.print(c+", ");
		//��д��
		System.out.println();
		
		E_SEASON1[] ca=E_SEASON1.values();
		for(int i=0;i<ca.length;i++){
			E_SEASON1 c=ca[i];
			System.out.print(c+", ");
		}//����д��
		System.out.println();
	}
}
