import java.util.Scanner;

public class Answer5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char[] charArray=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(charArray[i]==charArray[j])
				{
					System.out.println(charArray[j]);
				}
			}
		}
		
	}
}
