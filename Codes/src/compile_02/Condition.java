package compile_02;

/*
 * 状态类Condition实现接口类Character
 */
public class Condition implements Character{
	private String condition;           //状态属性
	private boolean startCondition;     //属性condition是否是初态
	private boolean endCondition;       //属性condition是否是终态
	
	//构造方法初始化
	public Condition() {
		this.condition="";
		this.startCondition=false;
		this.endCondition=false;
	}
	
	/*
	 * 重写方法setCharacter(),设置状态condition
	 * @see compile_02.Character#setCharacter(java.lang.String)
	 */
	@Override
	public void setCharacter(String str) {
		this.condition=str;
	}
	
	/*
	 * 重谢方法getCharacter(),返回状态condition
	 * @see compile_02.Character#getCharacter()
	 */
	@Override
	public String getCharacter() {
		return this.condition;
	}
	
	/*
	 * 方法setStartCondition()
	 * 设置属性condition是否是初态
	 */
	public void setStartCondition() {
		this.startCondition=true;
	}
	
	/*
	 * 方法setEndCondition()
	 * 设置属性condition是否是终态
	 */
	public void setEndCondition() {
		this.endCondition=true;
	}
	
	/*
	 * 方法isStartCondition()
	 * 判断属性condition是否是初态
	 */
	public boolean isStartCondition() {
		return this.startCondition;
	}
	
	/*
	 * 方法isEndCondition()
	 * 判断属性condition是否是终态
	 */
	public boolean isEndCondition() {
		return this.endCondition;
	}
}
