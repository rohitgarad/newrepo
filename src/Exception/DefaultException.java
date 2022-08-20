
package Exception;

public class DefaultException {
       
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultException x = new DefaultException();
	
		 int c = 15;
  	   int d = 0;
  	   int h = 40;
  	   String name = null;
  	   System.out.println(1);
  	   System.out.println(2);
  	   
   try {
  	   System.out.println(name.length());             // exception fount 
    System.out.println("try");                    // skip that code 
   }
   catch(Exception a) {                            // exception handeling
	   System.out.println(a.getMessage());                 // exception detail information
  		  System.out.println("null point");
  		  System.out.println("bytesquare");
   }
  	
    try {
  		System.out.println(c/d);                     // exception found
  	  System.out.println(100);                       //skip that code
  	  }
    catch ( ArithmeticException e) {             //exception handeling
    System.out.println(e.toString());       // exception type 
    System.out.println("rohit");
    }
    
  	 System.out.println(h);
  	
	}

}
