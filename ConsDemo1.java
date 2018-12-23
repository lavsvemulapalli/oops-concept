package abc;


class G
{
	int x,y;
	
	G(int a, int b)
	{
		x=a;
		y=b;
	}
	
void sum()
{
	System.out.println("sum is:" +(x+y) );
}	
	
}

public class ConsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
G b1=new G(5,10);
b1.sum();
G b2=new G(3,1);
b2.sum();

G b3=new G(3,10);
b3.sum();
	}

}
