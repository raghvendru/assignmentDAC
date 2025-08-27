package Assignment1;

import java.util.*;

public class P3TempConvertor {

	public static double celsiusToFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}

	public static double fahrenheitToCelsius(double f) {
		return (f - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in Celsius: ");
		double c = sc.nextDouble();
		System.out.println(c + "°C = " + celsiusToFahrenheit(c) + "°F");

		System.out.println("Enter temperature in Fahrenheit: ");
		double f = sc.nextDouble();
		System.out.println(f + "°F = " + fahrenheitToCelsius(f) + "°C");

	}
}
