//��飺for���ļ�д�������������е�Ӧ������


public class J_Example {
	public static void main(String[] args){
		int[] a={10,20,30,40,50};
		int s=0;
		for(int c : a)
			s+=c;
		System.out.println(s);//��д��
		
		s=0;
		int ss=0;
		for(int i=0;i<a.length;i++){
			s+=i;
			ss+=a[i];
		}
		System.out.println(s+", "+ss);//����д��
	}
}
