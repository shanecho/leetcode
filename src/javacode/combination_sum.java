//special notice: input may not in ascending order
package javacode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum {
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

		//分支
		for(int i = start; i < candidates.length; i++){
			if (target < candidates[start]) continue; //剪纸
			path.add(candidates[i]);
			dfs(candidates, target - candidates[i], result, path, i);
			path.remove(path.size()-1);
		}		
	}
	public static void main(String[] args){
		int[] candidates = {8, 7, 4, 3};
		int target = 11;
		System.out.print(combinationSum(candidates, target));
		System.out.println("success");
	}
}
