package oprations;

public class BitwiseAndLogicale {
	
	static void bitwise() {
	int	a=20, b=30,c=40;
	System.out.println(a<b & b<c);      // true
	System.out.println(a>b & b<c);      // false
	System.out.println(a>b & b>c);      // false
	System.out.println(a<b & a>c);      // false
	System.out.println(a<=b & a<=c);    // true
	System.out.println(a!=b & b!=c);    // true
	System.out.println(a<b | b<c);      // true
	System.out.println(a>b | b<c);      // true
	System.out.println(a>b | b>c);      // false
	System.out.println(a<b | a>c);      // true
	System.out.println(a<=b | a<=c);    // true
	System.out.println(a!=b | b!=c);    // true
	System.out.println(a>b | a>c);      // false		
	}	
	    static void logical() {
		int a=10,b=20,c=30;
		System.out.println(a<b && b<c);      // true
		System.out.println(a>b && b<c);      // false
		System.out.println(a>b && b>c);      // false
		System.out.println(a<b && a>c);      // false
		System.out.println(a<=b && a<=c);    // true
		System.out.println(a!=b && b!=c);    // true
		System.out.println(a<b || b<c);      // true
		System.out.println(a>b || b<c);      // true
		System.out.println(a>b || b>c);      // false
		System.out.println(a<b || a>c);      // true
		System.out.println(a<=b || a<=c);    // true
		System.out.println(a!=b || b!=c);    // true
		System.out.println(a>b || a>c);      // false
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bitwise();
		logical();
	}

}
