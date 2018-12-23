package abc;
class Y
{
	Y()
	{
		System.out.println("defalut cons");
	}
	
	Y(int a)
	{
		System.out.println("1parm: " +a);
	}
	
	Y(int x, int y)
	{
		System.out.println("2parm cons: " +(x+y));
		System.out.println("2parm cons: " +y);
	}
	
	
}



public class ConsOverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Y b1=new Y();
Y b=new Y(5);
Y b2=new Y(2,1);
	}

}
