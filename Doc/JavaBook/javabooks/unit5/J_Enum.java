//���: ö������


enum E_SEASON{
	����, �ļ�, �＾, ����;
}
public class J_Enum {
	public static void main(String args[]){
		E_SEASON[] sa=E_SEASON.values();
		for(int i=0;i<sa.length;i++){
			switch(sa[i]){
			case ����:  //����д�� case E_SEASON.���� �� sa[i].���� 
				System.out.println("����������");
				break;
			case �ļ�:
				System.out.println("�ļ����ޱ�");
				break;
			case �＾:
				System.out.println("�＾������");
				break;
			case ����:
				System.out.println("����ѩ����");
				break;
			}
		}
		
		/*ö�ٳ�����switch����е��÷����⣬���switch���ʽ��������ö�����ͣ�
			��Ϊswitch��������ֵ֧��ö�ٳ���ǰ�治�ܼӵ��������.��,
			Ӧ��ֱ��ʹ��ö�ٳ�����ʶ��*/
	}
}
