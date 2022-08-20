package Statement;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("do while with continue");
   int a=0;
   do {
	   a++;
	   if(a==5) {   
		   
	  continue;	  
	   } 
   System.out.println(a);
   }
   while(a<=11);
   
   System.out.println("do while with break");
    int b=2;
    System.out.println(b);
    do {
    	b++;
     if(b==7) {
    	 break;
     }
     System.out.println(b);
    }
    while(b<=15);
   
	}

}
