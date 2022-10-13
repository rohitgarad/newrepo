package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Set set=new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add("Rohit");
		set.add("Rohit");
		set.add("");
		set.add("");
		
		
		System.out.println(set);       // unorder sequence
		System.out.println(set.size());
		for (Object set1 : set) {
			System.out.println(set1);
		}
		System.out.println(set.isEmpty());
		System.out.println(set.contains(set));
		System.out.println(set.remove(2));
	    System.out.println(set.size());
		System.out.println(set);
		
		
	}

}
