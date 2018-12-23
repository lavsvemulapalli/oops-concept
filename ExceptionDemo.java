package abc;

public class ExceptionDemo {

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
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("catch");
		}
		
		
		/*catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("catch1");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
			System.out.println("catch 2");
		}
		*/
		System.out.println("end pgm");

}
}
