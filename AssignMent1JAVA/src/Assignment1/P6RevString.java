package Assignment1;

import java.util.Scanner;

public class P6RevString {
	public static String rev(String str) {
		StringBuilder s = new StringBuilder(str);
		int n = s.length();
		int l = 0;
		int r = n - 1;
		while (l < r) {
			char ch = s.charAt(l);
			s.setCharAt(l, s.charAt(r));
			s.setCharAt(r, ch);
			l++;
			r--;
		}
		return s.toString();
	}

//	public static String rev(String s) {
//        char[] arr = s.toCharArray();
//        int l = 0;
//        int r = arr.length - 1;
//        while (l < r) {
//            char temp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = temp;
//            l++;
//            r--;
//        }
//        return new String(arr);
//    }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.next();
		String ans = rev(string);
		System.out.println(ans);
	}
}
