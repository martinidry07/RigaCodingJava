import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet savu vârdu: ");
		String name = sc.nextLine();
		System.out.print("Lûdzu ievadiet veselu skaitli A: ");
		int a = sc.nextInt();
		System.out.print("Lûdzu ievadiet veselu skaitli B: ");
		int b = sc.nextInt();
		sc.close();

		System.out.println();
		int gar = name.length();
		System.out.println();
		if (a>b) {
			System.out.println("Skaitlis " + a + " ir lielâks par skaitli " + b + ".");
		}else if (a==b) {
			System.out.println("Skaitlis " + a + " ir vienâds ar skaitli " + b + ".");
		} else {
			System.out.println("Skaitlis " + a + " ir mazâks par skaitli " + b + ".");
		}
		int sum=a+b;
		
		System.out.println();
		System.out.print("Skaitïu " + a + " un " + b + " summa ir " + sum + ", kas ir ");
		if (sum>gar) {
			System.out.print("lielâka p");
		}else if (sum==gar) {
			System.out.print("vienâda ");
		}else {
			System.out.print("mazâka p");
		}
		System.out.println("ar vârda "  + name + " burtu skaitu - " + gar + ".");

	}

}
