package javacode;

public class find_minimum_in_rotated_sorted_array_ii {
	public static int findMin(int[] nums){
		int left = 0;
		int right = nums.length - 1;
		while(left < right){
			int mid = left + (right - left)/2;
			if (nums[mid] < nums[right]){
				right = mid;
			} else if (nums[mid] >nums[right]){
				left = mid + 1;
			} else {
				right--;
			}
		}
		return nums[left];
	}
	public static void main(String[] args){
		int[] nums = {4, 5, 6, 7, 1, 1, 2};
		System.out.println(findMin(nums));
		System.out.println("success");
	}
}
