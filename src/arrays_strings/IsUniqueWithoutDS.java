package arrays_strings;
import java.util.Scanner;

public class IsUniqueWithoutDS {

	public static void main(String[] args) {
		System.out.println("Enter the String to check uniqueness");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		System.out.println("Is Given String Unique ?\n"+checkUniqueness(in));
		System.out.println("Is Given String Unique ?\n"+checkString(in));
	}

	private static boolean checkString(String in)
	{
		in = in.toLowerCase();
		System.out.println(in);
		for(int i=0;i<in.length();i++)
		{
			for(int j=i+1;j<in.length();j++)
			{
				if(in.charAt(i) == in.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	private static boolean checkUniqueness(String in) {
		int checker=0;
		if(in.length()>128)
		{
			return false;
		}
		for(int i=0;i<in.length();i++)
		{
			int x = in.charAt(i) -'a';
			if((checker & ( 1 << x)) >0)
			{
				return false;
			}
			checker |= (1 << x);
		}
		return true;
	}

}
