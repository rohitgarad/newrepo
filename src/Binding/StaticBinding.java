package Binding;

public class StaticBinding {
	
	void abc () {
		
		System.out.println("parent method 1");
	}
	
	static void xyz () {                  // cannotoverride
		
		System.out.println("parent method 2");
	}
	
	private void pqr() {                  // not visible in child class
		
		System.out.println("parent method 3");
	}
	
	final void lmn() {                   // can not override
		
		System.out.println("parent method 4");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		StaticBinding X = new StaticBinding();
		
		X.abc();
		X.xyz();
		X.pqr();
		X.lmn();
	}

}
