package OopConcept;

public class Type1 {     //parent class 
    int a=15,v=25;
    String c="OOP Concept";
    static int p=100;
    void method1() {
    	int d=50, e=60;
    	System.out.println(d+e);
    	System.out.println("method 1");
       System.out.println(d<e);    	
    	
    }
    static void method2 () {
    	int f = 35 , g = 65;
    	System.out.println(p);
    	System.out.println(f*g);
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Type1 x = new Type1();
		x.method1();
		System.out.println(x.a);
		System.out.println(x.v);
		System.out.println(x.c);
		System.out.println(p);
		method2();
		 
	}

}
