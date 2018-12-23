package abc;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("loves");
al.add("bharath");
al.add("a");
al.add("b");
al.add("c");
al.add("gh");
System.out.println("size of collection is: " +al.size());
al.remove("c");
al.add("lavanya");
al.add("hjkk");

/*Iterator<String> i=al.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}*/

for(String s:al)
{
	System.out.println(s);
}


	}

}
