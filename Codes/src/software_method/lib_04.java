package software_method;

public class lib_04 {
	private int id;
	
	public lib_04(int id) {
		this.id=id;
	}
	
	private int getId() {
		return this.id;
	}
	
	private class test{
		private String name;
		
		private void setName(String str) {
			this.name=str;
		}
		
		private String getName() {
			return this.name;
		}
		
		private void show() {
			System.out.println(id);
		}
		
		private void showId() {
			System.out.println(getId());
		}
	}
	
	public void l_show() {
		test t=new test();
		t.setName("12");
		
		System.out.println("test name: "+t.getName());
		
		t.show();
		
		t.showId();
		
	}
	
	
	public static void main(String[] args) {
		lib_04 ll=new lib_04(123);
		System.out.println(ll.getId());
		ll.l_show();
		System.out.println(ll.id);
	}
}
