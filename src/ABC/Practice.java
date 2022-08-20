package ABC;

public class Practice {
	
	int a=45698;                                   // instant variable
	boolean b=false;                               // instant variable
	static byte c=12;                              // static variable
	static String d="various type of variable";    // static variable
	
	void abc() {                                   //user define method non static
		int e=123, f=456, g=e+f;                   // local variable
		System.out.println(g);                     
		System.out.println(e+f);                  //arithmatic operation
		System.out.println(e-f);                 
		System.out.println(e*f);                  
		System.out.println(e/f);                  
		System.out.println(e%f);                  
		System.out.println(e<f);                  // relation operation
		System.out.println(e>f);
		System.out.println(e<=f);
		System.out.println(e>=f);
		System.out.println(e==f);
		System.out.println(e!=f);
		System.out.println(a);
		System.out.println(c);
		
	}
	
	static void xyz() {
		int h=155, i=55, j=h*i;
		System.out.println(j);
		System.out.println(c);
		System.out.println(d);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice x=new Practice();              // new object 
		System.out.println(x.a);                // instant variable with object
		System.out.println(x.b);
		x.abc();                              // non static method with object
		xyz();                                  // static method with class
		System.out.println(c);                  // static variable with class
		System.out.println(d);
		
		
		
	}

}
