package abc;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	int x=20,y=2;
	int z=x/y;
	System.out.println("z value is: "  + z);
	int a[]= {1,2,3,4};
	//a[7]=5;
	System.out.println("end of Try");
	
}
		
		catch(Exception e)
{
			System.out.println(e);
			System.out.println("end of catch");
}

/*catch(ArithmeticException ae)

{
	
	System.out.println(ae);
	System.out.println("end of catch");
	
}

catch(ArrayIndexOutOfBoundsException ai)
{
	System.out.println(ai);
	System.out.println("end of catch 1");
}*/
System.out.println("end of pgm");
		
	}

}
