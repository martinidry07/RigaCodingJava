import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lûdzu ievadiet savu vârdu: ");
		String name = sc.nextLine();
		System.out.print("Lûdzu ievadiet sa vu vecumu: ");
		String age = sc.nextLine();
		sc.close();
		
		System.out.println();
		System.out.println("Sveiki, mani sauc " + name + ", esmu " + age + " gadus jauns/jauna!");

	}

}
