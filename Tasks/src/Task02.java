import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {

		System.out.println("Programma saòem ievadç trîs skaitïus un izvada skaitïu vidçjo vçrtîbu.");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet pirmo skaitli: ");
		int x = sc.nextInt();
		System.out.print("Lûdzu ievadiet otro skaitli: ");
		int y = sc.nextInt();
		System.out.print("Lûdzu ievadiet otro skaitli: ");
		int z = sc.nextInt();
		sc.close();

		float average = (float) (x + y + z) / 3;

		System.out.println();
		System.out.println("Skaitïu vidçjâ vçrtîba ir " + average);

	}
}
