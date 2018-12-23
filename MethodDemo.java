package abc;

class A
{
	int x=1,y=20;
	void sum()
	{
		System.out.println("sum:" +(x+y));
	}
	void sum1(int a, int b )
	{
    System.out.println("sum1:" +(a+b));
	}
	
	int sum2()
	{
		return (x+y);
	}
	
}


public class MethodDemo {

	public static void main(String[] args) {
	A s=new A();
	s.sum();
	s.sum1(5, 5);
	int k=s.sum2();
	System.out.println("sum2:" +k);
	//System.out.println("sum2:" +s.sum2());

	}

}
