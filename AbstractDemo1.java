package abc;

abstract class KFC
{
	abstract void area();
}

class RE extends KFC
{
	int l,b;
	RE(int l, int b)
	{
		this.l=l;
		this.l=b;
	}
	public void area()
	{
		System.out.println("area of rect is : " +(l*b));
	}
}





public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle t=new Triangle(1,2);
		//t.area();
		RE re=new RE(10,20);
	re.area();

	}

}
