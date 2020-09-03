import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet pirmo skaitli: ");
		int x = sc.nextInt();
		System.out.print("Lûdzu ievadiet otro skaitli: ");
		int y = sc.nextInt();
		System.out.print("Lûdzu ievadiet otro skaitli: ");
		int z = sc.nextInt();
		sc.close();
		boolean irx = false;
		boolean irz = false;
		
		if (y == x) {
			y = 0;
			irx = true;
		}
		if (z == x || z == y) {
			x = 0;
			irz = true;
		}
		if (irx == true) {
			x = 0;
		}
		if (irz == true) {
			z = 0;
		}

		int rez = x + y + z;

		System.out.println();
		System.out.println("Rezultâts ir " + rez);
	}

}
