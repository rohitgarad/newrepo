package Casting;

public class DatatypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1) widening type casting
		
		byte a = 20;
		
		int b =a;             // widening type casting  from lower Datatype to higher Datatype 
		System.out.println(b);
		
		long c =b;
		System.out.println(c);   // widening type casting  from lower Datatype to higher Datatype 

		double d = c;
		System.out.println(d);  
		
		short e = a;
		System.out.println(e);
		
//2) narrowing type casting 
		
		int f = 130;
		
		byte g = (byte) f;      //narrowing type casting from higher Datatype to Lower Datatype
		System.out.println(g);
		
		long h = 3215;
		int i = (int) h;
		System.out.println(i);
	
	}

}
