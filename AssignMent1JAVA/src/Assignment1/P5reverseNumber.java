package Assignment1;

import java.util.Scanner;

public class P5reverseNumber {
	public static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			rev = (rev * 10) + n % 10;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int res = reverse(n);
		System.out.println("after reversin " + res);
	}

}
