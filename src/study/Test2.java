package study;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nCount = scan.nextInt();

		if (nCount > 0 && nCount <= 50) {
			int[] nArr = new int[nCount];

			for (int i = 0; i < nCount; i++) {
				int a = scan.nextInt();
				if (a >= 2 && a <= 1000000) {
					nArr[i] = a;
				}
			}
			Arrays.sort(nArr);
			int min = nArr[0];
			int max = nArr[nCount - 1];
			int n = min * max;
			if (min != n && min != 1 && max != n && max != 1) {
				System.out.println(n);
			}

		}
		scan.close();

	}

}
