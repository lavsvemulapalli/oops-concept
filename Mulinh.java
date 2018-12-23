package abc;

interface Gc
{
	void meth1();
}


interface F
{
	void meth1();
	
}

interface O extends Gc,F
{
	void meth3();
}

class YT implements O
{
	public void meth1()
	{
		System.out.println("GC meth1");
	}
	/*public void meth2()
	{
		System.out.println("F meth2");
	}*/
	
	public void meth3()
	{
		System.out.println("O meth3");
	}
	
	
}

public class Mulinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//O b=new YT();
YT b=new YT();
b.meth1();
//b.meth2();
b.meth3();
		
		
		
		
		
	}

}
