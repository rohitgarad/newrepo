package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinedHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set=new LinkedHashSet();
		
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(4);
		set.add("Rohit");
		set.add("Rohit");
		set.add("");
		set.add("");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(set));
		System.out.println(set.remove(3));
	    System.out.println(set.size());
		System.out.println(set);
	}

}
