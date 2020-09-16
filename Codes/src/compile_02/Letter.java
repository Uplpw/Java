package compile_02;

/*
 * 字符类Letter实现接口类Character
 */
public class Letter implements Character{
	private String letter;            //类属性letter表示字符
	
	/*
	 * 重写方法setCharacter(),设置属性字符
	 * @see compile_02.Character#setCharacter(java.lang.String)
	 */
	@Override
	public void setCharacter(String str) {
		this.letter=str;
	}
	
	/*
	 * 重写方法getCharacter(),返回属性字符
	 * @see compile_02.Character#getCharacter()
	 */
	@Override
	public String getCharacter() {
		return this.letter;
	}
}
