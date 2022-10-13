package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		
		list.add(2);
		list.add(1);
		list.add("Rohit");
		list.add(400.25);
		list.add("");
		list.add("");
		list.add(20);
		list.add(400.25);
		list.add("Rohit");
		list.add(1);
		list.add(3, 1.5);
		
		System.out.println(list);
		for (Object object : list) {
			System.out.println(object);			
		}
		
		System.out.println(list.get(4));
		System.out.println(list.isEmpty());
		System.out.println(list.contains(list));
        System.out.println(list.remove(7));
		System.out.println(list.size());
		list.set(3, 300.50);
		System.out.println(list);
	}

}
