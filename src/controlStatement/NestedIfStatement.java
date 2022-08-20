package controlStatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int marks=25;
   if (marks>=75) {
	   System.out.println("first class");
   }
   else if(marks<75 && marks>=60) {
	   System.out.println("Second class");
   } 
   else if (marks<60 && marks>=35) {
	   System.out.println("Third class");
   } 
   else if (marks<35) {
	   System.out.println("Fail");
   }
   else {
	   System.out.println("ubsent");
   }
   
	}

}
