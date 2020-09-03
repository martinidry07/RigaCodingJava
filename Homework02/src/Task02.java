import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		String[] months = new String[] { "janvâris", "februâris", "marts", "aprîlis", "maijs", "jûnijs", "jûlijs",
				"augusts", "septembris", "oktobris", "novembris", "decembris" };
		int[] daysInMonth = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		int d = 0;
		int m = 0;
		int y = 0;
		boolean b = true;
		do {
			System.out.println("Lûdzu ievadiet datumu ar cipariem !");
			System.out.print("Lûdzu ievadiet dienu: ");
			d = sc.nextInt();
			d = Math.abs(d);
			if (d < 1 || d > 31) {
				writeThis("Neatbilstoðs dienu daudzums !!!");
			} else {
				System.out.print("Lûdzu ievadiet mçnesi: ");
				m = sc.nextInt();
				m = Math.abs(m);
				if (m < 1 || m > 12) {
					writeThis("Neatbilstoðs mçneðu daudzums !!!");
				} else if (d > daysInMonth[m - 1]) {
					writeThis("Neatbilstoðs dienu daudzums ðajâ mçnesî !!!");
				} else {
					System.out.print("Lûdzu ievadiet gadu ar 4 cipariem: ");
					y = sc.nextInt();
					y = Math.abs(y);
					if (y < 1) {
						writeThis("Tieðâm 0. gads ???");
					} else if (((y % 4) != 0) && (m == 2) && (d == 29)) {
						writeThis("Ðajâ gadâ februârî nevar bût 29 dienas !!!");
					} else {
						b = false;
					}
				}
			}
		} while (b);
		sc.close();
		
		String output = y + ".gada ";
		if (d<10) {
			 output += "0" + d;
		}else {
			 output += d ;
		}
		output += "." + months[m-1];
		System.out.println();
		System.out.println(output );

	}

	public static void writeThis(String text) {
		System.out.println("");
		System.out.println(text);
		System.out.println("Sâksim no jauna.");
	}

}
