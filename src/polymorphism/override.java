
package polymorphism;

public class override extends Overload{
	
	int a = 15;
	
     static void method() {
    	 System.out.println("method 1 override");
     }
     void method(int i) {	
    	 int a = 25;
    	 System.out.println(a);
 		System.out.println("method 2 override");		
 	}
 	void method (String j,boolean h) {
 		System.out.println("method 3 override");
 	}
 	void method (String k,int i) {
 		System.out.println("method 4 override");
 	}
 	void method (boolean l,long m) {
 		System.out.println("method 5 override");
 	}
 	static void method (String u) {
 		System.out.println("method 6 override");		
 	}
    public static void main (char t) {
 	   System.out.println("main method 7 override");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		override y = new override();
		Overload x = new Overload();
		method();
		y.method(10);
		y.method("rohit",true);
		main('r');
		main('t');
		method("override");
		x.method(false,45);
		x.method("overload",10);

	}

}
