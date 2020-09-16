package compile_04;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.add("12");
		stack.add("123");
		stack.add("12345");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		if(stack.isEmpty()) {
			System.out.println("kong1");
		}
		
		
		String s="A->asasa";
		System.out.println(s.substring(3, s.length()));
	}
}
