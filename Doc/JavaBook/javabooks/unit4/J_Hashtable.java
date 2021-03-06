//简介: 通过哈希表形成数组下标与值之间的双向映射

import java.util.Hashtable;
public class J_Hashtable {
	public static void main(String[] args){
		String[] sa={"Mary","Tom","John","James","Louis","Jim","Rose","Ann","Liza",
					"Betty","Henry","Albert"};
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		
		//往哈希表中添加元素,并使得关键字与值之间建立起联系
		int i;
		for(i=0;i<sa.length;i++)
			ht.put(sa[i], new Integer(i));
		
		//通过下标获得字符串值
		i=8;
		System.out.println("在sa数组中,下标为"+i+"的字符串是\""+sa[i]+"\"");
		
		//通过哈希表,直接获得字符串数组的下标
		String s=sa[i];
		System.out.println("在sa数组中,\""+s+"\"的下标是"+ht.get(s));
		
	}
}
