import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet vienu latvieðu alfabçta burtu: ");
		String ch = sc.nextLine();
		sc.close();

		List<String> vowel = Arrays.asList("a", "e","i", "u", "â", "ç", "î", "û");
		List<String>  consonant = Arrays.asList("c", "è", "b", "d", "f", "g",
											"ì", "h","j", "k", "í", "l", "ï","m", "n", "ò",
												"p", "r", "s", "ð", "t", "v", "z", "þ");
		// 1.variants
		
		System.out.println();
		System.out.print(ch + " -> ");
		
		if (ch.equalsIgnoreCase("o")) {
			System.out.print("patskanis & divskanis");
		} else if (vowel.indexOf(ch.toLowerCase())>=0) {
			System.out.print("patskanis");
		} else if(consonant.indexOf(ch.toLowerCase())>=0) {
			System.out.print("lîdzkanis");
		} else {
			System.out.println("Nav izpildîti ievades nosacîjumi !!!");
		}
			
		// 2.variants
		String vowelString = "aâeçiîuû";
		String consonantString = "cèbdfgìhjkílïmnòprsðtvzþ";
		System.out.println();
		System.out.println();
		System.out.println("2. variants ...");
		System.out.print(ch + " -> ");
		ch=ch.toLowerCase();
		if (ch.equals("o")) {
			System.out.print("patskanis & divskanis");
		} else if (vowelString.contains(ch)) {
			System.out.print("patskanis");
		} else if(consonantString.contains(ch)) {
			System.out.print("lîdzkanis");
		} else {
			System.out.println("Nav izpildîti ievades nosacîjumi !!!");
		}
		
	}

}
