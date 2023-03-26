import java.util.Scanner;

public class Answer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2="";
		String[] a=str1.split(" ");
		for(int i=0;i<a.length;i++)
		{
			str2=str2+ reverseStr(a[i]) + " ";
		}
		System.out.println(str2);
	}

	public static String reverseStr(String str) {
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		return str2;
	}
}
