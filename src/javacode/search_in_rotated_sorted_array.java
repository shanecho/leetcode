//suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. You are given a target value to search. If found in the array return its index, otherwise return -1.
//you may assume no duplicate exists in the array.
//思路：二分法
//mid是单独一个case，与>,<并列
//注意last-1
//test case: [1], 2
package javacode;

public class search_in_rotated_sorted_array {
	public static int search(int[] nums, int target){
		int first=0, last = nums.length;
		while(first!=last){
			int mid = first+(last-first)/2;
			if(nums[mid]==target) return mid;
			if(nums[first]<nums[mid]){
				if(target>=nums[first] && target<nums[mid]){
					last=mid;
				}
				else first=++mid;
			}
			else{
				if(target>nums[mid] && target<=nums[last-1]){
					first=++mid;
				}
				else last=mid;
			}
			
		}
		return -1;
	}
	public static void main(String[] args){
		//int[] nums={4,5,6,7,0,1,2};
		int[] nums={1};
		int result=search(nums,2);
		System.out.println(result);
	}
}
