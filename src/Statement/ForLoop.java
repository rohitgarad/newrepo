package Statement;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for (int a=1; a<=10; a++) {         // for loop without break and continue
         System.out.println(a); 
    }
    
    for (int b=10; b>=1; b--) {
    	System.out.println(b);
    }
    
    for (int c=1; c<=15; c++) {        // for loop with continue
    	if (c==7) {
    		continue;
    	}
    	System.out.println(c);
    }
     
    for (int d=5; d<=10; d++) {       // for loop with break
    	if (d==8) {
    		break;
    	}
    	System.out.println(d);
    }
}
}  
      

