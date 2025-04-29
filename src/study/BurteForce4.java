package study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BurteForce4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int channelNum = scan.nextInt();
		if (channelNum < 0 || channelNum > 500000)
			return;

		int brokenNum = scan.nextInt();
		if (brokenNum < 0 || brokenNum > 10)
			return;

		Set<Integer> brokenButtons = new HashSet<Integer>();

		for (int i = 0; i < brokenNum; i++) {
			brokenButtons.add(scan.nextInt());
		}

		int minPress = Math.abs(channelNum - 100);

		for (int i = 0; i <= 500000; i++) {
			String str = String.valueOf(i);
			boolean canPerss = true;

			for (int j = 0; j < str.length(); j++) {
				if (brokenButtons.contains(str.charAt(j) - '0')) {
					canPerss = false;
					break;
				}
			}

			if (canPerss) {
				int count = str.length() + Math.abs(channelNum - i);
				minPress = Math.min(minPress, count);
			}
		}

		System.out.println(minPress);
		scan.close();

	}

}
