package abc;

interface Ab
{
	void meth1();
	void meth2();
	void meth3();
}


class L implements Ab
{
	public void meth1()
	{
		System.out.println("meth1");
	}
	public void meth2()
	{
		System.out.println("meth2");
	}
	
	public void meth3()
	{
		System.out.println("meth3");
	}
	public void show()
	{
		System.out.println("show meth");
	}
}
class Acc implements Ab
{
	public void meth1()
	{
		System.out.println("meth1 in AC CLASS");
	}
	public void meth2()
	{
		System.out.println("meth2 in AC CLASS");
	}
	public void meth3()
	{
		System.out.println("meth3 in AC CLASS");
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L b=new L();
		Ab b1=new Acc();
		b.meth1();
		b.meth2();
		b.meth3();
		b.show();
		b1.meth1();
		b1.meth2();
		b1.meth3();

	}

}
