/*
 * 3) Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
 * 
 */


package Day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList 
{
	HashMap<String, Integer> h = new HashMap<>();
	
	public void addDetails(String name, Integer number)
	{
		h.put(name, number);
	}
	
	public void checkKey(String name)
	{
		boolean exist = h.containsKey(name);
		System.out.println(name + " exists : " + exist);
	}
	
	public void checkValue(Integer number)
	{
		boolean exists = h.containsKey(number);
		System.out.println(number + " exists : " + exists);
	}
	
	public void iterate()
	{
		Iterator<Map.Entry<String, Integer>> it = h.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	

}
