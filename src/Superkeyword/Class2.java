package Superkeyword;

public class Class2 extends Class1 {
       int a = 45;
       char b = 'r';
       String c = "child class";
       
       void parent() {                      // child class method 1
    	   System.out.println(super.b);     // super with instant variable  to class1
    	   System.out.println(super.a);     // super with instant variable  to class1
    	   System.out.println(super.c);     // super with instant variable  to class1
    	   System.out.println(c);                                     // instant variable to class2
    	   System.out.println(a);                                    // instant variable to class2
    	   System.out.println("super keyword with child class");       	                                      // instant variable to class2
    	   System.out.println(b);                                    // instant variable to class2
       }
       
       
       void Rohit() {                          // child class method 2
    	   int g = 100, h = 150;
    	   String j = "child class method1";
    	   System.out.println(j);
    	   System.out.println(g+h);
    	   super.parent();                     // parent class method 1  
       }
       
       void Rohit(String y) {                  // child class method 3
    	   byte k = 10;
    	   int p = 60;
    	   System.out.println("child class method2");
    	   System.out.println(k+p);
    	   super.Rohit();                      // parent class method 2
    	   super.rohit(10); 	    	       // parent class method 3
       }
        Class2(){                               // no argument constructor
        	super();
        	System.out.println("child class constructor 1");
        }
        
        Class2(char h){                           // parameterise constructor
        	super(10);
        	System.out.println("child class constructor 2");
        }
        
        Class2(String b,int r){                    // another parameterise constructor
        	super("rohit",5);
        	System.out.println("child class constructor 3");
        }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 L = new Class2();
		Class2 M = new Class2('t');
		Class2 N = new Class2("rohit",10);
		N.parent();
		N.Rohit();
		N.Rohit("child");
		System.out.println(M.a);
	
		
	}

}
