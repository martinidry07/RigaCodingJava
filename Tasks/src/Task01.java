import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		System.out.println("Programma sa�em ievad� divus veselus skait�us un izvada skait�u summu.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet pirmo skaitli: ");
		int x = sc.nextInt();
		System.out.print("L�dzu ievadiet otro skaitli: ");
		int y = sc.nextInt();
		sc.close();
		
		int z = x + y;

		System.out.println();
		System.out.println("Skait�u summa ir " + z);

	}
}
