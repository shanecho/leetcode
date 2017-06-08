package javacode;
import java.util.*;
//test case: "" -> [] instead of [""]

public class letter_combinations_of_a_phone_number {
	private final static String[] phoneNumber={" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static List<String> letterCombinations(String digits){
		
		List<String> result = new ArrayList<>();
		if(digits.isEmpty()) return result;// dont forget
		dfs(digits, 0,"",result);
		return result;
	}
	
	private static void dfs(String digits, int step, String path, List<String> result){
		if(step == digits.length()){
			result.add(path);
			return;
		}
		String str = phoneNumber[digits.charAt(step)-'0'];//always forgot...
		for(char c : str.toCharArray()){
			dfs(digits, step+1, path+c, result);
		}
		
	}
	public static void main(String[] args){
		String digits = "";
		System.out.println(letterCombinations(digits));
		System.out.println("success");
	}
}
