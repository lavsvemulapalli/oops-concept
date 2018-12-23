package abc;
class X
{
	int x,y;
	X()
	{
		System.out.println("defalut constructor");
	}
	X(int a)
	{
		System.out.println("single parameter");
	}
	X(int a, int b)
	{
		System.out.println("double parameters");
	}	
}

public class ConstructOverloading {

	public static void main(String[] args) {
		X b1= new X ();
		X b2=new X(10);
		X b3=new X(20,30);
		

	}

}
