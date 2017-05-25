package javacode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class subsets_ii {
	public static List<List<Integer>> subsetsWithDup(int[] nums){
		Arrays.sort(nums);
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		dfs(nums,0,path,result);
		return result;
	}
	
	private static void dfs(int[] nums, int start,List<Integer> path,List<List<Integer>> result){
		result.add(new ArrayList<Integer>(path));
		System.out.println(path);
		for(int i = start; i<nums.length;i++){
			if(i!=start && nums[i]==nums[i-1]) {System.out.printf("pass %d\t %d\n",i,start);continue;}//应该只是跳出本次循环
			path.add(nums[i]);
			dfs(nums,i+1,path,result);
			path.remove(path.size()-1);
		}
	}
	
	public static void main(String[] args){
		int[] nums={1,2,2};
		List<List<Integer>> result=subsetsWithDup(nums);
//		for(int i=0;i<result.size();i++){
//			System.out.println(result.get(i));
//		}
		System.out.println("success");
	}
}
