import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		System.out.println("Programma saòem ievadç divus veselus skaitïus un izvada skaitïu summu.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet pirmo skaitli: ");
		int x = sc.nextInt();
		System.out.print("Lûdzu ievadiet otro skaitli: ");
		int y = sc.nextInt();
		sc.close();
		
		int z = x + y;

		System.out.println();
		System.out.println("Skaitïu summa ir " + z);

	}
}
