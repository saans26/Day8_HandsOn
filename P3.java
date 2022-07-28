/*
 * 3) Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
 * 
 */


package Day8;

public class P3 
{
	public static void main(String[] args) 
	{
		ContactList c = new ContactList();
		
		c.addDetails("Sanskruti", 97640);
		c.addDetails("Shruti", 84922);
		c.addDetails("Sam", 74822);
		
		c.checkKey("Sanskruti");
		c.checkKey("Sans");
		
		c.checkValue(97640);
		c.checkValue(64829);
		
		c.iterate();
	}

}
