package abc;

public class StringHandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="XYZ abc";
		String s2=new String("XYZ");
		char ch[]= {'a','b','c'};
		String s3=new String(ch);
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are equal");
		}
		else
		{
			System.out.println("s1 and s2 are not equal");
		}
		
		System.out.println("*******************************************");
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("s1 and s2 are equal and igonere case ");
		}
		else
		{
			System.out.println("s1 and s2 are not equal and igonere case");
		}
System.out.println("*******************************************");
		
		if(s1.contains(s3))
		{
			System.out.println("s1 string contains is s3 ");
		}
		else
		{
			System.out.println("s1 string not contains is s3");
		}
	}

}
