package controlStatement;

public class DecisionMakingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10, b=50, c=60;
     String n="simple if statement";
     if (a<b && b<c) {
    	 System.out.println(n);
    	System.out.println(c);
    	}
     if (a>b || b<c) {
    	 System.out.println(b);
    	 System.out.println(a+b);
     }
	}

}
