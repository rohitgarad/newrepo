package Binding;

public class DynamicBinding extends StaticBinding {
	
    void abc () {
		
		System.out.println("child method 1");
	}
	
	static void xyz () {
		
		System.out.println("child method 2");
	}
	
	private void pqr() {                 
		
		System.out.println("child method 3");
	}
	
//	final void lmn() {                          // connot override final method 
//		
//		System.out.println("child method 4");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DynamicBinding Y = new DynamicBinding();		
//		Y.abc();
//		Y.xyz();
//     	Y.pqr();
    
		
		StaticBinding H = new StaticBinding();
		StaticBinding Z = new DynamicBinding();        //Upcasting
//	    DynamicBinding I = (DynamicBinding)Z;          // downcasting
		Z.abc();                                     // override method from child class  DB
		H.abc();                                    // Override method from Parent class  DB
		Z.lmn();                                    // does not override final  method    SB
		H.lmn();                                    // does not override final  method    SB
		Z.xyz();                                    // does not override static method    SB
		H.xyz();                                    // does not override static method    SB
		
		
		
		 
	}

	
}
