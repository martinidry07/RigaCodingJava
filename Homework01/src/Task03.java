import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet veselu skaitli A: ");
		int a = sc.nextInt();
		System.out.print("L�dzu ievadiet decim�lskaitli B: ");
		int b = sc.nextInt();
		sc.close();
		float rez = (float) a+b;
		System.out.println();
		System.out.println("Skait�u " + a + " un " + b + " summa ir " + rez);
		rez = (float) a-b;
		System.out.println("Skait�u " + a + " un " + b + " starp�ba ir " + rez);
		rez = (float) a/b;
		System.out.println("Skait�u " + a + " un " + b + " dal�jums ir " + rez);
		rez = (float) a*b;
		System.out.println("Skait�u " + a + " un " + b + " reizin�jums ir " + rez);
		rez = (float) (a+b)*(a+b);
		System.out.println("Skait�u " + a + " un " + b + " summas kvadr�ts ir " + rez);
	}

}
