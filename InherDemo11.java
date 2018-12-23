package abc;
class JH
{
	public void meth1()
	{
		System.out.println("parent class");
	}
}
class KF extends JH
{
	public void meth2()
	{
		System.out.println("child class");
	}
}



public class InherDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
KF b=new KF();
b.meth1();
b.meth2();
	}

}
