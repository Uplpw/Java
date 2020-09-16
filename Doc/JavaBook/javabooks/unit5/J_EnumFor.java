//简介：第二类for语句的简化写法例程,for语句在枚举类型数组中应用例程


enum E_SEASON1{
	春季, 夏季, 秋季, 冬季;
}
public class J_EnumFor {
	public static void main(String[] args){
		for(E_SEASON1 c : E_SEASON1.values())//获得枚举所有变量
			System.out.print(c+", ");
		//简化写法
		System.out.println();
		
		E_SEASON1[] ca=E_SEASON1.values();
		for(int i=0;i<ca.length;i++){
			E_SEASON1 c=ca[i];
			System.out.print(c+", ");
		}//完整写法
		System.out.println();
	}
}
