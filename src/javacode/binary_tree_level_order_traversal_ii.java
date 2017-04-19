//Given a binary tree, return bottom up level order traversal of its nodes values.
//(i.e, from left to right, level by level from leaf to root)
//
package javacode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class binary_tree_level_order_traversal_ii {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val=x;}
	}
	public static List<List<Integer>> levelOrderBottom(TreeNode root){
		List<List<Integer>> result=new ArrayList<>();
		traverse(root,1,result);
		Collections.reverse(result);
		return result;
	}
	public static void traverse(TreeNode root, int level, List<List<Integer>> result){
		if(root==null) return;
		if(level>result.size()) result.add(new ArrayList<Integer>());
		result.get(level-1).add(root.val);
		traverse(root.left,level+1,result);
		traverse(root.right,level+1,result);
	}
	
	public static void main(String[] args){
		TreeNode t1= new TreeNode(3);
		TreeNode t2= new TreeNode(9);
		TreeNode t3= new TreeNode(20);
		t1.left=t2;
		t1.right=t3;
		List<List<Integer>> result= levelOrderBottom(t1);
		for(int i=0;i<result.size();i++){
			System.out.print(result.get(i));
			
		}
		System.out.println("success");
	}
}
