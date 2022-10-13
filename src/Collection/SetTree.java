package Collection;

import java.util.Set;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set set = new TreeSet();
       
        set.add(2);
		set.add(1);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(4);
	//	set.add("rohit");
	//    set.add("");            treeset does not accept null value
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(3));
		System.out.println(set);
	}

}
