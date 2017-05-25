package javacode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class subsets {
	public static List<List<Integer>> subsets(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> result=new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		subsets(nums,result,path,0);
		return result;
	}
	
	public static void subsets(int[] nums,List<List<Integer>> result,List<Integer> path, int step){
		if(step==nums.length){
			result.add(new ArrayList<>(path));
			return;
		}
		subsets(nums,result,path,step+1);
		path.add(nums[step]);
		subsets(nums,result,path,step+1);
		path.remove(path.size()-1);
	}

	public static void main(String[] args){
		int[] nums={1,2,3};
		List<List<Integer>> result=subsets(nums);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
		System.out.println("success");
	}
}
