package Superkeyword;

public class Class1 {
	int a = 20;
	String b = "use super key word";
	boolean c = true;
	 
	void parent() {
		int a = 50;
		System.out.println(10 + a );
		System.out.println("parent method ");
		System.out.println(b);
		System.out.println(c);
		 
	}
	void Rohit() {
		int R = 100, A = 70;
		if(R>A) {
			System.out.println("parent class method1");
		}else {
			System.out.println("invalid class");
		}
		System.out.println(R+A);
	}
	
	void rohit(int B) {
		int d = 50, f = 25;
		System.out.println("parent class method2");
		System.out.println(d+f);	
		System.out.println(B);
	}
	 
	Class1(){                               // no argument constructor
		  System.out.println("no argument constructor 1 in parent class");
	  }
	  
	  Class1(int a){                          // parameterise constuctor
		 System.out.println("parameterise constuctor 2 in parent class");
	  }
	   
	  Class1(String R,int A){                 // another parameterise constructor
		  System.out.println("parameterise constuctor 3 in parent class ");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
