package abc;
class EC
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

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		EC b=new EC();
		b.setAge(10);
		b.setName("lavanya");
		System.out.println("age:" +b.getAge());
		System.out.println("name:"+b.getName());
		

	}

}
