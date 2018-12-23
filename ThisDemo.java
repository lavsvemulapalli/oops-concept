package abc;

class Mv
{
	int x,y;
	/*Mv(int a, int b)
	{
		x=a;
		y=b;
	}*/
	Mv(int a)
	{
		System.out.println(a);
	}
	
	
	Mv(int x,int y)
	
	{
		this(5);
		this.show();
		this.x=x;
		this.y=y;
	}
	public void meth1()
	{
		System.out.println(+(x+y));
	}
	public void show()
	{
		System.out.println("lavanya");
	}
}


public class ThisDemo {

	public static void main(String[] args) {
		Mv a=new Mv(1,2);
		a.meth1();
		// TODO Auto-generated method stub

	}

}
