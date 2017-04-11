//Easy to figured out, 
//suppose state(i) represent for all cases when n=i, 
//Thus, state(i+1)=state(i)+() || (state(i)).  
package javacode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class generate_parentheses {
	public static List<String> generateParenthesis(int n){
		if (n==0) return new ArrayList<>(Arrays.asList(""));
		if (n==1) return new ArrayList<>(Arrays.asList("()"));
		List<String> result = new ArrayList<>();
		for(int i=0; i<n;i++)
			for(String inner: generateParenthesis(i))
				for(String outer:generateParenthesis(n-1-i) ){
					System.out.printf("inner:%s outer: %s \n",inner,outer);
					result.add("("+inner+")"+outer);
				}
		return result;
	}

	public static void main(String[] args){
		List<String> result= generateParenthesis(2);
		System.out.printf("result:");
		for(int i=0; i<result.size();i++) System.out.printf("%s;",result.get(i));
		System.out.printf("\nsuccess");
	}
}
