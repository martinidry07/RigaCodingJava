import java.util.Random;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int number = new Random().nextInt(11);
		writeThis("I have chosen number between 1 and 10, try to guess it.");
		writeThis("What's your number?");
		boolean bingo = false;
		Scanner sc = new Scanner(System.in);
		do {			
			int tryOne = sc.nextInt();
			if (number!=tryOne) {
				writeThis("Nop, try again.");
			}else {
				bingo = true;
			}
		}while (!bingo);
		sc.close();
		writeThis("Correct, the number was " + number);
	}
	
	public static void writeThis(String text) {
		System.out.println(text);
	}
}
