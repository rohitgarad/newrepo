package Finalkeyword;

public class WithMethod extends Withvariable{
    int h = 50;
    
   final void method() {     // does not use this method in another class or doesn't override this method
    	int a = 143;
    	boolean b = true;
    	System.out.println("final with method");
    	System.out.println(a);
    	System.out.println(b);
    }

    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithMethod y = new WithMethod();
		y.method();
	   System.out.println(y.h);
	   
	}

}
