package ABC;

public class StaticMethod {
	
char a='R';    //instant variable
	
	static int profit=15000;  //static variable 
	
	String b="Bytesquare task 3";   // instant variable 
	 
	static double c=154.564;       // static variable
	
	void calculation1() {    // not static member belong object 
		int d=50,e=30;     //local variable
		int f = d/e;
		System.out.println(f);
	   
	}
      static void calculation2() {  //static member belong class
    	  int d=50,e=30;   // local variable 
    	  int f=d-e;
    	  System.out.println(f);
    	 
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod g=new StaticMethod();
		g.calculation1();
		calculation2();
		System.out.println(g.a);
		System.out.println(g.b);
		System.out.println(profit);
		System.out.println(c);
		
	
		
	}

}
