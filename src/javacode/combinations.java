package javacode;
import java.util.List;
import java.util.ArrayList;

public class combinations {
	public static List<List<Integer>> combine(int n, int k){
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		
		dfs(n, k, 1, result, path);
		return result;
	}
	
	private static void dfs(int n, int step, int start, List<List<Integer>> result, List<Integer> path){
		if(step == 0){
			result.add(new ArrayList<>(path));
			return;
		}
		
		for(int i = start; i < n+1; i++){
			path.add(i);
			dfs(n, step - 1, i + 1, result, path);
			path.remove(path.size()-1);
		}
		
		
		
	}
	
	public static void	main(String[] args){
		System.out.println(combine(4, 2));
		System.out.println("success");
	}
}
