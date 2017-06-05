package javacode;

public class sort_colors {
	
	public static void sortColors(int[] nums){
		
		partition(nums, partition(nums, 0, nums.length, new EqualTo(0)), nums.length, new EqualTo(1));
	}
	
	private static int partition(int[] nums, int begin, int end, EqualTo predicate){
		int pos = begin;
		for(;begin != end; begin++){
			if(predicate.apply(nums[begin])){
				swap(nums, begin, pos++);
			}
		}
		return pos;
	}
	
	static class EqualTo {
		private int target;
		public EqualTo(int target){
			this.target = target;
		}
		
		public boolean apply(int x){
			return x == target;
		}
	}
	
	public static void swap(int nums[], int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	public static void main(String[] args){
		int[] nums = {0, 1, 0, 1, 2, 1, 0};
		sortColors(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]);
		}
		
		System.out.println("success");
	}
}
