import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet veselu skaitli: ");
		int x = sc.nextInt();
		System.out.print("Lûdzu ievadiet veselu skaitli: ");
		int y = sc.nextInt();
		sc.close();
		System.out.println();

		if (x > y) {
			int z = x;
			x = y;
			y = z;
		}
		
		System.out.print(x + ", " + y + " -> ");
		boolean jauBija = false;

		for (int i = x; i < y + 1; i++) {
			if (!((i % 5) == 0) && ((i % 3) == 0) && ((i % 2) == 0)) {
				if (jauBija) {
					System.out.print(",");
				}				
				System.out.print(i);
				jauBija = true;
			}

		}

	}
}
