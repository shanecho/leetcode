//Given a binary tree, check whether it is a mirror of itself(ie, symmetric around its center)
//another solution, much complexity simplified, just put left tree and right tree as separate trees
package javacode;

public class symmetricTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val=x;}
	}
	
	public boolean isSymmetric(TreeNode root){
		if(root==null) return true;
		boolean result=judge(root.left,root.right);
		return result;
		
	}
	
	public boolean judge(TreeNode A, TreeNode B){
		if(A==null && B==null) return true;
		if(A==null || B==null) return false;
		
		return A.val==B.val && judge(A.left,B.right) && judge(A.right,B.left);
	}
	public static void main(String[] args){
		System.out.println("success");
	}
}
