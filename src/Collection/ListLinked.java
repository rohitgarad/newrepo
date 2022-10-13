package Collection;

import java.util.LinkedList;
import java.util.List;

public class ListLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		List list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add("Rohit");
		list.add(400.25);
		list.add("");
		list.add("");
		list.add(2);
		list.add(400.25);
		list.add("Rohit");
		list.add(1);
		
		System.out.println(list);
		for (Object i : list) {
			System.out.println(i);
			
		}
		
		System.out.println(list.get(5));
		System.out.println(list.isEmpty());
		System.out.println(list.contains(list));
    	System.out.println(list.remove(2));
		System.out.println(list.size());
		list.set(3, 300.50);
		System.out.println(list);
	

	}

}
