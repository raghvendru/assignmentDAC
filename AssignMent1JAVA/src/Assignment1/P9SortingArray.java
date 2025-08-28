package Assignment1;

import java.util.Scanner;

public class P9SortingArray {
	public static int[] quicksort(int[] nums) {
		int n = nums.length;
		qsHelper(nums,0,n-1);
		return nums;
	}
	
	public static void qsHelper(int[] nums,int low,int high) {
		if(low<high) {
			int pivot = pivotIndex(nums,low,high);
			qsHelper(nums, low, pivot-1);
			qsHelper(nums, pivot+1, high);
		}
		
	}
	public static int pivotIndex(int[] nums,int low,int high ) {
		int i = low;
		int j = high;
		int pivot = nums[low];
		while(i<j){
			while(i<=high-1 && nums[i]<=pivot) i++;
			while(j>=low+1 && nums[j]>pivot) j--;
			if(i<j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			
		}
		int temp = nums[low];
		nums[low] = nums[j];
		nums[j] = temp;
		return j;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size");
		int n = scanner.nextInt();
		System.out.println("Enter elememnts");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();	
		}
		int[] ans = quicksort(arr);
		for(int i:ans) {
			System.out.println(i);
		}
	}

}
