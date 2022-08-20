
package ABC;

public class Practice2 {
       int a=45;     // instant variable
       char b='R';   // instant variable
    static float c=45.12f;   // static variable
   
    void abc() {                    // non static method
    	int d=123, e= 456, f=d+e;   //local variable
    	System.out.println(f);
    	System.out.println(d*f);    // arithmatic operation +,-,*,/,%
    	System.out.println(d/f);
    	System.out.println(c);
    	System.out.println(d<e);    // relational operation <,>,<=,>=,==,!=
    	System.out.println(d>e);
    	System.out.println(a);
    	}
     
      static void xyz() {      // static method
    	  int j=789, h=46;      
    	  System.out.println(j/h);
    	  System.out.println(c);
    	
      }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 x=new Practice2();
		System.out.println(x.a); 
		System.out.println(x.b);
		System.out.println(c);
	    x.abc();
	     xyz();
	
       
	}

}
