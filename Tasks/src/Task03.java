import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet pirmo skaitli: ");
		int x = sc.nextInt();
		System.out.print("L�dzu ievadiet otro skaitli: ");
		int y = sc.nextInt();
		sc.close();

		int z = x + y;
		if (z > 9 && z < 20) {
			z = 20;
		}

		System.out.println();
		System.out.println("Rezult�ts ir " + z);

	}
}
