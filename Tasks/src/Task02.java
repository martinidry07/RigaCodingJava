import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {

		System.out.println("Programma sa�em ievad� tr�s skait�us un izvada skait�u vid�jo v�rt�bu.");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet pirmo skaitli: ");
		int x = sc.nextInt();
		System.out.print("L�dzu ievadiet otro skaitli: ");
		int y = sc.nextInt();
		System.out.print("L�dzu ievadiet otro skaitli: ");
		int z = sc.nextInt();
		sc.close();

		float average = (float) (x + y + z) / 3;

		System.out.println();
		System.out.println("Skait�u vid�j� v�rt�ba ir " + average);

	}
}
