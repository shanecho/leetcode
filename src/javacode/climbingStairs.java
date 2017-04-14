//you are climbing a stair case. it takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. 
//In how many distinct ways can you climb to the top?
// Note: Given n will be a positive integer.
//ʵ�������������һ��쳲��������У�������ֻ��Ҫ����������f(n-1)+f(n-2)�͹��ˡ���ʼֵf1=1; f0=1 [f0����0����Ϊ����Ҳ��һ�ַ���];
//�������͵Ĳ��������� 3->4; 2->2;

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
