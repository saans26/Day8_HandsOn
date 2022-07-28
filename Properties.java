/*
 * 2) Write a program that will have a Properties class object which is capable of 
 * storing some States of India and their Capital. Use an Iterator to list all the 
   elements stored in the Properties.
 */

package Day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Properties 
{
	HashMap<String,String> h = new HashMap<>();
	
	public void addDetails(String state, String capital)
	{
		h.put(state, capital);
	}
	
	public void iterator()
	{
		Iterator<Map.Entry<String, String>> it = h.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
