import java.util.Random;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int count;
		do {
			System.out.print("Lûdzu ievadiet masîva izmçru robeþâs no 20 lîdz 40: ");
			count = sc.nextInt();
			if (count < 20 || count > 40) {
				writeThis("Ârpus norâdîtajâm robeþâm !!!");
			} else {
				System.out.println();
				i = 1;
			}
		} while (i == 0);
		sc.close();

		int[] numbers = new int[count];
		Random rnd = new Random();
		int min = Integer.MAX_VALUE;
		int minPoz=-1;
		for (int n = 0; n < numbers.length; n++) {
			numbers[n] = rnd.nextInt(89) + 10;
			if(numbers[n] < min) {
				min=numbers[n];
				minPoz=n;
			}
			System.out.print(numbers[n]);
			if (n != (numbers.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println();
		
		int compare;
		for (int j = 0; j < numbers.length-1; j++) {
			compare = numbers[j];
			numbers[j]=numbers[minPoz];
			numbers[minPoz]=compare;
			min=Integer.MAX_VALUE;
			System.out.print(numbers[j] + ", ");
			if(!(j == numbers.length-1)) {
				for (int m = j+1; m < numbers.length; m++) {
					if(numbers[m] < min) {
						min=numbers[m];
						minPoz=m;
					}
				}
			}
			
		}
		System.out.print(numbers[count-1]);
		
	}

	public static void writeThis(String text) {
		System.out.println();
		System.out.println(text);
	}

}
