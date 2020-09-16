/**
 * 
 */
package compile_04;

import java.util.Stack;

/**
 * @author lpw
 *
 */
public class lib {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("123");
		stack.push("12");
		System.out.println(Tools.stackToString(stack));
	}
}
