import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet savu vârdu un uzvârdu ar atstarpi: ");
		String input = sc.nextLine();
		sc.close();

		System.out.println();

		if (input.length() < 3) {
			System.out.println("Kïûda!! Ievadîti tikai divi simboli.");
		} else {

			input = input.trim();
			int poz = input.indexOf(" ");

			switch (poz) {
			case -1:
				printName(input);
				break;
			default:
				printName(input.substring(0, poz));
				input = (input.substring(poz)).trim();
				poz = input.indexOf(" ");
				if (poz == -1) {
					printSurname(input);
				} else {
					printSurname(input.substring(0, poz));
					printSurname((input.substring(poz)).trim());
				}

			}
		}
	}



	public static void printName(String word) {
		word = word.toLowerCase();
		String first = word.charAt(0) + "";
		first = first.toUpperCase();
		word = word.substring(1);
		System.out.println("\'" + first + word + "\'");
	}

	public static void printSurname(String word) {
		word = word.toUpperCase();
		System.out.println(word);
	}
}
