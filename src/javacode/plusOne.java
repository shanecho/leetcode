//Questions:
//Given a non-negative integer represented as a non-empty array of digit,plus one to the integer
//you may assume the integer do not contain any leading zero, except the number 0 itself.
//The digit are stored such that the most significant digit is at the head of the list
package javacode;

public class plusOne {
	public static int[] plusOne(int[] digit){
		return add(digit,1);
	}
	
	private static int[] add(int[] digits,int digit){
		int carry=digit;
		for(int i=digits.length-1;i>=0;i--){
			digits[i]=digits[i]+carry;
			carry=digits[i]/10;
			digits[i]=digits[i]%10;
		}
		if(carry>0){
		int[] tmp = new int[digits.length+1];
		System.arraycopy(digits, 0, tmp, 1, digits.length);
		tmp[0]=carry;
		return tmp;
		}
		else{
		return digits;		
		}
	}
	
	public static void main(String[] args){
		int[] digit={1,2,0,9};
		int[] result=plusOne(digit);
		for(int i=0;i<digit.length;i++){
			System.out.printf("%d ",digit[i]);
		}
		System.out.println("success");
	}
	
}
