import java.util.Scanner;

public class Task032 {
	public static void main(String[] args) {
		boolean z = false;
		
		System.out.println("Programma p�rbauda sa�emto skaitli, vai tas ir robe��s [50...100].");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet skaitli: ");
		int x = sc.nextInt();
		sc.close();
		
		if (x > 49 && x < 100) {
			z =true;
		}

		System.out.println();
		System.out.println("Rezult�ts ir " + z);
		}
}
