package javacode;

public class addBinary {
    public static String addBinary(String a, String b) {
    	StringBuilder result = new StringBuilder();
    	int i=a.length()-1;
    	int j=b.length()-1;
    	int carry=0;
    	
    	while(i>=0||j>=0||carry>0){
    		int valueA = i<0?0:a.charAt(i--)-'0';
    		int valueB = j<0?0:b.charAt(j--)-'0';
    		int sum = valueA+valueB+carry;
    		result.insert(0, Character.forDigit(sum%2, 10));
    		carry=sum/2;
    	}
    	    	
    	
    	return result.toString();
    }
    
	public static void main(String[] args){
		
		String a="101";
		String b="11";
		String result=addBinary(a,b);
		System.out.printf("%s",result);		
		System.out.println("success");
	}
}
