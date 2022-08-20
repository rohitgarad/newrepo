package ThisKeyword;

public class ThisKeyword {
	static int a= 20;
    static	String b="this keyword";
	boolean c=true;
	float d=12.12f;
	int e=30;
	long h = 123456;
	
	 void method () {
		int a=40;
		String b="this Keyword in method";
		boolean c=false;
		float d=45.45f;
		int e= 60;
		long h = 789;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(h);
		System.out.println(this.a);              // instant variable with this Keyword
		System.out.println(this.b);              // instant variable with this Keyword
		System.out.println(this.c);              // instant variable with this Keyword
		System.out.println(this.d);              // instant variable with this Keyword
		System.out.println(this.e);              // instant variable with this Keyword
		System.out.println(this.a + this.e);     // instant variable with this Keyword
		System.out.println(this.h);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String b = "rohit";
		ThisKeyword x = new ThisKeyword();
		x.method();
	System.out.println(x.a);
	}

}
