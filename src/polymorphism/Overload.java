package polymorphism;

public class Overload {
	int a = 20;
	
	static void method (){
		int a = 50;
		float b = 45.50f;
		System.out.println(a+b);
		System.out.println("method 1");		
	}
	void method(int i) {		
		System.out.println("method 2");		
	}
	void method (String j,boolean h) {
		System.out.println("method 3");
	}
	void method (String k,int i) {
		System.out.println("method 4");
	}
	void method (boolean l,long m) {
		System.out.println("method 5");
	}
	static void method (String u) {
		System.out.println("method 6");		
	}
   public static void main (char t) {
	   System.out.println("main method 7");
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload x = new Overload();
		method();
		x.method(10);
		x.method("rohit",false);
		x.method("overload",15);
		x.method(true,100);
		method("static method");
		main('t');
		
	}

}
