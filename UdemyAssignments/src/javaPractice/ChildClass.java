package javaPractice;

public class ChildClass extends ParentClassDemo {

	public void engine() {
		System.out.println("Child Class engine");
		
	}
	
	public void color() {
		System.out.println(color);
	}
	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		ch.color();
		ch.gear();
		ch.breaks();
		ch.engine();
		
	}

}
