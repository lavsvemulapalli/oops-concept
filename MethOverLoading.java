package abc;
class Vk
{
	int x,y;
	public void meth1()
	{
		System.out.println("lavanya");
	}
	public void meth1(int x)
	{
		this.x=x;
		System.out.println(+x);
	}
	public void meth1(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(+(x+y));
	}
}

public class MethOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vk k=new Vk();
		k.meth1();
		k.meth1(1);
		k.meth1(10, 2);
		
		
		
	}

}
