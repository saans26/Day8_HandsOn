/*
 * 1)Create a Collection called HashMap which is capable of storing String objects.
 The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.

 */


package Day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P1 {

	public static void main(String[] args) 
	{
		Map<String, String> h = new HashMap<String,String>();
		
		h.put("A1","Sanskruti");
		h.put("A2", "Shruti");
		h.put("A3", "Samiksha");
		
		//a) Check if a particular key exists or not.
		boolean exists = h.containsKey("A2");
		System.out.println("A2 " + exists);
		exists = h.containsKey("A6");
		System.out.println("A6 " + exists);
		System.out.println();
		//b) Check if a particular value exists or not.
		boolean exist = h.containsValue("Sanskruti");
		System.out.println("Sanskruti " + exist);
		exist = h.containsValue("Shiva");
		System.out.println("Shiva " + exist);
		System.out.println();
		//c) Use Iterator to loop through the map.
		Iterator<Map.Entry<String, String>> it = h.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> e = it.next();
			System.out.println("Key = " + e.getKey() +"\nValue = " + e.getValue());
		}
	}

}
