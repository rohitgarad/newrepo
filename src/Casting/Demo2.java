package Casting;

public class Demo2 extends Demo1{
	
	int b = 100;
	String clss = "bytesquare";
	
	void abc () {             // method override 
		
		System.out.println("abc method of child class");
	}
	
	void lmn () {
		
		System.out.println("lmn method of child class");
	}

	static void pqr() {
		
		System.out.println("pqr method of child class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 B = new Demo2();
		
		B.abc();                                // child class method
		B.lmn();                                // child class method 
		B.xyz();                                // parent class method 
		Demo1.method();                         // parent class method 
		System.out.println(B.a);                // parent variable
		System.out.println(B.b);                // child variable
		System.out.println(B.name);             // parent string
		System.out.println(B.clss);             // child string 
		
		
		Demo1 BB = new Demo2();           //Upcasting 
		
		BB.abc();       // override method execute from child class in upcasting
		Demo2.method();                            // parent class method 
		BB.xyz();                                  // parent class method 
		System.out.println(BB.a);                  // parent class variable
		System.out.println(BB.name);               // parent class string 
		
		
		Demo2 CC = (Demo2)BB;           //DownCasting AND it is same working as compair to B oject
		                                // so we did not use mostly downcasting
		CC.abc();                                    // child class method
		CC.lmn();                                    // child class method
		CC.xyz();                                    // parent class method 
		CC.pqr();                                    // child class method 
		CC.method();                                 // parent class method 
		System.out.println(CC.a);                    // parent class variable
		System.out.println(CC.b);                    // child class variable
		System.out.println(CC.clss);                 // child class variable
        System.out.println(CC.name);		         // parent class variable
	
		

	}

}
