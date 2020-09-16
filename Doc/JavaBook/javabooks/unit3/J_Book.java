//简介: 关于书的成员域和成员方法的静态属性与非静态属性的例程

class Book{
	public int m_id;       //
	public static int m_booknumber;
	
	public Book(){
		m_booknumber++;
	}//Book构造方法结束
	
	public void mb_info(){
		System.out.println("当前书的编号:"+m_id);
	}//方法mb_info结束
	
	public static void mb_infoStatic(){
		System.out.println("书的总数是:"+m_booknumber);
	}//方法mb_infoStatic结束
}
public class J_Book {
	public static void main(String[] args){
		Book book1=new Book();
		Book book2=new Book();         //创建Book对象
		
		book1.m_id=10001;
		book2.m_id=20001;              //赋值
		
		System.out.print("book1对应的");
		book1.mb_info();
		System.out.print("book2对应的");
		book2.mb_info();
		
		Book.mb_infoStatic();
		
		System.out.println("比较（book1.m_booknumber==Book.m_booknumber）的结果是:"
							+(book1.m_booknumber==Book.m_booknumber));
		System.out.println("比较（book2.m_booknumber==Book.m_booknumber）的结果是:"
				+(book2.m_booknumber==Book.m_booknumber));
	}
}
