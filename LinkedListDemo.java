package abc;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		System.out.println("before remove:" +ll.size());
		ll.remove("b");
		System.out.println("after remove:" +ll.size());
		
		for(String s:ll)
		{
			System.out.println(s);
		}
		
	}

}
