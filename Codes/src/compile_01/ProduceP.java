package compile_01;
/*
 * 产生式类ProduceP
 * 产生式字符串属性：produce
 * 设置属性方法：setProduce（）
 * 获取属性方法：getProduce()
 */
class ProduceP {
	
	private String produce;
	
	public void setProduce(String[] string) {
		//将产生式的左部以及符号赋值给属性produce
		this.produce=string[0]+"->";
		//输出产生式右部
		for(int i=1; i<string.length; i++) {
			if(i==string.length-1) {
				this.produce=this.produce+string[i];
			}else {
				this.produce=this.produce+string[i]+"|";
			}
		}
	}
	
	public String getProduce() {
		return this.produce;
	}
}
