import java.util.Scanner;

public class Answer7{

	public static void main(String[] args)
	{
		int vCount=0;
		int cCount=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='u')
			{
				vCount++;
			}
			else
			{
				cCount++;
			}
		}
		
		System.out.println("Number of Vowels are : " + vCount);
		System.out.println("Number of Consonants are : " + cCount);
	}
}
