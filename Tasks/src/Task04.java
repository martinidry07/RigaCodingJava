import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet pirmo tekstu: ");
		String str1 = sc.nextLine();
		System.out.print("Lûdzu ievadiet otro tekstu: ");
		String str2 = sc.nextLine();
		sc.close();

		String out;
		System.out.println();
		if (str1.length() >= str2.length()) {
			 out = "\"" + str2 + "\", " + "\"" + str1 + "\" -> " + str2 + str1 + str2;
		} else {
			 out = "\"" + str1 + "\", " + "\"" + str2 + "\" -> " + str1 + str2 + str1;
		}

		System.out.println( out );
	}

}
