import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet savu v�rdu: ");
		String name = sc.nextLine();
		System.out.print("L�dzu ievadiet veselu skaitli A: ");
		int a = sc.nextInt();
		System.out.print("L�dzu ievadiet veselu skaitli B: ");
		int b = sc.nextInt();
		sc.close();

		System.out.println();
		int gar = name.length();
		System.out.println();
		if (a>b) {
			System.out.println("Skaitlis " + a + " ir liel�ks par skaitli " + b + ".");
		}else if (a==b) {
			System.out.println("Skaitlis " + a + " ir vien�ds ar skaitli " + b + ".");
		} else {
			System.out.println("Skaitlis " + a + " ir maz�ks par skaitli " + b + ".");
		}
		int sum=a+b;
		
		System.out.println();
		System.out.print("Skait�u " + a + " un " + b + " summa ir " + sum + ", kas ir ");
		if (sum>gar) {
			System.out.print("liel�ka p");
		}else if (sum==gar) {
			System.out.print("vien�da ");
		}else {
			System.out.print("maz�ka p");
		}
		System.out.println("ar v�rda "  + name + " burtu skaitu - " + gar + ".");

	}

}
