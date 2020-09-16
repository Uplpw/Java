package compile_04;

import java.util.ArrayList;

public class First {
	private ArrayList<SignalVt> firstList=new ArrayList<SignalVt>();
	private boolean isContainNull=false;
	
	
	public void FIRST(String str, Grammer grammer) {
		if(str.length()==1 && Tools.isContainVn(grammer.getListSignalVn(), str)!=-1) {
			ProduceP tempProduce=null;
			
			if(Tools.isContainP(grammer.getListProduceP(), str)!=-1) {
				int index=Tools.isContainP(grammer.getListProduceP(), str);
				tempProduce=grammer.getListProduceP().get(index);
			}

			for(int i=0;i<tempProduce.getRightProduce().size();i++) {
				//获取右部的一个部分，形式为字符数组
				String[] tempArray=tempProduce.getRightProduce().get(i);
				
				boolean isAddNull=true;
				boolean isAllVn=true;
				
				if(tempArray.length==1) {
					if(tempArray[0].equals("&")){
						this.isContainNull=true;
						if(Tools.isContainVt(this.firstList, "&")==-1) {
							SignalVt tempVt=new SignalVt();
							tempVt.setSignal("&");
							this.firstList.add(tempVt);
						}
					}
				}
				
				for(int j=0;j<tempArray.length;j++) {
					boolean isContinue=true;
					boolean isVt=false;
					
					//若是Vt并且不包含则加入、终止循环
					if(Tools.isContainVt(grammer.getListSignalVt(), tempArray[j])!=-1) {
						if(Tools.isContainVt(this.firstList, tempArray[j])==-1) {
							SignalVt tempVt=new SignalVt();
							tempVt.setSignal(tempArray[j]);
							this.firstList.add(tempVt);
						}
						isVt=true;
						isAllVn=false;
					}
					if(isVt==true) {
						break;
					}
					
					//若是非终结符则递归
					if(Tools.isContainVn(grammer.getListSignalVn(), tempArray[j])!=-1) {
						First tempFFS=new First();
						tempFFS.FIRST(tempArray[j], grammer);
						
						for(int m=0;m<tempFFS.getFirst().size();m++) {
							if(Tools.isContainVt(this.firstList, tempFFS.getFirst().get(m).getSignal())==-1 &&
									tempFFS.getFirst().get(m).getSignal().equals("&")==false) {
								this.firstList.add(tempFFS.getFirst().get(m));  //不含相同字符和空就加入
							}
						}
						if(tempFFS.getIsContainsNull()==false) {
							isAddNull=false;
							isContinue=false;
						}
					}
					//若非终结符不能导出&则break此次循环
					if(isContinue==false) {
						break;
					}	
				}
				
				//每次右部分str[]处理完就判断是否加入&
				if(isAddNull==true && isAllVn==true) {
					if(Tools.isContainVt(this.firstList, "&")==-1) {
						SignalVt tempVt=new SignalVt();
						tempVt.setSignal("&");
						this.firstList.add(tempVt);
					}
				}
			}
		}else {
			for(int i=0;i<str.length();i++) {
				if(Tools.isContainVt(grammer.getListSignalVt(), str.substring(i, i+1))!=-1){
					SignalVt tempVt=new SignalVt();
					tempVt.setSignal(str.substring(i, i+1));
					this.firstList.add(tempVt);
					break;
				}else {
					First tempFirst=new First();
					tempFirst.FIRST(str.substring(i, i+1), grammer);
					if(Tools.isContainVt(tempFirst.getFirst(), "&")!=-1) {
						if(i==str.length()-1) {
							for(int j=0;j<tempFirst.getFirst().size();j++) {
								if(Tools.isContainVt(this.firstList, tempFirst.getFirst().get(j).getSignal())==-1) {
									this.firstList.add(tempFirst.getFirst().get(j));
								}
							}
						}else {
							for(int j=0;j<tempFirst.getFirst().size();j++) {
								if(Tools.isContainVt(this.firstList, tempFirst.getFirst().get(j).getSignal())==-1 &&
										!tempFirst.getFirst().get(j).getSignal().equals("&")) {
									this.firstList.add(tempFirst.getFirst().get(j));
								}
							}
						}
					}else {
						for(int j=0;j<tempFirst.getFirst().size();j++) {
							if(Tools.isContainVt(this.firstList, tempFirst.getFirst().get(j).getSignal())==-1) {
								this.firstList.add(tempFirst.getFirst().get(j));
							}
						}
						break;
					}
				}
			}
		}
	}	
		
	
	public ArrayList<SignalVt> getFirst() {
		return this.firstList;
	}
	
	public boolean getIsContainsNull() {
		return this.isContainNull;
	}
}
