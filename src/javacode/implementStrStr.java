//对于非法情况 return的问题：needle长度为0，返回0，因为是合法的。
package javacode;

public class implementStrStr {
	
	public static int strStr(String haystack, String needle){
		if(needle.length()==0) return 0;//这一句尤其注意
		int length=haystack.length()-needle.length()+1;
		
		for(int i=0;i<length;i++){
			int j=i;
			int k=0;
			while(j<haystack.length() && k<needle.length() && haystack.charAt(j)==needle.charAt(k)){
				j++;
				k++;
				
			}
			if(k==needle.length()){return i;}
		}
		return -1;
	}
	
	public static void main(String[] args){
		String haystack="nihaoma";
		String needle="haoma";
		
		int result=strStr(haystack,needle);
		
		System.out.printf("result: %d",result);
	}

}
