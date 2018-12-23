package abc;

public class StringDemo {

	public static void main(String[] args) {
		
	String s1="abc xyz";
	char ch[]= {'x','y','z'};
	String s2=new String(ch);
	String s3= new String("klm");
	System.out.println(s1.equals(s3));
	
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	
	System.out.println(s2.compareTo(s3));
	System.out.println(s1.compareTo(s2));
	
	System.out.println(s1.contains(s2));
	System.out.println(s2.contains(s3));
	
	
	}

}
