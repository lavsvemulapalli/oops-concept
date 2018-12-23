package abc;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("a");
		System.out.println("size is : " +al.size());
		al.remove(1);
		/*for(String s:al)
		{
			System.out.println(s);
		}
		*/
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
