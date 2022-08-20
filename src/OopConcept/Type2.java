package OopConcept;

public class Type2 extends Type1 {  // child class of Type1 class & parent class for Type3 class
	  int a=10;
	  float b=30.45f;
	    String d="multilevel inheritence ";
	    static char q = 'R';
	    
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Type2 y = new Type2 ();
		System.out.println(y.v);
		System.out.println(y.a);
		System.out.println(y.c);
		System.out.println(y.d);
		System.out.println(p);
		System.out.println(q);
		System.out.println(y.b);
		y.method1();
		method2();
	}

}