//简介：实例对象的生命周期

class J_Book{
	public int book_num;
	public J_Book(int i){
		book_num=i;
	}
	protected void finalize(){
		switch (book_num){
			case 1:
				System.out.println("《飘》");
				break;
			case 2:
				System.out.println("《Java程序设计教程》");
				break;
			case 3:
				System.out.println("《罗马假日》");
				break;
			case 4:
				System.out.println("《数据库原理教程》");
				break;
		}
		System.out.println("对应的实例对象存储单元被回收");
	}
}              //垃圾存储单元回收
public class J_Finalize{
	public static void main(String args[]){
		J_Book book1=new J_Book(1);//实例对象有引用变量指向，不是垃圾，不会被回收
		new J_Book(2);
		new J_Book(3);
		new J_Book(4);//实例对象没有引用变量指向，是垃圾，会被回收
		System.gc();
	}
}
