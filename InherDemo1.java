package abc;
class PA
{
	void meth1()
	{
		System.out.println("parent class");
	}
}

class QR extends PA
{
	void meth2()
	{
		System.out.println("child class");
	}
}


public class InherDemo1 {

	public static void main(String[] args) {
		QR b=new QR();
		b.meth1();
		b.meth2();
		
		
		
		
		
	}

}
