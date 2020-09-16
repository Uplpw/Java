package compile_04;

import java.util.ArrayList;
import java.util.HashMap;

public class Select {
	private HashMap<String, ArrayList<SignalVt>> selectMap=new HashMap<String, ArrayList<SignalVt>>();
	
	public void SELECT(Grammer grammer, Follow follow) {
		
		//所有产生式初始化
		for(int i=0;i<grammer.getListProduceP().size();i++) {
			ProduceP tempProduce=grammer.getListProduceP().get(i);
			for(int j=0;j<tempProduce.getRightProduce().size();j++) {
				//将右部数组转为字符串
				String toString=Tools.ArrayToString(tempProduce.getRightProduce().get(j));
				String tempStr=grammer.getListProduceP().get(i).getLeftProduce().getSignal()+toString;
				ArrayList<SignalVt> tempList=new ArrayList<SignalVt>();
				this.selectMap.put(tempStr, tempList);
			}
		}
		
		for(int i=0;i<grammer.getListProduceP().size();i++) {
			ProduceP tempProduce=grammer.getListProduceP().get(i);
			for(int j=0;j<tempProduce.getRightProduce().size();j++) {
				//将右部数组转为字符串
				String toString=Tools.ArrayToString(tempProduce.getRightProduce().get(j));
				String tempStr=grammer.getListProduceP().get(i).getLeftProduce().getSignal()+toString;
				
				First tempFirst=new First();
				tempFirst.FIRST(toString, grammer);
				
				if(Tools.isContainVt(tempFirst.getFirst(), "&")==-1) {
					ArrayList<SignalVt> tempList=new ArrayList<SignalVt>();
					for(int k=0;k<tempFirst.getFirst().size();k++) {
						tempList.add(tempFirst.getFirst().get(k));
					}
					this.selectMap.put(tempStr, tempList);
				}else {
					ArrayList<SignalVt> tempList=new ArrayList<SignalVt>();
					tempList=Tools.Merge(tempFirst.getFirst(), follow.getVnFollow(tempProduce.getLeftProduce().getSignal()));
					this.selectMap.put(tempStr, tempList);
				}
			}
		}
	}
	
	public HashMap<String, ArrayList<SignalVt>> getHashMap(){
		return this.selectMap;
	}
	
	public ArrayList<SignalVt> getProduceList(String str){
		return this.selectMap.get(str);
	}
}
