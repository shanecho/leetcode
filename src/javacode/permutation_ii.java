package javacode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class permutation_ii {
	public static List<List<Integer>> permuteUnique(int[] nums){
		Arrays.sort(nums);
		
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		HashMap<Integer,Integer> counterMap = new HashMap<>();
		for(int i:nums){
			counterMap.put(i,counterMap.getOrDefault(i,0)+1);//关联操作：关联key to value; getOrDefault: 如果没有map返回默认值零，如果有map的key返回key对应的value；			
		}
		
		Pair[] counters = new Pair[counterMap.size()];//size便是映射数
		
		int i=0;
		for(Map.Entry<Integer, Integer> entry: counterMap.entrySet()){
			counters[i++] = new Pair(entry.getKey(),entry.getValue());
		}
		Arrays.sort(counters);
		
		HashMap<Integer,Integer> selected = new HashMap<>();
		for(Pair p:counters){
			selected.put(p.key, 0);
		}
		n=nums.length;
		permute(counters,selected,path,result);
		return result;
				
	}
	
	private static int n;
	static void permute(Pair[] counters, HashMap<Integer,Integer> selected,List<Integer> path, List<List<Integer>> result){
		if(n==path.size()){
			result.add(new ArrayList<>(path));
		}
		for(Pair counter: counters){
			
			if(selected.get(counter.key)<counter.value){
				path.add(counter.key);
				selected.put(counter.key, selected.get(counter.key)+1);
				permute(counters,selected,path,result);
				path.remove(path.size()-1);
				selected.put(counter.key, selected.get(counter.key)-1);
				
			}
		}
	}
	
	static class Pair implements Comparable<Pair>{
		int key;
		int value;
		public Pair(int key,int value){
			this.key=key;
			this.value=value;
		}
		
		
		public int compareTo(Pair o){
			if(this.key <o.key) return -1;
			else if (this.key>o.key) return 1;
			else{
				return this.value-o.value;
			}
		}
	}
	
	
	public static void main(String[] args){
		int[] nums={1,1,3};
		List<List<Integer>> result = new ArrayList<>();
		result=permuteUnique(nums);
		System.out.println(result);
		System.out.println("success");
	}
}
