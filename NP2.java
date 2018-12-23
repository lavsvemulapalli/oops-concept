package abc;

public class NP2 {

	public static void main(String[] args) {
		
	String s1="abc klm";
	char ch[]= {'A','B','C', 'D'};
	String s2 =new String(ch);
	String s3 =new String("klm");
	//System.out.println(s3);
	System.out.println("length of string is: " + s2.length());
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("string are equal");

	}
	else
	{
		System.out.println("string are not equal");
	}
	char n= s1.charAt(2);
	System.out.println(n);
	System.out.println("compare of s1 and s3: " + s1.compareTo(s3)) ;
	if(s1.contains(s2)) {
		System.out.println("true");	
	}
		else
		{
			System.out.println("false");	
	}
	

}
}