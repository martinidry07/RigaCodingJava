import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet veselu skaitli no 1 l�dz 12: ");
		int x = sc.nextInt();
		sc.close();
		
		System.out.println();
		System.out.print(x + " -> ");
		switch(x) {
			case 1: System.out.println("Janv�ris");
				break;
			case 2: System.out.println("Febru�ris");
				break;
			case 3: System.out.println("Marts");
				break;
			case 4: System.out.println("Apr�lis");
				break;
			case 5: System.out.println("Maijs");
				break;
			case 6: System.out.println("J�nijs");
				break;
			case 7: System.out.println("J�lijs");
				break;
			case 8: System.out.println("Augusts");
				break;
			case 9: System.out.println("Septembris");
				break;
			case 10: System.out.println("Oktobris");
				break;
			case 11: System.out.println("Novemris");
				break;
			case 12: System.out.println("Decemris");
				break;
			default: System.out.println("Skaitlis neatbilst diapazonam no 1 l�dz 12 !!!");
		}
	}

}
