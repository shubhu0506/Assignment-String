import java.util.Scanner;

public class Answer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str.toLowerCase();
		boolean result = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println("Pangram String");
		} else {
			System.out.println("Not a Pangram String");
		}
	}
}
