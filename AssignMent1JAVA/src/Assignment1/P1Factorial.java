package Assignment1;

import java.util.*;

public class P1Factorial {
	public static int fact(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		int res = fact(n);
		System.out.println(res);
	}

}
