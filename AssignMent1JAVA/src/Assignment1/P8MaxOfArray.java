package Assignment1;

import java.util.*;

public class P8MaxOfArray {
//	public static int findMax(int[] nums) {
//		int n = nums.length;
//		Arrays.sort(nums);
//		int largest = nums[n - 1];
//		return largest;
//	}

	public static int findMax(int[] num) {
		int largest = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>largest) {
				largest = num[i];
			}
		}
		return largest;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int largest = findMax(arr);
		System.out.println("Largest ele is:" + largest);
	}

}
