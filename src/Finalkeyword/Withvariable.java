package Finalkeyword;

  public class Withvariable {
	final int a = 100;              // does not change the value of variable or doesn't reassign the value
	final short b = 15;
    final char c = 'R';
    
	
	void method () {
		int a = 50;
		System.out.println("using this keyword");
		System.out.println(a);
			
	}
	
	final void method1() {       // does not use this method in another class or doesn't override this method
		int i = 80;
		System.out.println("final with method");
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withvariable x = new Withvariable();
		x.method();
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
      x.method1();
	}

}
