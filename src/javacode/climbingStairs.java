//you are climbing a stair case. it takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. 
//In how many distinct ways can you climb to the top?
// Note: Given n will be a positive integer.
//实际上这个问题是一个斐波那契数列，所以我只需要计算出和求和f(n-1)+f(n-2)就够了。起始值f1=1; f0=1 [f0不是0，因为本身也是一种方法];
//几个典型的测试用例： 3->4; 2->2;

package javacode;
public class climbingStairs {
	public static int climbStairs(int n){
        int fprev=1,fafter=1,fn = 0;
		if(n==1) return 1;
		if(n==0) return 0;
		for(int i=2;i<=n;i++){
			//fn=fn-1+fn-2
			fn=fprev+fafter;
			fprev=fafter;
			fafter=fn;
		}
		return fn;
    
	}
	
	public static void main(String[] args){
		System.out.printf("%d",climbStairs(3));
		System.out.println("success");
	}
}
