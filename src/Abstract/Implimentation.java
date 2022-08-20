package Abstract;

public class Implimentation  extends Declaration {
	
         void teacher (){
        	 System.out.println("in the school 10 teacher are available");      	 
         }
         
         void students () {
        	 System.out.println(" 200 students present in the school");
        	 
         }
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implimentation school = new Implimentation();
		school.teacher();
		school.students();
	}

}
