package Assignment1;

import java.util.Scanner;

public class P4StudentGradeCalc {
	public static char calculateGrade(int marks) {
		if (marks >= 90) {
			return 'A';
		} else if (marks >= 80) {
			return 'B';
		} else if (marks >= 70) {
			return 'C';
		} else if (marks >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks");
		int n = scanner.nextInt();
		char ans = calculateGrade(n);
		System.out.println("your grade is: " + ans);
	}
}
