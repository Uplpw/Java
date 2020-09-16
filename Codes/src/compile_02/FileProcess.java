package compile_02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 文件处理类FileProcess
 */
public class FileProcess {
	
	private String condition;          //状态集字符串
	private String letter;             //字符集字符串
	private String[] tranform;		   //转换集数组
	private String startCondition;     //初态状态字符串
	private String endCondition;       //终态集字符串
	private boolean endIsNull;         //终态是否为空
	
	/*
	 * 方法File(),处理文件,将数据提取并赋值于属性
	 * 参数：文件名fileName
	 */
	public void File(String fileName) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			String tempString = null;
			//循环文件以行的形式读取数据
			while ((tempString = reader.readLine()) != null) {
				//若是状态集赋值于this.condition
				if("Q".equals(tempString)) {
					if((tempString = reader.readLine()) != null) {			
						this.condition = reader.readLine();
					}
				}
				//若是字符集赋值于this.letter
				if("C".equals(tempString)) {
					if((tempString = reader.readLine()) != null) {
						this.letter = reader.readLine();
					}
				}
				//若是状态转换集赋值于this.tranform
				if("f".equals(tempString)) {
					if((tempString = reader.readLine()) != null) {
						int count=Integer.parseInt(tempString);
						this.tranform=new String[count];
						for(int i=0;i<count;i++) {
							this.tranform[i]=reader.readLine();
						}
					}
				}
				//若是初态赋值于this.startCondition
				if("S".equals(tempString)) {
					if((tempString = reader.readLine()) != null) {
						this.startCondition=reader.readLine();
					}
				}
				//若是终态集赋值于this.endCondition
				if("F".equals(tempString)) {
					if((tempString = reader.readLine()) != null) {
						//不为空赋值
						if(Integer.parseInt(tempString)>0) {
							this.endCondition=reader.readLine();
						}
						else {
							//为空就终态为空
							this.endIsNull=true;
						}
					}
				}
			}
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}
	
	//getCondition()方法获取字符串condition
	public String getCondition() {
		return this.condition;
	}
	//getLetter()方法获取字符串letter
	public String getLetter() {
		return this.letter;
	}
	//getTranform()方法获取字符串数组tranform
	public String[] getTranform() {
		return this.tranform;
	}
	//getStartCondition()方法获取字符串startCondition
	public String getStartCondition() {
		return this.startCondition;
	}
	//getEndCondition()方法获取字符串endCondition
	public String getEndCondition() {
		return this.endCondition;
	}
	//getEndIsNull()方法获取终态是否为空endIsNull
	public boolean getEndIsNull() {
		return this.endIsNull;
	}
}
