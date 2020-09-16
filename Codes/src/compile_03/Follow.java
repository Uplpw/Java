package compile_03;

import java.util.ArrayList;
import java.util.HashMap;

public class Follow {
	private HashMap<String, ArrayList<SignalVt>> followMap=new HashMap<String, ArrayList<SignalVt>>();
	
	public void FOLLOW(Grammer grammer) {
		
		//初始化所有的非终结符
		for(int i=0;i<grammer.getListSignalVn().size();i++) {
			SignalVn tempVn=grammer.getListSignalVn().get(i);
			if(tempVn.getSignal().equals(grammer.getSignalVn().getSignal())) {
				ArrayList<SignalVt> tempList=new ArrayList<SignalVt>();
				SignalVt tempVtS=new SignalVt();
				tempVtS.setSignal("#");
				tempList.add(tempVtS);
				this.followMap.put(tempVn.getSignal(), tempList);
			}else {
				ArrayList<SignalVt> tempList=new ArrayList<SignalVt>();
				this.followMap.put(tempVn.getSignal(), tempList);
			}
		}
		boolean flag=true;
		
		while(flag==true) {
			
			int intFlag=-1;
			//开始计算
			for(int i=0;i<grammer.getListProduceP().size();i++) {
				ProduceP tempProduce=grammer.getListProduceP().get(i);
				//右部部分
				for(int j=0;j<tempProduce.getRightProduce().size();j++) {
					String[] tempStr=tempProduce.getRightProduce().get(j);
					for(int k=0;k<tempStr.length;k++) {
						if(Tools.isContainVn(grammer.getListSignalVn(), tempStr[k])!=-1) {
							if(tempStr.length-1>k) {
								String toString=Tools.ArrayToString(tempStr);
								First first=new First();
								first.FIRST(toString.substring(k+1, tempStr.length), grammer);
								for(int m=0;m<first.getFirst().size();m++) {
									if(Tools.isContainVt(this.followMap.get(tempStr[k]), first.getFirst().get(m).getSignal())==-1
											&& first.getFirst().get(m).getSignal().equals("&")==false) {
										this.followMap.get(tempStr[k]).add(first.getFirst().get(m));
										intFlag=0;
									}
								}
								if(Tools.isContainVt(first.getFirst(), "&")!=-1) {
									
									for(int m=0;m<this.followMap.get(tempProduce.getLeftProduce().getSignal()).size();m++) {
										if(Tools.isContainVt(this.followMap.get(tempStr[k]), 
												this.followMap.get(tempProduce.getLeftProduce().getSignal()).get(m).getSignal())==-1) {
											this.followMap.get(tempStr[k]).add(this.followMap.get(tempProduce.getLeftProduce().getSignal()).get(m));
											intFlag=0;
										}
									}
								}
							}else {
								for(int m=0;m<this.followMap.get(tempProduce.getLeftProduce().getSignal()).size();m++) {
									if(Tools.isContainVt(this.followMap.get(tempStr[k]), 
											this.followMap.get(tempProduce.getLeftProduce().getSignal()).get(m).getSignal())==-1) {
										intFlag=0;
										this.followMap.get(tempStr[k]).add(this.followMap.get(tempProduce.getLeftProduce().getSignal()).get(m));
									}
								}
							}
						}
					}
				}
			}
			if(intFlag==0) {
				flag=true;
			}else {
				flag=false;
			}
		}	
	}
	
	//获取所有的Follow集
	public HashMap<String, ArrayList<SignalVt>> getHashMap(){
		return this.followMap;
	}
	
	//根据Vn获取Follow集
	public ArrayList<SignalVt> getVnFollow(String str){
		return this.followMap.get(str);
	}
}
