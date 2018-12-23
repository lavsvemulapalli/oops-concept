package abc;
	
	class Kl
	{
		Kl()
		{
			System.out.println("defalut");
		}
		
		Kl(int x)
		{
			System.out.println("1 parm" );
		}
		Kl(int x, int y)
		{
			System.out.println("2 parm");
		}
	
	}
	
	public class Consover {

	public static void main(String[] args) {
		
		Kl a1=new Kl(1,2);
		
		Kl a2=new Kl(1);
		Kl a3=new Kl();
		
		
		
		

	}

}
