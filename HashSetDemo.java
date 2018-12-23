package abc;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> h=new HashSet<String>();
h.add("a");
h.add("b");
h.add("c");
h.add("d");
h.add("b");
System.out.println(h.size());
for(String s:h)
{
	System.out.println(s);
}

	}

}
