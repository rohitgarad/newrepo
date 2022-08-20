package oprations;

public class Oprations {

	 void unanry() {
		int a=12,b=20,c=15,d=25;
		System.out.println(++a + b++ + --c + d-- + a - b);    //13+20+14+25+13-21
		System.out.println(--a * b++ - --b + a++ + --c + d++ * a + b+c+d); //12*21-21+12+13+24*13+21+13+25
		System.out.println(d++ * --c - a++ + --b * ++d + c++ - --a * b++ +a+b+c+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oprations x=new Oprations();
	 x.unanry();
	
	}

}
