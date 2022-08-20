package string;

public class String_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String r = "rohit bhanji";
		String rr = new String("  AUTOMATION");
		String s = "java";
		
		System.out.println(r.charAt(6));
		System.out.println(r.codePointAt(2));
		System.out.println(r.codePointBefore(1));
		System.out.println(r.codePointCount(1, 10));
		System.out.println(r.compareTo(rr));
		System.out.println(r.compareToIgnoreCase(rr));
		System.out.println(r.concat(rr));
	    System.out.println(r.contains(rr));
	    System.out.println(r.equals(s));
	    System.out.println(r.isEmpty());
	    System.out.println(r.length());
	    System.out.println(r.replace('i','e'));
	    System.out.println(r.indexOf('h'));
	    System.out.println(r.toUpperCase());
	    System.out.println(rr.toLowerCase());
	    System.out.println(r.endsWith("i"));
	    System.out.println(rr.trim());
	    System.out.println(s.hashCode());
	    System.out.println(r.replace("bhanji", "garad"));
	}

}
