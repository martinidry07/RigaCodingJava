import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int primeCount;
		boolean badInput = true;
		do {
			System.out.print("Lûdzu ievadiet, pirmskaitïus jûs vçlaties robeþâs lîdz 100: ");
			primeCount = sc.nextInt();
			if (primeCount < 1 || primeCount > 100) {
				System.out.println("Ârpus norâdîtajâm robeþâm !!!");
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
