package study;

import java.util.Arrays;
import java.util.Scanner;

public class BurteForce1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int inputCount = 9;
		int[] tallArr = new int[inputCount];

		for (int i = 0; i < inputCount; i++) {
			int tall = scan.nextInt();
			if (tall < 100) {
				tallArr[i] = tall;
			} else {
				i--;
			}
		}
		Arrays.sort(tallArr);
		int totalSum = Arrays.stream(tallArr).sum();

		for (int i = 0; i < inputCount; i++) {
			for (int j = i + 1; j < inputCount; j++) {
				if (totalSum - tallArr[i] - tallArr[j] == 100) {
					for (int k = 0; k < inputCount; k++) {
						if (k != i && k != j) {
							System.out.println(tallArr[k]);
						} else if (totalSum - tallArr[i] - tallArr[j] < 100) {
							if (k != i && k != j) {
								System.out.println(tallArr[k]);
							}
						}
					}
					return;
				}

			}
		}
		scan.close();
	}
}
