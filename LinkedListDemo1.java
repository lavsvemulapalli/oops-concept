package abc;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("a");
		System.out.println("size is : " +al.size());
		al.remove(1);
		for(String s:al)
		{
			System.out.println(s);
		}
		
	}

}
