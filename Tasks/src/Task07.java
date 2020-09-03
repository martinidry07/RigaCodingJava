import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("L�dzu ievadiet vienu latvie�u alfab�ta burtu: ");
		String ch = sc.nextLine();
		sc.close();

		List<String> vowel = Arrays.asList("a", "e","i", "u", "�", "�", "�", "�");
		List<String>  consonant = Arrays.asList("c", "�", "b", "d", "f", "g",
											"�", "h","j", "k", "�", "l", "�","m", "n", "�",
												"p", "r", "s", "�", "t", "v", "z", "�");
		// 1.variants
		
		System.out.println();
		System.out.print(ch + " -> ");
		
		if (ch.equalsIgnoreCase("o")) {
			System.out.print("patskanis & divskanis");
		} else if (vowel.indexOf(ch.toLowerCase())>=0) {
			System.out.print("patskanis");
		} else if(consonant.indexOf(ch.toLowerCase())>=0) {
			System.out.print("l�dzkanis");
		} else {
			System.out.println("Nav izpild�ti ievades nosac�jumi !!!");
		}
			
		// 2.variants
		String vowelString = "a�e�i�u�";
		String consonantString = "c�bdfg�hjk�l�mn�prs�tvz�";
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
			System.out.print("l�dzkanis");
		} else {
			System.out.println("Nav izpild�ti ievades nosac�jumi !!!");
		}
		
	}

}
