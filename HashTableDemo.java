package abc;

//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer, String>();
		hm.put(100, "a");
		hm.put(101, "b");
		hm.put(102, "c");
		hm.put(100, "d");
		/*hm.put(null, "e");
		hm.put(null, "f");
		hm.put(103, null);
		hm.put(104, null);*/
		hm.put(105, "g");
		System.out.println(hm.size());
		for(Map.Entry m:hm.entrySet())
		{
			{  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  }  
				 
				
		}
	}

}
