package compile_04;

import java.util.ArrayList;
import java.util.Stack;

public class Tools {
	//终结符的匹配
	public static int isContainVt(ArrayList<SignalVt> list, String str) {
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSignal().equals(str)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	//非终结符的匹配
	public static int isContainVn(ArrayList<SignalVn> list, String str) {
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSignal().equals(str)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	//产生式的匹配
	public static int isContainP(ArrayList<ProduceP> list, String str) {
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getLeftProduce().getSignal().equals(str)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	//数组转为字符串
	public static String ArrayToString(String[] str) {
		String tempStr="";
		for(int i=0;i<str.length;i++) {
			tempStr=tempStr+str[i];
		}
		return tempStr;
	}
	
	//合并list
	public static ArrayList<SignalVt> Merge(ArrayList<SignalVt> list1, ArrayList<SignalVt> list2) {	
		for(int i=0;i<list1.size();i++) {
			if(Tools.isContainVt(list2, list1.get(i).getSignal())==-1) {
				list2.add(list1.get(i));
			}
		}
		return list2;
	}
	
	//取当前栈内容并返回字符串
	public static String stackToString(Stack<String> stack) {
		String returnString="";
		for(int i=0;i<stack.size();i++) {
			returnString=returnString+stack.get(i);
		}
		return returnString;
	}
	
	public static String toStringByIndex(char[] array, int index) {
		String returnString="";
		for(int i=index;i<array.length;i++) {
			returnString=returnString+array[i];
		}
		return returnString;
	}
}
