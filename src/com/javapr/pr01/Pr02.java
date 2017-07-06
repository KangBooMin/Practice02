package com.javapr.pr01;

import java.util.Scanner;

public class Pr02 {

	public static void main(String[] args) {

		int[] num = new int[5];
		double sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요.");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("평균은 "+sum/5+" 입니다.");

		sc.close();
	}

}
