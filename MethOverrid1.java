package abc;

class Uv
{
	public void show1()
	{
		System.out.println("parent class");
	}
	
}

class DR extends Uv
{
	public void show1()
	{
		System.out.println("child class");
	}
}


public class MethOverrid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DR b=new DR();
b.show1();

	}

}
