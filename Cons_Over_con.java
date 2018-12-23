package abc;

class K
{
	int x,y;
	
	K(int x)
	{
		System.out.println("single parameter constructor:" +x);
	}
	K(int x, int y)
	{
		this(5);
		this.x=x;
		this.y=y;
		this.show();
		
		
	}
	
	public void sum()
	{
		System.out.println("sum is:"  +(x+y) );
	}
	
	
	public void show()
	{
		System.out.println("show time");
	}
}






public class Cons_Over_con {

	public static void main(String[] args) {
		K h=new K(10,20);
		h.sum();
	}
	
}
