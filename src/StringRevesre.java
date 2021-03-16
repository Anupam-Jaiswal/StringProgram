import java.util.Scanner;

public class StringRevesre
{
	public static void main(String args[])
	{
		//Solution 1
		
		
		/*Scanner kb = new Scanner (System.in);
		System.out.println("Enter the string");
		String str = kb.next();
		StringBuffer rev = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--)
		{
			rev.append(str.charAt(i));
		}
		System.out.println(rev);*/
		
		//Solution 2
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter the string");
		String str = kb.next();
		String rev = new String();
		for(int i = str.length() - 1; i >= 0; i-- )
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		
	}
	
}

/*input = anupam
output = mapuna*/
