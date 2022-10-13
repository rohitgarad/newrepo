package Interface;

public interface Declaration1 {       // interface declaration 
	
	public static final int a = 15;
	static int b = 20;
	
 
	
	static void abc() {
		System.out.println("static method for interface");
	}
	
	default void xyz() {
		System.out.println("default method for interface");
	}
	
	
	abstract void employee();

	abstract void company();
}

