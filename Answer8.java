import java.util.Scanner;

public class Answer8 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		 for (int i = 0; i < s.length(); i++) {
	            if (!Character.isDigit(s.charAt(i))
	                && !Character.isLetter(s.charAt(i))
	                && !Character.isWhitespace(s.charAt(i))) {
	                count++;
	            }
	        }
		System.out.println(count);
	}
	
}
