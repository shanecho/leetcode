package javacode;
import java.util.Stack;

public class validParenthese {
	
	static Boolean isValid(String s){
		final String left="([{";
		final String right=")]}";
		
		Stack <Character> stk = new Stack<>();
		
		for (int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if (left.indexOf(c) !=-1){//left里有c的情况
				stk.push(c);				
			}else{//没有c，那么判断：1是这个字符属于另一半括号，2是是真空
				if(!stk.isEmpty() && stk.peek()== left.charAt(right.indexOf(c))){
					stk.pop();
				}
				else{
					return false;
				}
			}
		}
		
		return stk.isEmpty();
	}
	public static void main(String[] args){
		String input="[{()}]";
		
		System.out.printf("%b\n",isValid(input));
		System.out.println("Success");
	}

}
