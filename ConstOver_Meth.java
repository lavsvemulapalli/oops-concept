package abc;
class E
{
	int x,y;
	E(int x, int y)
	{
		
		this.x=x;
		this.movie();
		this.y=y;	
		
	}
	
	public void sum()
	{
		System.out.println("sum is:" +(x+y));
	}
	
	public void movie()
	{
		System.out.println("wathching movie");
	}
	
	
}



public class ConstOver_Meth {
	

	public static void main(String[] args) {
		
E b=new E(10,20);
b.sum();
	}

}
