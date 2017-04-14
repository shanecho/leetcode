//Given a string, find the length of the longest substring without repeating characters.
//
package javacode;

import java.util.Arrays;

public class longest_substring_without_repeating_characters {
	public static int lengthOfLongestSubstring(String s){
		int ASCII_MAX=255;
		int[] num= new int[ASCII_MAX];
		Arrays.fill(num, -1);
		int max_len=0;
		int start=-1;
		for(int i=0;i<s.length();i++){
			if (num[s.charAt(i)]>=start){//greater or equal to start, not just greater
				max_len=Math.max(max_len, i-start);
				start=num[s.charAt(i)]+1;
			}
			num[s.charAt(i)]=i;
		}
		max_len=Math.max(max_len, s.length()-start);
		return max_len;
	}
	public static void main(String[] args){
		String s="qpxrjxkltzyx";
		System.out.printf("%d",lengthOfLongestSubstring(s));
		System.out.println("success");
	}
}
