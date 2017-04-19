package javacode;

public class convert_sorted_array_to_binary_search_tree {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val=x;}
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val=x;}
	}
	
	public static TreeNode sortedArrayToBST(int[] nums){
		return sortedArrayToBST(nums,0,nums.length);
		
	}
	private static TreeNode sortedArrayToBST(int[] nums, int begin, int end){
		int length=end-begin;
		if(length<1) return null;
		
		int mid=begin+length/2;
		TreeNode root = new TreeNode (nums[mid]);
		root.left=sortedArrayToBST(nums,begin,mid);
		root.right=sortedArrayToBST(nums,mid+1,end);
		return root;
	}

	public static void main(String[] args){
		System.out.println("success");
	}
}
