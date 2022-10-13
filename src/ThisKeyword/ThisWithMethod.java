package ThisKeyword;

public class ThisWithMethod {
	
	
          
    void method1 (){
		int a=143,b=50;
		String c = "this keyword with method 1";    
		char d = 'R';
		System.out.println(a+b);
		System.out.println(c);
		System.out.println(d);
			
	}
      void method2 () { 
		int a = 45, b = 35;
		boolean c = false;
		String d = "using this keyword in method 2 ";
		System.out.println(a*b);
		System.out.println(c);
		System.out.println(d);
        this.method1();		             // this keyword along with the method 
	}
	 void method3 () {
		byte a = 127;
		int b = 500;
		char c = 'A';
		String d = "all methods call in this method 3";
		System.out.println(a+b);
		System.out.println(c);
		System.out.println(d);
	    this.method2();                       // this keyword along with the another method 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisWithMethod y = new ThisWithMethod();
		y.method3();
	}

}
