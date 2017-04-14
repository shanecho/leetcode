//Given a string s consist of upper/lower-case alphabets and empty space character ' ', return the length of the last word in the string. If the last word does not exist, return 0; 
//Special notice:  test case: "        " => 
package javacode;

public class lengthOfLastWord {
	public interface Predicate{
		boolean apply(char ch);
	}
	
	public static int length(String s){
		Predicate isLetter = new Predicate(){			
			public boolean apply(char ch){//do not forget public
				return Character.isAlphabetic(ch);
			}
		};
		
		Predicate isNotLetter = new Predicate(){
			public boolean apply(char ch){
				return !Character.isAlphabetic(ch);
			}
		};
		
		int i = findIf(s,s.length()-1,isLetter);
		int j=findIf(s,i,isNotLetter);
		return i-j;
	}
	
	public static int findIf(String s, int Index,Predicate pred){
		for(int i=Index;i>=0;i--){
			if (pred.apply(s.charAt(i))) return i;
		}
		
		return -1;//does not matter, but it better to be less then 0
	}
	
	public static void main(String[] args){
		String s="Hello World";
		System.out.printf("%d",length(s));
		System.out.println("success");
	}
}
