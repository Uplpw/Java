//简介: 枚举例程


enum E_SEASON{
	春季, 夏季, 秋季, 冬季;
}
public class J_Enum {
	public static void main(String args[]){
		E_SEASON[] sa=E_SEASON.values();
		for(int i=0;i<sa.length;i++){
			switch(sa[i]){
			case 春季:  //不能写作 case E_SEASON.春季 或 sa[i].春季 
				System.out.println("春季花满天");
				break;
			case 夏季:
				System.out.println("夏季热无边");
				break;
			case 秋季:
				System.out.println("秋季果累累");
				break;
			case 冬季:
				System.out.println("冬季雪皑皑");
				break;
			}
		}
		
		/*枚举常量在switch语句中的用法特殊，如果switch表达式的类型是枚举类型，
			作为switch语句各个分支值的枚举常量前面不能加点运算符“.”,
			应该直接使用枚举常量标识符*/
	}
}
