package Array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[];                         // array declaration 
    
    a = new int [5];                 // array size
    
    a[0] = 10;                        // array value inisilisation idex vise 
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;
    try {
          a[5]=60;                      // out of index size in array 
          System.out.println("java");         // skip that code 
    }
    catch(Exception e) {
    	e.printStackTrace();
    	System.out.println("rohit");
    }
    
 //   System.out.println(a[3]);
   
    for(int s: a) {                    // foreach loop
    	System.out.println(s);
    }
  
    	
    } 
	

}
