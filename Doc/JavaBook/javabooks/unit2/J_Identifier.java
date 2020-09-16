public class J_Identifier{
	public static void main(String args[]){
		char c='$';
		if(Character.isJavaIdentifierStart(c))
		  System.out.println("字符\'"+c+"\'可以做标识符的首字符");
		else
		  System.out.println("字符\'"+c+"\'不可以做标识符的首字符");
		if(Character.isJavaIdentifierPart(c))
		  System.out.println("字符\'"+c+"\'可以做标识符的组成字符");
		else
		  System.out.println("字符\'"+c+"\'不可以做标识符的组成字符");
		
		//boolean Character.isJavaIdentifierStart(char ch);
	}
}