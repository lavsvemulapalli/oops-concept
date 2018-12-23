package abc;
class Mn
{
	int x,y;
	
	Mn(int a)
	{
		System.out.println("1 parm:" +a );
}
	
	public void show()
	{
		System.out.println("show started");
	}
}

class Pack extends Mn
{
	Pack(int z)
	{
		super(5);
		super.show();
		super.x=2;
		super.y=3;
	
	System.out.println("child param:" +z);
	}
}






public class Super_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pack b1=new Pack(200);

	}

}
