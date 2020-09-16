/**
 * 
 */
package compile_06;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author lpw
 *
 */

/*
 * 需要总控程序、分析表、分析栈（设计两个为佳）  实质上是一个带栈的确定有限状态自动机
 * 核心：	分析表的建立较困难     (ACTION+GOTO)，为二维表结构。
		GOTO[Si, X] 规定了状态 Si 面临文法符号 X∈VN∪VT 时，应转移到的下一状态。
		ACTION[Sj, a] 规定了当状态 Sj (行标)面临输入符号 a(列标)时应执行的动作。有移进、归约、接受和报错四种动作
 * 
 */
public class test {
	public static void main(String[] args) {
		/*StringBuffer stringBuilder1=new StringBuffer("123");
		stringBuilder1.insert(4, ".");
		System.out.println(stringBuilder1.toString());*/
		String l=""+123+" "+0;
		System.out.println(l);
		System.out.println(l instanceof String);
		
	}
}
