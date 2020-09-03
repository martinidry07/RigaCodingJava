import java.util.Scanner;

public class Task092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet veselu skaitli: ");
		int x = sc.nextInt();
		sc.close();
		System.out.println();
		
		for (int i = 0; i<x+1; i++) {
			System.out.println(x + " x " + i + " = " + (x*i));
		}

	}

}
