package abc;
class D
{
	int x,y;
	D(int x, int y)
	{
		/*x=a;
		y=b;*/
		this.x=x;
		this.y=y;
	}
	
	public void sum()
	{
		System.out.println("sum is:" +(x+y) );
	}
}



public class ParmCons {


public static void main(String[] args) {
	
	D b1=new D(10,20);
	b1.sum();
	
	
	
	
	
	
	
}
}