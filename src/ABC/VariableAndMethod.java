package ABC;

public class VariableAndMethod {
	int a=143;                               //instant variable
	String b="Types of variable";            //instant variable
	static long c=123456;                    //static variable                 
	static boolean d=true;                   //static variable
	
	
    void Arithmatic() {
    	int e=450, f=150, g=e/f;            // local variable 
    	System.out.println(g);           
    	System.out.println(e+f);             //arithmatic operations
    	System.out.println(e-f);
    	System.out.println(e*f);
    	System.out.println(e/f);
    	System.out.println(e%f);
    	System.out.println(g/f);
    
    	
    }
	
	void Relational() {
		int e=300,f=200;
		System.out.println(e<f);         //relational operations 
		System.out.println(e>f);
		System.out.println(e<=f);
		System.out.println(e>=f);
		System.out.println(e==f);
		System.out.println(e!=f);
		
		
	}
	static void method() {             //static method 
		int h=45,i=35,j=h*i;           
		System.out.println(j);
		System.out.println(c);
		System.out.println(d);
		
	}
     
	void method1() {                  // non static method 
		int a=121,b=12,c=a-b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		
		
	}
    	  
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableAndMethod x=new VariableAndMethod();      // new object
		x.Arithmatic();                                  //non static method along with new object
		x.Relational();                                 //non static method along with new object
		x.method1();                                    //non static method along with new object
		method();                                       // static method along with class
		System.out.println(x.a);                       // instant variable along with object
		System.out.println(x.b);                       // instant variable along with object
		System.out.println(c);                        // static variable along with class
		System.out.println(d);                       // static variable along with class
	
		
		
		
	}

}
