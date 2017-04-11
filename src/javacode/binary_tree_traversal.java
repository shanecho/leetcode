package javacode;


import java.util.ArrayList;

public class binary_tree_traversal {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		traverse(root,1,result);
		return result;
	}
	
	void traverse(TreeNode root, int level, ArrayList<ArrayList<Integer>> result){
		if (root==null) return;
		if(level>result.size()) result.add(new ArrayList<>());
		
		result.get(level-1).add(root.val);
		traverse(root.left,level+1,result);
		traverse(root.right,level+1,result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> item = new ArrayList<>();
		item.add(123);
		ArrayList<Integer> item1 = new ArrayList<>();
		result.add(item);
		result.add(item1);
		
		System.out.printf("%d",result.size());
		//display(item,"List item");
		
		System.out.printf("success");
	}

}
