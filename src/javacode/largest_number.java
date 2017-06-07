package javacode;
import java.util.Arrays;
//定义规则： 对于任意两个数字组合，比较他们的两种组合字符串，取大的。
//special notice: input [0, 0, 0] expected: 0

public class largest_number {
	
    public static String largestNumber(int[] nums) {
    	int len = nums.length;
    	String[] s = new String[len];
    	for(int i = 0; i<len; i++)  s[i] = String.valueOf(nums[i]);
    		
    	
    	Arrays.sort(s, (String s1, String s2)->{
    		String c1 = s1+s2;
    		String c2 = s2+s1;
    		return -c1.compareTo(c2);
    	});
    	
    	
    	StringBuilder sb = new StringBuilder();
    	for(String i : s)  sb.append(i);
//    	System.out.println(sb);
    	while (sb.charAt(0) == '0' && sb.length() > 1) sb.deleteCharAt(0); // in case of like: {0, 0, 0}
    	return sb.toString();    	
    }
	
	public static void main(String[] args){
		int[] nums = {0, 0};
		System.out.println(largestNumber(nums));
		System.out.println("success");
	}
}
