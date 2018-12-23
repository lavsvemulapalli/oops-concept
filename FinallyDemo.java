package abc;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int x=10;
		int y=2;
		int z=x/y;
		System.out.println("z value is:" +z);
		//System.out.println("try block");
		int a[]= {1,2,3,4};
		a[7]=5;
		System.out.println("try block2");

	}
		/*catch(Exception e)
		{
			System.out.println(e);
			System.out.println("catch");
		}*/
		finally
		{
			System.out.println("lavanya");
		}
		
	}

}
