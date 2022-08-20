package Statement;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=9;
    System.out.println("without break statement");
      
 switch(a) {
      case 1:
    	  System.out.println("jan.");
      case 2:
   	  System.out.println("feb.");
      case 3:
    	  System.out.println("mar.");
      case 4:
    	  System.out.println("apr.");
      case 5:
    	  System.out.println("may.");
     case 6:
    	  System.out.println("jun.");
      case 7:
    	  System.out.println("jul.");
      case 8:
    	  System.out.println("aug.");
      case 9:
    	  System.out.println("sep.");
      case 10:
    	  System.out.println("oct.");
      case 11:
    	  System.out.println("nov.");
      case 12:
    	  System.out.println("dec.");
     }
      int b=9;
     System.out.println("with break statement");
     switch(b) {
     case 1:
   	  System.out.println("jan.");
   	  break;
     case 2:
   	  System.out.println("feb.");
   	  break;
     case 3:
   	  System.out.println("mar.");
   	 break;
     case 4:
   	  System.out.println("apr.");
   	 break;
     case 5:
   	  System.out.println("may.");
   	 break;
     case 6:
   	  System.out.println("jun.");
   	 break;
     case 7:
   	  System.out.println("jul.");
   	 break;
     case 8:
   	  System.out.println("aug.");
   	 break;
     case 9:
   	  System.out.println("sep.");
   	 break;
     case 10:
   	  System.out.println("oct.");
   	 break;
     case 11:
   	  System.out.println("nov.");
   	 break;
     case 12:
   	  System.out.println("dec.");
   	 break;
    }
    
	 int c=9;
	 
     System.out.println("with default statement");
     switch(c) {
     case 1:
   	  System.out.println("jan.");
   	  break;
     case 2:
   	  System.out.println("feb.");
   	  break;
     case 3:
   	  System.out.println("mar.");
   	 break;
     case 4:
   	  System.out.println("apr.");
   	 break;
     case 5:
   	  System.out.println("may.");
   	 break;
     case 6:
   	  System.out.println("jun.");
   	 break;
     case 7:
   	  System.out.println("jul.");
   	 break;
     case 8:
   	  System.out.println("aug.");
   	 break;
     case 0:
   	  System.out.println("sep.");
   	 break;
     case 10:
   	  System.out.println("oct.");
   	 break;
     case 11:
   	  System.out.println("nov.");
   	 break;
     case 12:
   	  System.out.println("dec.");
   	 break;
   	 default:
   		 System.out.println("leap year");
	  }

    }
  }

