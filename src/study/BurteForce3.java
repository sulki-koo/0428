package study;

import java.util.Scanner;

public class BurteForce3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int earth = scan.nextInt();
		int sun = scan.nextInt();
		int moon = scan.nextInt();

		int year = 1;

		while (year <= 15 * 28 * 19) {
			if ((year - earth) % 15 == 0 && (year - sun) % 28 == 0 && (year - moon) % 19 == 0) {
				System.out.println(year);
				break;
			}
			year++;
		}
		scan.close();
	}

}
