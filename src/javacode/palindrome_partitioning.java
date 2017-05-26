//Test case: abbab => [["a","b","b","a","b"],["a","b","bab"],["a","bb","a","b"],["abba","b"]]
package javacode;
import java.util.List;
import java.util.ArrayList;

public class palindrome_partitioning {
	public static List<List<String>> partition(String s){
		List<List<String>> result = new ArrayList<>();
		List<String> path = new ArrayList<>();
		dfs(s, result, path, 0,1);
		return result;
	}
	
	public static void dfs(String s, List<List<String>> result, List<String> path, int prev, int start){
		if(start == s.length()){
			if(isPalidrome(s, prev, start-1)){
				path.add(s.substring(prev, start));
				result.add(new ArrayList<>(path));
				path.remove(path.size()-1);
			}
			return;
		}
		
		dfs(s,result,path,prev,start+1);
		
		if(isPalidrome(s,prev,start-1)){
			path.add(s.substring(prev,start));
			dfs(s,result,path,start,start+1);
			path.remove(path.size()-1);
		}
	}
	
	private static boolean isPalidrome(String s, int start, int end){
		while(start<end && s.charAt(start)==s.charAt(end)){
			++start;
			--end;
		}
		return start>=end;
	}
	
	public static void main(String args[]){
		String s = "abbab";
		System.out.print(partition(s));
		System.out.println("success");
	}

}
