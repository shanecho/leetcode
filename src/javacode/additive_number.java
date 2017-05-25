package javacode;
import java.util.Arrays;


public class additive_number {
	
	public static boolean isAdditiveNumber(String num){
		for(int i = 1; i<=num.length()/2; i++){
			if(num.charAt(0)=='0' && i>1) continue;
			for(int j = i+1; j<num.length(); j++){
				if(num.charAt(i)=='0' && j-i>1) continue; //charAt(i) not i+1,因为i是j的第一个字符，并不是i+1, 我需要判断的是 i.
				if(dfs(num,0,i,j)) return true;
				
			}
		}
		
		return false;
	}
	private static boolean dfs(String num, int i, int j, int k){
		long num1 = Long.parseLong(num.substring(i,j));
		long num2 = Long.parseLong(num.substring(j,k));
		String addition = String.valueOf(num1+num2);
		if(!num.substring(k).startsWith(addition)) return false;
		if(k+addition.length()==num.length()) return true;
		
		return dfs(num, j, k, k+addition.length());
	}
	
	public static void main(String[] args){
		
		System.out.println("success");
		String num = "1023";
//		System.out.print(num.substring(0, 1));
		System.out.print(isAdditiveNumber(num));
		
		
	}
}
