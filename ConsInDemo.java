package abc;
class Gt
{
	Gt()
	{
		System.out.println("parent class");
	}
}
class Ft extends Gt
{
	Ft()
	{
		System.out.println("child class");
	}
}

public class ConsInDemo {

	public static void main(String[] args) {
		Ft b=new Ft();

	}

}
