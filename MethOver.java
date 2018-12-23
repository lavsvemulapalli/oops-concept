package abc;

class Abcd
{
	public void show()
	{
		System.out.println("parent class");
	}
}
class Bc extends Abcd
{
	public void show()
	{
		System.out.println("child class");
	}
}

public class MethOver {

	public static void main(String[] args) {
		Bc s=new Bc();
		s.show();

	}

}
