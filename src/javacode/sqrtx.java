//implement int sqrt(int x)
//compute and return the square root of x.
//solutions
//Divide the problem into three situations: mid^2 >x means the right is big, just decrease the right; mid^2<x, means mid is small just increase the left, and record the last_mid state, in case of left>=right; mid^2=x the optimal case, just return mid; 
//*Special notice, this problem only cares about the integer

package javacode;

public class sqrtx {
	
	public static int mysqrt(int x){
		int left=1, right=x/2;
		int last_mid=-1;
		int mid;
		if(x<2) return x;//dont and never forget
		
		while(left<=right){
			mid=left+(right-left)/2;
			if(x/mid>mid){
				left=mid+1;
				last_mid=mid;
			}else if(x/mid<mid){
				right=mid-1;
			}else{
				return mid;
			}
		}
		return last_mid;
	}
	public static void main(String args[]){
		int x=9;
		int result =mysqrt(x);
		System.out.println(result);
		System.out.println("success");
	}

}
