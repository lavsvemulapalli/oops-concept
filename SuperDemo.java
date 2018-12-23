package abc;
class Z
{
	int x,y;
	Z(int a)
	{
		System.out.println("Parent:" +a);
	}
	public void show()
	{
		System.out.println("lavanya");
	}
}

class V extends Z
{
	V(int k)
	{
		super(10);
		super.show();
		super.x=1;
		super.y=4;
		System.out.println("child:" +k);
		System.out.println(+(x+y));
	}
}




public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
V g=new V(2);
	}

}
