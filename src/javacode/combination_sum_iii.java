package javacode;
import java.util.ArrayList;
import java.util.List;

public class combination_sum_iii {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(k, 0, n, result, path);
        return result;
    	
    }
	
    private static void dfs(int step, int start, int target, List<List<Integer>> result, List<Integer> path){
    	if(step == 0){
    		if(target == 0){
    			result.add(new ArrayList<>(path));
    		}
    		return;
    	}
    	
    	start = path.isEmpty()? 0:path.get(path.size()-1);
    	for(int i = start + 1; i < 10; i++){
    		path.add(i);
    		dfs(step - 1, start, target - i, result, path);
    		path.remove(path.size()-1);
    	}
    	
    	
    	
    }
	public static void main(String[] args){
		System.out.println(combinationSum3(3,9));
		System.out.println("success");
	}
}
