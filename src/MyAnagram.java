import java.util.Arrays;
import java.util.Scanner;

public class MyAnagram 
{
	public static void main(String args[])
	{
		Scanner kb =  new Scanner (System.in);
		System.out.println("Enter two string");
		String str1 = kb.next();
		String str2 = kb.next();
		int arr1[] = new int[26];
		int arr2[] = new int[26];
		for (int i = 0; i < str1.length(); i++)
		{
			arr1[str1.charAt(i)-97]++;
		}
		for (int i = 0; i < str2.length(); i++)
		{
			arr2[str2.charAt(i)-97]++;
		}
		
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("String are not anagram");
		}
		
		
	}
}
