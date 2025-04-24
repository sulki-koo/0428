package study;

import java.util.Scanner;
import java.math.BigInteger;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//
//		if (a >= 2 && a <= 10000 && b >= 2 && b <= 10000 && c >= 2 && c <= 10000) {
//			System.out.println((a + b) % c);
//			System.out.println(((a % c) + (b % c)) % c);
//			System.out.println((a * b) % c);
//			System.out.println(((a % c) * (b % c)) % c);
//		}

		while (scan.hasNextInt()) {
			int n = scan.nextInt();
			int count = 1;
			BigInteger num = BigInteger.ONE;

			if (n >= 1 && n <= 10000 &&(n % 2 != 0 && n % 5 != 0)) {
				while (num.mod(BigInteger.valueOf(n)).compareTo(BigInteger.ZERO) != 0) {
					num = num.multiply(BigInteger.TEN).add(BigInteger.ONE);
					count++;
				}
				System.out.println(count);
			} else {
				System.out.println("조건이 만족하지 않음!");
			}
		}

		scan.close();
	}

}
