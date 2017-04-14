package javacode;

public class pow {
	public static double power(double x,int n){
		if(n<0) return 1/powerCal(x,-n);
		else return powerCal(x,n);
		
	}
	public static double powerCal(double x, int n){
		if(n==0) return 1;
		double v=powerCal(x,n/2);
		if(n%2==0){
			return v*v;
		}else{
			return v*v*x;
		}
	
	}
	
	public static void main(String[] args){
		double x=2.0;
		int n=3;
		System.out.printf("%f",power(2.0,3));
		System.out.println("success");
	}
}
