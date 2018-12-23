package abc;
class Kj
{
	int a,b;
	Kj(int x)
	{
		System.out.println("parent parm :" +x);
		
	}
	void show()
	{
		System.out.println("parent show method");
	}
	
	void sum()
	{
		System.out.println("sum of instance class: "        +(a+b));
	}
	
}

class Pj extends Kj
{
	Pj(int x, int y)
	{
		super(5);
		super.a=20;
		super.b=30;
		super.sum();
		super.show();
		System.out.println("child cons :" +(x+y));
	}
}

public class SuperDemo1 {

	public static void main(String[] args) {
		
Pj b=new Pj(10,20);
	}

}
