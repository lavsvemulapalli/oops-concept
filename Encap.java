package abc;

class RW
{
	private int age;
	private String name;
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	
	public String getName()
	{
		return name;
	}
	
}
public class Encap {

	public static void main(String[] args) {
		
		RW b=new RW();
		b.setAge(25);
		b.setName("loves");
	System.out.println("age is : "   +b.getAge() );	
		
	System.out.println("age is : "   +b.getName());		
		
		

	}

}
