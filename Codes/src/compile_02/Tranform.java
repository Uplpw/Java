package compile_02;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 状态转换类Tranform
 */
public class Tranform {
	private HashMap<Integer, String[]> listState=new HashMap<Integer, String[]>();  //映射状态集合listState
	
	/*
	 * 方法setTranform(),设置状态属性集合listState
	 * 参数：转换式集合、状态集合、字符集合
	 */
	public void setTranform(String[] str, ArrayList<Condition> listCondition, ArrayList<Letter> listLetter) {
		/*
		 * 创建状态属性数组,大小为状态集合与字符集合大小的乘积
		 */
		
		for(int i=0;i<str.length;i++) {
			int indexCon = 0, indexLetter = 0;
			String[] string=str[i].split(" ");
			//查询状态在listCondition中的下标str
			for(int k=0;k<listCondition.size();k++) {
				
				if(string[0].equals(listCondition.get(k).getCharacter())) {
					indexCon=k;
				}
			}
			//查询字符在listLetter中的下标
			for(int k=0;k<listLetter.size();k++) {
				if(string[1].equals(listLetter.get(k).getCharacter())) {
					indexLetter=k;
				}
			}
			//为状态和字符对应的listState赋值
			String[] tempStr=string[2].split(",");
			this.listState.put(indexCon*listLetter.size()+indexLetter, tempStr);
			//System.out.println(this.listState.get(i)[0]);
		}
	}
	
	public HashMap<Integer, String[]> getListState(){
		return this.listState;
	}
	/*
	 * 方法showTranform,输出整个转换矩阵
	 * 参数：listCondition、listLetter
	 */
	public void showTranform(ArrayList<Condition> listCondition, ArrayList<Letter> listLetter) {
		for(int i=0, lengthC=listCondition.size()+1;i<lengthC;i++) {
			if(i==0) {
				System.out.print("	");
				for(int j=0, lengthL=listLetter.size();j<lengthL;j++) {
					if(j==lengthL-1) {
						System.out.println(listLetter.get(j).getCharacter());
					}else {
						System.out.print(listLetter.get(j).getCharacter()+"	");
					}
				}
			}else {
				System.out.print(listCondition.get(i-1).getCharacter()+"	");
				for(int j=0, lengthS=listLetter.size();j<lengthS;j++) {
					if(j==lengthS-1) {
						//判断是否为null
						if(this.getListState().get((i-1)*listLetter.size()+j)==null){
							System.out.println("null");
						}else {
							for(int k=0,length=this.getListState().get((i-1)*listLetter.size()+j).length;k<length;k++) {
								if(k==length-1) {
									System.out.println(this.getListState().get((i-1)*listLetter.size()+j)[k]);
								}else {
									System.out.print(this.getListState().get((i-1)*listLetter.size()+j)[k]+",");
								}
							}
						}						
					}else {
						if(this.getListState().get((i-1)*listLetter.size()+j)==null){
							System.out.print("null"+"	");
						}else {
							for(int k=0,length=this.getListState().get((i-1)*listLetter.size()+j).length;k<length;k++) {
								if(k==length-1) {
									System.out.print(this.getListState().get((i-1)*listLetter.size()+j)[k]+"	");
								}else {
									System.out.print(this.getListState().get((i-1)*listLetter.size()+j)[k]+",");
								}
							}
						}
					}
				}
			}
		}
	}
}
