package abc;

class Abcde
{
	public void show()
	{
		System.out.println("parent class");
	}
}
class Bcd extends Abcd
{
	public void show()
	{
		System.out.println("child class");
	}
}

public class MethOverriding {

	public static void main(String[] args) {
		Bcd s=new Bcd();
		s.show();

	}

}
