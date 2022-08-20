package Abstract;

public class School extends Declaration {
	
	void teacher () { 
		int i = 15, j = 20;
		  if (i>j) {
			  System.out.println("teacher staff are excelent" );
		  } else {
			  System.out.println("teacher staff are low");
		  }
	}
	
	void students() {
		for (int a = 10; a<20; a++) {
			System.out.println(a+"students");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            School convent = new School();
            convent.teacher();
            convent.students();
            
	}

}
