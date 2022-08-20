package controlStatement;

public class IfelseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=50,b=100,c=150;
      String x="If else statement";
      if (a<b && b>c) {                 //false statement 
    	  System.out.println(c);
      }
      else {
    	  System.out.println(x);     //therefor print these operation
      }
      if (a<b & b<c) {
    	  System.out.println(a+b+c);   // true statement therefor print these operation
      }
      else {
    	  System.out.println(x);
      }
	}

}
