import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet veselu skaitli: ");
		int x = sc.nextInt();
		sc.close();

		System.out.println();
		System.out.print(x + " -> ");

		for (int i = 0; i <= x; i++) {
			System.out.print(i);
			if (i != x) {
				System.out.print(",");
			}
		}
		System.out.println();
		x = -x;
		System.out.print(x + " -> ");
		for (int i = x; i <= 0; i++) {
			System.out.print(i);
			if (i != 0) {
				System.out.print(",");
			}
		}
		

	}

}
