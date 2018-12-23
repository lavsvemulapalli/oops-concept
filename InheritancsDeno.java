package abc;
class M

{
	int x,y;
	public void sum1()
	{
		System.out.println("sum1 is:" +(x+y));
	}
}
	
	class N extends M
	{
		
	public void sum2(int a, int b)
	{
		System.out.println("sum 2 is :"  +(a+b));
	}
}






public class InheritancsDeno {

	public static void main(String[] args) {
		N b=new N();
		b.sum1();
		b.sum2(5, 5);

	}

}
