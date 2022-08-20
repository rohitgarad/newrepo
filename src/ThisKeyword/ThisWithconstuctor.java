package ThisKeyword;

public class ThisWithconstuctor {
   int a = 10;
   double b = 35/2;
	ThisWithconstuctor (){                   // no argument constructor 
		int a = 50, b = 100;
		String c = "using this keyword";      
		System.out.println(a);
		System.out.println(a+b);
		System.out.println(c+a);		
	}
	ThisWithconstuctor (int a){          // parameter constructor
		this();
		short b = 21, c = 50;
	   boolean d = true;
	   char e = 'R';
	   String f = "using this  with parametrise constuctor";
	   System.out.println(b+c);
	   System.out.println(e);
	   System.out.println(d);
	   System.out.println(f);
		
	}
	ThisWithconstuctor( int j, String i){ 
	  this(15);
		float q = 45.45f;
		long w = 123654;
		byte e = 21;
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
        System.out.println("another constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisWithconstuctor x = new ThisWithconstuctor(10,"rohit");
		System.out.println(x.a);
		System.out.println(x.b);
	}

}
