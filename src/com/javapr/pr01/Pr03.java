package com.javapr.pr01;

public class Pr03 {

	public static void main(String[] args) {

		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		System.out.print(c);
		System.out.println("\n");

		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}

	}

}
