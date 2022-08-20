package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args)throws  InterruptedException  {
		// TODO Auto-generated method stub
     
		String path = "C:\\Users\\rohit\\eclipse-workspace\\SoftwareTestingBatch42\\File\\exception.properties";
		
		
			try {
				Thread.sleep(000);
				System.out.println("thread");       // does not skip 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("sleep time");   // skip that code
			}
		
		
		
		System.out.println("rohit");
		
		try {
			FileInputStream file = new FileInputStream(path);
			System.out.println("try");                // does not skip
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("rohit");              // skip that code
		}
		
		
	}

}
