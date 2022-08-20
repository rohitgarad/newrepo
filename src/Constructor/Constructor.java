package Constructor;

public class Constructor {                              // default constructor with class
       int a=15;
       boolean b = true;
       float c = 15.23f;
       
       Constructor(){                                   // non parametric constructor
    	   int h = 1234;
    	   String j = "non parametric constructor";
    	   System.out.println(h);
    	   System.out.println(j);
       }
       
       Constructor(int i,String k){                   // parametric constuctor
 
    	 int  d = 112;
    	 short e = 12;
    	String j = "parametric constructor"; 
    	 System.out.println(d+e);
    	 System.out.println(j);
    	   
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor x = new Constructor();                 // for non parametric constuctor
		Constructor x1 = new Constructor(10,"rohit");      // for parametric constructor
		System.out.println(x1.a);
		System.out.println(x1.b);
		System.out.println(x.c + x.a);
	
		
		
	}

}
