import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count;
		boolean badInput = true;
		do {
			System.out.print("Lûdzu ievadiet, pirmskaitïus jûs vçlaties robeþâs lîdz 100: ");
			count = sc.nextInt();
			if (count < 1 || count > 100) {
				System.out.println("Ârpus norâdîtajâm robeþâm !!!");
			} else {
				System.out.println();
				badInput = false;
			}
		} while (badInput);
		sc.close();

		int maxInt = count * 5;

		List<Integer> sieve = new ArrayList<>();
		// List<Integer> prime = new ArrayList<>();

		sieve.add(1);
		sieve.add(2);
		for (int i = 2; i < maxInt + 1; i += 2) {
			sieve.add(i + 1);
		}

//		for (int i = 0; i < sieve.size(); i++) {
//			System.out.println("pozîcija : " + (i) + ", vçrtîba : " + sieve.get(i));
//		}
		
		int counter = 2;
		while (counter < count) {
			counter++;
			//System.out.println("counter "+ counter);
			int sieveSize = sieve.size();
			int sievePosition=counter;
			//System.out.println("sievePosition " + sievePosition);
			int number = sieve.get(counter-1);
			//System.out.println("dalîsim ar " + number);
			while(sievePosition<sieveSize) {
				if(sieve.get(sievePosition)%number==0) {
					sieve.set(sievePosition,0);
				}
				sievePosition ++;
			}
			for(int j=sieveSize-1;j>counter; j--) {
				if (sieve.get(j)==0) {
					sieve.remove(j);
				}
			}
						
		} 
		for (int i = 0; i < count; i++) {
			if(i==count-1) {
				System.out.print(sieve.get(i));
			}else {
				System.out.print(sieve.get(i) + ", ");
			}
			if((i+1)%10==0) {
				System.out.println("");
			}
		}

	}

}
