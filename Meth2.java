package abc;

class Klm
{
	int x,y;
	void sum1()
	{
		System.out.println("sum1:" +(x+y));
	}
		
		void sum2(int a, int b)
		{
			System.out.println("sum2:" +(a+b));
		}
		
		int sum3()
		{
			return x+y;
			
		}
		
	}




public class Meth2 {

	public static void main(String[] args) {
		
Klm b=new Klm();
b.x=10;
b.y=20;
b.sum1();
b.sum2(2, 1);

System.out.println("sum3:" +b.sum3());
	}

}
