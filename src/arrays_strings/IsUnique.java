package arrays_strings;
import java.util.*;
public class IsUnique { 

	public static void main(String[] args) {
		System.out.println("Enter the String to check uniqueness");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		char[] arr = in.toCharArray();
		System.out.println("String is Unique ? \n" +uniqueWithDataStructure(arr));
		
	}

	private static boolean uniqueWithDataStructure(char[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	

}
