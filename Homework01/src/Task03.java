import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet veselu skaitli A: ");
		int a = sc.nextInt();
		System.out.print("Lûdzu ievadiet decimâlskaitli B: ");
		int b = sc.nextInt();
		sc.close();
		float rez = (float) a+b;
		System.out.println();
		System.out.println("Skaitïu " + a + " un " + b + " summa ir " + rez);
		rez = (float) a-b;
		System.out.println("Skaitïu " + a + " un " + b + " starpîba ir " + rez);
		rez = (float) a/b;
		System.out.println("Skaitïu " + a + " un " + b + " dalîjums ir " + rez);
		rez = (float) a*b;
		System.out.println("Skaitïu " + a + " un " + b + " reizinâjums ir " + rez);
		rez = (float) (a+b)*(a+b);
		System.out.println("Skaitïu " + a + " un " + b + " summas kvadrâts ir " + rez);
	}

}
