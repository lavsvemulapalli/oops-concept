package abc;

class  B
{
	int x,y;
B(int a, int b)
{
	x=a;
	y=b;
}
void sum()
{
	System.out.println("sum:" +(x+y));
}
}

public class ConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(5,2);
		b.sum();
		B b1=new B(3,2);
		b1.sum();
		B b2=new B(10,20);
		b2.sum();

	}

}
