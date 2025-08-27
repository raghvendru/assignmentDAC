package Assignment1;

import java.util.Scanner;

public class P2ClassifyNo {
	public static void clasifyNumber(int n) {
		if (n < 0) {
			System.out.println("Its NEGATIVE number");
		} else if (n == 0) {
			System.out.println("ITS ZERO");
		} else {
			System.out.println("Its a POSITIVE number");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		clasifyNumber(n);
	}

}
