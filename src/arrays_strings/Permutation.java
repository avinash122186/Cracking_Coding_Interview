package arrays_strings;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		System.out.println("Enter the Strings to check Permutation");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		boolean result = isPermutation(s1, s2);
		System.out.println("Is String 1 and String 2 are permutation of Each other ?\n" +result);
		System.out.println("Is String 1 and String 2 are permutation without Sorting of Each other ?\n" +isPermutationWithoutSort(s1, s2));
	}
	private static boolean isPermutation(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	private static String sort(String s)
	{
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	private static boolean isPermutationWithoutSort(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		int[] letters = new int[128];
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			letters[c]++;
		}
		for(int i=0;i<s1.length();i++)
		{
			int n = (int)s2.charAt(i);
			letters[n]--;
			if(letters[n]<0)
			{
				return false;
			}
		}
		return true;
	}
}
