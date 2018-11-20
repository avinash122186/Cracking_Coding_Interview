package arrays_strings;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println("Enter the String to Compress");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		System.out.println("Compressed String is : "+compress(in));
	}

	public static String compress(String s)
	{
		StringBuilder sb = new StringBuilder();
		int count =1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i) == s.charAt(i+1) )
			{
				count++;
				if(i == s.length()-2)
				{
					sb.append(s.charAt(i)).append(count);
				}
			}
			else if(s.charAt(i) != s.charAt(i+1))
			{
				sb.append(s.charAt(i)).append(count);
				count =1;
			}
			
		}
		if(s.length() > sb.toString().length())
		{
			return sb.toString();
		}
		else
		{
			return s;
		}
	}
}
