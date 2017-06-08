package javacode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class permutations_ii {
	public static List<List<Integer>> permuteUnique(int[] nums){
		Arrays.sort(nums);
		boolean[] used = new boolean[nums.length];
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		dfs(used, nums, 0, path, result);
		return result;
	}
	
	private static void dfs(boolean[] used, int[] nums, int start, List<Integer> path, List<List<Integer>> result){
		if(nums.length == start && path.size() ==nums.length){
			result.add(new ArrayList<>(path));
			return;
		}
		

		
		for(int i = 0; i < nums.length; i++){
			
			if(i!=0 && nums[i]==nums[i-1] && !used[i-1]) continue;
			if(used[i] == false){
				path.add(nums[i]);
				used[i]=true;
				dfs(used, nums, start+1, path, result);
				path.remove(path.size()-1);
				used[i]=false;
			}
			
		}
		
	}
	public static void main(String[] args){
		int[] nums = {1,1,2};
		System.out.println(permuteUnique(nums));
		System.out.println("success");
	}
}
