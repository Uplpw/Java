import java.util.Vector;


class MyVector{
	public int find(Vector<String> vs, String s){
		int i;
		for(i=0;i<vs.size();i++){
			if(vs.indexOf(s)>=0)
				return vs.indexOf(s);
		}
		return -1;
	}
	public boolean delete(Vector<String> vs, String s){
		int i;
		for(i=0;i<vs.size();i++){
			if(vs.indexOf(s)>=0){
				vs.remove(vs.indexOf(s));
				return true;
			}
		}
		return false;
	}
}
public class VectorExample {
	public static void main(String[] args){
		int initialcapacity=10;
		Vector<String> vs=new Vector<String>(initialcapacity);
		vs.add("5");
		vs.add("3.14");
		vs.add("Hi there!");
		vs.add("abcd");
		MyVector mv=new MyVector();
		System.out.println(mv.find(vs,"3.14"));
		System.out.println(mv.delete(vs, "abcd"));
		System.out.println(mv.find(vs,"abcd"));
	}
}