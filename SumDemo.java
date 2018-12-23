package abc;

class kb
{
	int x=10,y=20;
	//int x,y;

	
	 void sum1()
	{
		System.out.println("sum1:" +(x+y));
	}
	
	 void sum2(int a, int b)
	{
		System.out.println("sum1:" +(a+b));
	}
	
	int sum3()
	{
		return x+y;
	}
	
	
}

public class SumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kb a=new kb();
		a.x=5;
		a.y=5;
		a.sum1();
		a.sum2(1, 2);
		/*int k=a.sum3();
		System.out.println(k);
		*/
		a.x=2;
		a.y=10;
		System.out.println(a.sum3());

	}

}
