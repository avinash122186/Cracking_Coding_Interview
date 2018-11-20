package arrays_strings;

import java.util.Scanner;

public class OneAway {
	public static boolean replaceCharacter(String s1, String s2)
	{
		int res =0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				res++;
			}
		}
		if(res >1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	public static boolean removeCharacter(String s1, String s2)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				
			}
		}
		return false;
	}
	public static boolean addCharacter(String s1, String s2)
	{
		
		return false;
	}
	public static boolean checkLength(String s1, String s2)
	{
		if((s1.length() - s2.length() >1) || (s2.length() - s1.length() >1))
		{
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter the Strings to check OneEdit");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		System.out.println("Replace Character Works ?\n"+replaceCharacter(s1,s2));
	}

}
