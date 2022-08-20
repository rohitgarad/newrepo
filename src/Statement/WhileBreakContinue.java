package Statement;

public class WhileBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=1;
   System.out.println("while with continue");
  while (a<=20) {
	   if(a==10) {	 
		  a++;
		 continue;                             // with continue
	   }
	   System.out.println(a);
	   a++;
	   }
   System.out.println("while with break");
   int b=20;
  while (b<=30) {
	  if (b==25) {
		  b++;
		  break;                                  //with break
	  }
	  System.out.println(b);
	  b++;
  }
	}
		
	}


