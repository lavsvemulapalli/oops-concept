package abc;
interface P
{
	void meth1();
}
interface Q
{
	void meth2();
}
interface R extends P,Q
{
	void meth2();
}

class AS implements R
{
	public void meth1()
	{
		System.out.println("meth1: lavanaya");
	}
	public void meth2()
	{
		System.out.println("meth2");
	}
	public void meth3()
	{
		System.out.println("bharath");
	}
}



public class MultipleInherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AS b=new AS();
		//R b=new AS();
		b.meth1();
		b.meth2();
		b.meth3();

	}

}
