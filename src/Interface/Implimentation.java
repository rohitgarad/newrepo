package Interface;

public class Implimentation implements Declaration1,  Declaration2 {   // interface implemetation
           

	public void employee() {
		if (a <= b) {
			System.out.println("there have 15 employee are still working");
		}
		else {
			System.out.println("all employee are on leave");
		}

	}

	public void company() {
		for (int a = 15; a<=b; a++) {
			System.out.println("bytequre technology are open");
			System.out.println(a);
		}

	}

	public void method1() {
		int a = 10, b = 20;
		do {  
			System.out.println(a);
			a++;
		}while(a<=b);
		
	}
	
	public void method2() {
		 int c = 0;
		 while(c<10) {
			 c++;
			 System.out.println(c*2);
		 }
	}
	
}
