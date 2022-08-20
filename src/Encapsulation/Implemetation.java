package Encapsulation;

public class Implemetation {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentsClass x = new StudentsClass();
		
		x.setStudent_name("Rohit");
		x.setStudent_roll_no(16);
		x.setStudent_Division('A');
		x.setStudents_marks(60);
		x.setResult("pass");
		
		System.out.println(x.getStudent_name());
		System.out.println(x.getStudent_roll_no());
		System.out.println(x.getStudent_Division());
		System.out.println(x.getStudents_marks());
		System.out.println(x.getResult());
		
		
		

	}

}
