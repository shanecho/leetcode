//有几个小要求：1，数字不能重复，所以在确定是否要添加的时候一定已经排除了重复访问过的数字 2，如果访问过并且添加到结果集后必须进行删除回退操作
//屡次三番错的地方： result.add(path);-> result.add(new ArrayList<>(path));path.remove(x);->path.remove(path.size()-1);
package javacode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations {
	public static List<List<Integer>> permute(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<Integer>();
		dfs(result,path,nums);
		return result;
		
		
	}
	
	private static void dfs(List<List<Integer>> result, List<Integer> path,int[] nums){
		if(path.size()==nums.length){
			result.add(new ArrayList<>(path));
			return;
		}
		
		for(int x:nums){
			if(path.indexOf(x)==-1){
				path.add(x);
				dfs(result,path,nums);
				path.remove(path.size()-1);
			}
			
		}
	}

	
	public static void main(String[] args){
		int[] nums={1,2,3};
		List<List<Integer>> result= new ArrayList<>();
		result=permute(nums);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
			
		}
		System.out.println("success");
	}
}
