package javacode;

public class count_and_say {
	public static String countAndSay(int n){
		String s="1";		
		while(--n>0){
			s=getNext(s);
		}
		return s;
	}
	//
	//1. the starting index with same character should be changed automatically.|| two index
	//2. the number time same char repeated should be counted; || if->++
	//3. separate function
	public static String getNext(String s){
		StringBuilder sb= new StringBuilder();
		int count=0;
		for(int i=0;i<s.length();i++){
			count=EqualCount(s,i);
			sb.append(count);
			sb.append(s.charAt(i));
			i=i+count-1;			
		}
		
		s=sb.toString();		
		return s;
	}
	private static int EqualCount(String s, int index){
		int count=0;		
		for(int i=index;i<s.length() && s.charAt(i)==s.charAt(index);){
			count++;
			i++;
		}
		return count;
	}
	public static void main(String[] args){
		
		System.out.println("success");
		String result = countAndSay(3);
		System.out.printf("%s",result);
	}

}
