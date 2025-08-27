package Assignment1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P10RemoveDuplicates {
	public static int[] removeDup(int[] nums) {
		int n = nums.length;
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(nums[i]);
		}
		int[] ans = new int[set.size()];
		int i = 0;
		for (int s : set) {
			ans[i++] = s;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = removeDup(arr);
		for (int i : ans) {
			System.out.println(i);
		}

	}

}
