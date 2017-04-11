//about display an arrayList, please use the size() in the iteration instead of get() method. 
package javacode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val=x;}
}


public class Find_Largest_Value_in_Each_Tree_Row {
	static void traverse(TreeNode tn){
		if (tn==null) return;
		System.out.printf("%s-",tn.val);
		traverse(tn.left);
		traverse(tn.right);
	}
	
	static void levelTraverse(TreeNode tn, int level, List<Integer> result){
		if (tn==null) return;
		if(level>result.size()) result.add(tn.val);
		result.set(level-1, Math.max(result.get(level-1), tn.val));
		levelTraverse(tn.left,level+1,result);
		levelTraverse(tn.right,level+1,result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		t1.left =new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
		t1.left.right=new TreeNode(3);
		t1.right.right=new TreeNode(9);
		//traverse(t1);
		List result = new ArrayList<Integer>();
		if (result!=null) System.out.printf("not null");
		levelTraverse(t1,1,result);
		for(int i=0;i<result.size();i++)	{
			//System.out.printf("i: %d \n",i);
			System.out.printf("-%d",result.get(i));
		}
		
		System.out.printf("\nsuccess");
	}

}
