package abc;

class SD
{
	public void meth1()
	{
		System.out.println("defalut method");
	}
	public void meth1(int x)
	{
		System.out.println("1 parm method");
	}
	public void meth1(int x, int y)
	{
		System.out.println("2 parm method");
	}
}


public class MethOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SD b=new SD();
b.meth1(1);
b.meth1();
b.meth1(1, 2);
	}

}
