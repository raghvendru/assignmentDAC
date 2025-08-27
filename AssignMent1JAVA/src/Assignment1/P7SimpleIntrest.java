package Assignment1;

import java.util.*;

public class P7SimpleIntrest {
	public static double si(double p, double r, double t) {
		return ((p * r * t) / 100.0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p");
		int p = sc.nextInt();
		System.out.println("Enter r");

		int r = sc.nextInt();
		System.out.println("Enter t");

		int t = sc.nextInt();
		double res = si(p, r, t);
		System.out.println(res);
	}

}
