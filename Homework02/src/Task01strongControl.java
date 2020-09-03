import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01strongControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet savu vârdu un uzvârdu ar atstarpi: ");
		int i = -1;
		String input;
		String text = "";
		String name = "";
		List<String> surname = new ArrayList<>();
		String surnameNew;

		int poz = -2;
		do {
			input = sc.nextLine();
			if (!(input.contains(" "))) { // text with out space - error
				writeThis("Uzrakstîtais teksts ir bez atstarpes " + "- nav ievçroti ievades nosacîjumi !!!");
			} else if (input.indexOf(" ") == 0) { // space is first - error
				writeThis("Vai tieðâm Jûsu vârda pirmais burts ir atstarpe ?");
			}else if (input.indexOf(" ") == 1) { // name contains only one symbol - error
				writeThis("Vai tieðâm Jûsu vârds satur tikai vienu burtu ?");	
			} else {
				poz = input.indexOf(" ");
				name = input.substring(0, poz);
				name = optimize(name);
				text = input.substring(poz);
				
				do {
					text=text.substring(1);
					i = 1;
					poz = text.indexOf(" ");
					if (poz==0) { // surname first symbol is space - error
						writeThis("Vai tieðâm Jûsu uzvârda pirmais burts ir atstarpe ?");
						i=-1;
						text = "bad";
					}else if(poz==1) { // surname contains only one symbol - error
						writeThis("Vai tieðâm Jûsu uzvârds satur tikai vienu burtu ?");
						i=-1;
						text = "bad";
					}
					if (poz == -1) {
						surnameNew=text;
					}else {
						surnameNew=text.substring(0, poz);
						text=text.substring(poz);
					}
					if(!(surnameNew.isEmpty())) {
						surname.add(surnameNew.toUpperCase());
					}
					
				} while (text.contains(" "));
				
			}

		} while (i < 0);
		sc.close();

		System.out.println();
		System.out.println("\'" + name + "\'");
		for (int j = 0; j<surname.size(); j++) { 
			System.out.println("\'" + surname.get(j) + "\'");
		}
	}

	public static void writeThis(String text) {
		System.out.println("");
		System.out.println(text);
		System.out.print("Lûdzu ievadiet savu vârdu un uzvârdu ar atstarpi: ");
	}

	public static String optimize(String word) {
		word = word.toLowerCase();
		String first = word.charAt(0) + "";
		first = first.toUpperCase();
		word = word.substring(1);
		word = first + word;
		return word;
	}

}
