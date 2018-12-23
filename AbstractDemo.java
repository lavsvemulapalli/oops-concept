package abc;

abstract class Shapes
{
	abstract void area();
	public void show()
	{
		System.out.println("non abstarct method");
	}
}
class Rect1 extends Shapes
{
	int x,y;
	Rect1(int x, int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void area()
	{
		System.out.println("area of rect is:"  +(x*y));
	}
}

class Tri1 extends Shapes
{
	int x,y;
Tri1(int x, int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void area()
	{
		System.out.println("area of rect is:"  +0.5*(x*y));
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		Rect1 r=new Rect1(5,4);
		r.area();
		Tri1 t=new Tri1(2,3);
		t.area();
		r.show();
		t.show();

	}

}
