package abc;

public class StringHandDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ABC xyz";
		String s2=new String("ABC");
		char ch[]= {'x','y','z'};
		String s3=new String(ch); 
		
System.out.println("size of string s1 is: " +s1.length());
/*System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.compareTo(s2)); 
System.out.println(s1.contains(s2));
*/
if(s1.equals(s2))
{
	System.out.println("strings are equal");
}
else
{
	System.out.println("strings are not equal");
}
if(s1.equalsIgnoreCase(s3))
{
	System.out.println("Strings are equal");
}
else 
{
	System.out.println("not equal");
}

if(s1.contains(s3))
{
	System.out.println("s2 contains s3");
}

else 
{
	System.out.println("not contain");
}
	}

}
