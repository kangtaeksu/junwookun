package kosta.baseball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseBall bb = new BaseBall();
		int strike = 0;
		int ball = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		do {
			System.out.println("숫자를 입력하세요");
			System.out.println("세자리 숫자");
			System.out.println();
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();

			strike = bb.countStrike(arr);
			ball = bb.countBall(arr);

			System.out.println(strike + "S" + ball + "B");
			count++;
		} while (strike < 3);

		System.out.println(count + "번만에 성공");
	}

}
