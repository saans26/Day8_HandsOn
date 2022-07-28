/*
 * 2) Write a program that will have a Properties class object which is capable of 
 * storing some States of India and their Capital. Use an Iterator to list all the 
   elements stored in the Properties.
 */


package Day8;

public class P2 
{
	public static void main(String[] args) 
	{
		Properties p = new Properties();
		
		p.addDetails("Assam", "Dispur");
		p.addDetails("Bihar", "Patna");
		
		p.iterator();
		
	}

}
