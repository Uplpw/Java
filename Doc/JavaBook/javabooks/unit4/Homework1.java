//���: ����Ϊ�ַ����ķ�����������


public class Homework1 {
	public static void mb_operate(String x, String y){
		x.concat(y);
		y=x;
	}
	public static void main(String[] args){
		String a="A";
		String b="B";
		mb_operate(a,b);  //�������ͷ������ò���ı�ԭ����ֵ
		System.out.println(a+"."+b);
	}
}
