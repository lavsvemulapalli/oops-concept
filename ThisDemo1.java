package abc;
class U
{
	int x,y;
	
	U(int a)
	{
		System.out.println("single param cons:: " +a);
	}
		
	U(int x, int y)
	{
		this(20);
		this.x=x;
		this.y=y;
		this.show();
	}
	void sum()
	{
		System.out.println("sum is: " +(x+y) );
	}
	
	void show()
	{
		System.out.println("show method");
	}
}

public class ThisDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		U b=new U(1,2);
		b.sum();
		
		//b.show();
		
	}

}
