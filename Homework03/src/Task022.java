import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int primeCount;
		boolean badInput = true;
		do {
			System.out.print("L�dzu ievadiet, pirmskait�us j�s v�laties robe��s l�dz 100: ");
			primeCount = sc.nextInt();
			if (primeCount < 1 || primeCount > 100) {
				System.out.println("�rpus nor�d�taj�m robe��m !!!");
			} else {
				System.out.println();
				badInput = false;
			}
		} while (badInput);
		sc.close();

		List<Integer> primes = new ArrayList<>();
		int i = 0;
		boolean isPrime;
		int prime = 0;
		while (i < primeCount) {
			prime++;
			if (i > 1) {
				isPrime = false;
				prime--;
				while (!isPrime) {
					prime++;
					isPrime = true;
					for (int j = 1; j < primes.size(); j++) {
						if (prime % primes.get(j) == 0) {	
							isPrime = false;
							break;
						}
					}					
				}
			} 
			primes.add(prime);
			if (i == primeCount - 1) {
				System.out.print(prime);
			} else {
				System.out.print(prime + ", ");
			}
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
			i++;
		}
	}
}
