//Given a binary tree, find its maximum depth
//The maximum depth is the number of nodes along the longest path from the root node to the farthest leaf node.
package javacode;

public class maximum_depth_of_binary_tree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val=x;}
	}
	
	public int maxDepth(TreeNode root){
		if(root==null) return 0;
		
		return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
	}
	
	public static void main(String[] args){
		System.out.println("success");
	}
}
