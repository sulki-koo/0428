package study;

import java.util.Scanner;

public class BurteForce2 {

	static int lineNum;
	static String[][] board;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("보드 크기를 입력하세요!(3~50)");
		lineNum = scan.nextInt();

		if (lineNum < 3 || lineNum > 50) {
			System.out.println("보드 크기 입력 오류!");
			return;
		}

		scan.nextLine();

		board = new String[lineNum][lineNum];
		System.out.println("사탕의 색상: 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y");

		for (int i = 0; i < lineNum; i++) {
			System.out.println((i + 1) + "번째 줄 입력");
			String line = scan.nextLine();
			if(line.length()!=lineNum) {
				System.out.println("입력 길이 오류");
				return;
			}
			
			for (int j = 0; j < lineNum; j++) {
				board[i][j] = String.valueOf(line.charAt(j));
			}
		}

		int maxCandies = getMaxCandies();

		if (maxCandies == lineNum) {
			System.out.println(maxCandies);
			return;
		}

		for (int i = 0; i < lineNum; i++) {
			for (int j = 0; j < lineNum; j++) {
				if (j + 1 < lineNum) {
					swap(i, j, i, j + 1);
					maxCandies = Math.max(maxCandies, getMaxCandies());
					swap(i, j, i, j + 1);
				}

				if (i + 1 < lineNum) {
					swap(i, j, i + 1, j);
					maxCandies = Math.max(maxCandies, getMaxCandies());
					swap(i, j, i + 1, j);
				}
			}
		}
		System.out.println(maxCandies);
		
		scan.close();
	}

	private static int getMaxCandies() {
		int maxCandies = 0;

		for (int i = 0; i < lineNum; i++) {
			int count = 1;
			for (int j = 1; j < lineNum; j++) {
				if (board[i][j].equals(board[i][j - 1])) {
					count++;
				} else {
					maxCandies = Math.max(maxCandies, count);
					count = 1;
				}
			}
			maxCandies = Math.max(maxCandies, count);
		}

		for (int j = 0; j < lineNum; j++) {
			int count = 1;
			for (int i = 1; i < lineNum; i++) {
				if (board[i][j].equals(board[i - 1][j])) {
					count++;
				} else {
					maxCandies = Math.max(maxCandies, count);
					count = 1;
				}
			}
			maxCandies = Math.max(maxCandies, count);
		}

		return maxCandies;
	}

	private static void swap(int x1, int y1, int x2, int y2) {
		String color = board[x1][y1];
		board[x1][y1] = board[x2][y2];
		board[x2][y2] = color;
	}

}
