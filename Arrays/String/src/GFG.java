import java.util.Scanner;

// Java implementation of the approach
public class GFG {

	// Function to return the modified string
	static int extractInt(String str)
	{
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^0-9]", " "); // regular expression

		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll(" +", " ");
int sum = 0 ;
		for (int i = 0; i < str.length(); i++) {

				sum=sum+(int)str.charAt(i);
			}

//		if (str.equals(""))
//			return "-1";

		return sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		String str= String.valueOf(Integer.parseInt(in.nextLine()));
		str = str.replaceAll("[^0-9]", " "); // regular expression

		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll(" +", " ");
		int sum = 0 ;
		int i =0;
		int n =str.length();
		int x=Integer.parseInt(str);
		while (str.charAt(i)!=' '&&i<n){

				sum=x+sum*10;
				i++;
		}

		System.out.println(sum);
	}
}
