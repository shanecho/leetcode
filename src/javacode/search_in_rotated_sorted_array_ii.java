//test case: [],5; [1],1
//special notice: last
package javacode;

public class search_in_rotated_sorted_array_ii {
	public static boolean search (int[] nums, int target){
		
		int first=0, last=nums.length;
		while(first!=last){
			int mid=first+(last-first)/2;
			if(nums[mid]==target) return true;
			if(nums[first]<nums[mid]){
				if(target>=nums[first] && target<nums[mid]) last=mid;
				else first=++mid;
			}else if(nums[first]>nums[mid]){
				if(target>nums[mid]&& target<=nums[last-1]) first=++mid;
				else last=mid;
			}else{
				first++;
			}
		}
		return false;
	}
	public static void main(String[] args){
		int[] nums=new int[]{1};
		boolean result = search(nums,1);
		System.out.println(result);
		System.out.println("success");
	}
}
