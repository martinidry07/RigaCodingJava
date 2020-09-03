import java.util.Random;
import java.util.Scanner;

public class Task011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int count;
		do {
			System.out.print("Lûdzu ievadiet masîva izmçru robeþâs no 20 lîdz 40: ");
			count = sc.nextInt();
			if (count < 2 || count > 40) {
				writeThis("Ârpus norâdîtajâm robeþâm !!!");
			} else {
				System.out.println();
				i = 1;
			}
		} while (i == 0);
		sc.close();

		int[] numbers = new int[count];
		Random rnd = new Random();
		for (int n = 0; n < numbers.length; n++) {
			numbers[n] = rnd.nextInt(89) + 10;

			System.out.print(numbers[n]);
			if (n != (numbers.length - 1)) {
				System.out.print(", ");
			}
		}

		System.out.println();
		System.out.println();

		boolean dan = false;
		do {
			dan = true;
			for (int j = 1; j < numbers.length - 1; j++) {
				if (numbers[j] < numbers[j - 1]) {
					numbers = change(j, j - 1, numbers);
				}
				if (numbers[j] > numbers[j + 1]) {
					numbers = change(j, j + 1, numbers);
				}
				if (numbers[j] < numbers[j - 1]) {
					numbers = change(j, j - 1, numbers);
				}

			}
			for (int j = numbers.length - 2; j > 0; j--) {
				if (numbers[j] > numbers[j + 1]) {
					numbers = change(j, j + 1, numbers);
					dan = false;
				}
				if (numbers[j] < numbers[j - 1]) {
					numbers = change(j, j - 1, numbers);
					dan = false;
				}
				if (numbers[j] > numbers[j + 1]) {
					numbers = change(j, j + 1, numbers);
					dan = false;
				}
			}
		} while (!dan);

		for (int j = 0; j < numbers.length; j++) {
			System.out.print(numbers[j]);
			if (!(j == (count - 1))) {
				System.out.print(", ");
			}
		}
	}

	public static void writeThis(String text) {
		System.out.println();
		System.out.println(text);
	}

	public static int[] change(int n1, int n2, int[] numbers) {

		int bufer = numbers[n1];
		numbers[n1] = numbers[n2];
		numbers[n2] = bufer;
		return numbers;

	}

}
