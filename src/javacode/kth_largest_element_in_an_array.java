package javacode;
//转换从寻找k大的点 -> length - k+ 1小的点 -> index length - k小的点
public class kth_largest_element_in_an_array {
	public static int findKthLargest(int[] nums, int k){
		if(nums == null || nums.length == 0) return Integer.MAX_VALUE;
		
		return findKthLargest(nums, 0, nums.length - 1, k);
	}
	
	private static int findKthLargest(int[] nums, int start, int end, int k){
		if (start > end) return Integer.MAX_VALUE;
		int pivot = nums[end];
		int left = start;
		for(int i = start; i < end; i++){
			if(nums[i]<=pivot){
				swap(nums, left++, i);
			}
		}
		swap(nums, left, end);
		
		if(left == k){
			return nums[left];
		}else if(left < k){
			return findKthLargest(nums,left + 1, end, k);
		}else{
			return findKthLargest(nums, start, left - 1, k);//remember, it is start
		}
		
	}
	
	private static void swap(int[] nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
	public static void main(String[] args){
		int[] nums = {3, 2, 1, 5, 6, 4};
		
		System.out.println(findKthLargest(nums, 2));
		System.out.println("success");
	} 
}
