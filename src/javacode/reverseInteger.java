package javacode;

public class reverseInteger {
	public static int reverse (int x){
		long t=x;
		long r;
		t=t>0?t:-t;
		r=0;
		for(;t>0;t/=10){
			System.out.printf("t is: %d \t t10:%d \n",t,t%10);
			r=r*10+t%10;
		}
		System.out.printf("result is: %d",r);
		if (r>Integer.MAX_VALUE){
			return 0;
		}
		else{
			r=x>0?r:-r;
			return (int)r;
		}
		
	}
	
	public static void main(String[] args){
		int r;
		r=reverse(1534236469);

		System.out.printf("result is: %d",r);
	}
}
