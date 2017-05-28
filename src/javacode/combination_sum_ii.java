package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_ii {
	public static List<List<Integer>> combinationSum(int[] candidates, int target){
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		dfs(candidates, target, result, path, 0);
		return result;
	}
	
	private static void dfs(int[] candidates, int target, List<List<Integer>> result, List<Integer> path, int start){
		//终止条件
		if (target == 0) {
			result.add(new ArrayList<>(path));
			return;
		}
		
		//剪纸
		
		//分支
		int previous = -1;
		for(int i = start; i < candidates.length; i++){
			if (previous == candidates[i]) continue;
			if (target < candidates[i]) continue;
			previous = candidates[i];
			path.add(candidates[i]);
			dfs(candidates, target - candidates[i], result, path, i + 1);
			path.remove(path.size()-1);
		}		
	}
	public static void main(String[] args){
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		System.out.print(combinationSum(candidates, target));
		System.out.println("success");
	}
}
