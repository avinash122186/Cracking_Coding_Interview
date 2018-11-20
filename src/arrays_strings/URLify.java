package arrays_strings;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		System.out.println("Enter the String to check uniqueness");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		System.out.println("URL of the given String is "+makeUrl(in));
	}
	
	private static String makeUrl(String s1)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) == ' ')
			{
				sb.append("%20");
			}
			else
			{
				sb.append(s1.charAt(i));
			}
			
		}
		return sb.toString();
	}

}
