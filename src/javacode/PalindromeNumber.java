package javacode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int d=1;
		if (x<0){
		    return false;
		}
		int first;
		int last;
		while(x/d>=10){
			d *= 10;
		}
		while(x>0){
			first=x/d;
			last=x%10;
			if (first != last){
				return false;
			}
			x=x%d/10;
			d /=100;			
		}		
		return true;
    }
	public static void main(String[] args){
		System.out.println("sucess");
	}
}
