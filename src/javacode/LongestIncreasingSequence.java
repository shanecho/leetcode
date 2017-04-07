package javacode;
//所以题目的解法就是，或者状态转移方程就是：对于终点j, 她的LIS长度就是他前面任何小于他的数值的坐标下的LIS长度。
//所以涉及到两个数组一个用于存储数值，一个只是春初LIS值，但坐标是相同的。
//Global 的作用是不一定最后一个是最大的，所以我希望能够在f数组中寻找一个最大的数值；
import java.util.Arrays;

public class LongestIncreasingSequence {
	
	static int LIS(int[] nums){
		//int[] f=nums; //如果如此，那么结果就是在后面整个num 就被初始化为1了
		if (nums==null || nums.length==0) return 0;
		int global=0;
		int[] f = new int[nums.length];//就不初始化，就不赋初值
		Arrays.fill(f,1);	
		
		for(int i=0;i<nums.length;i++){
			for (int j=0;j<i;j++){ 				
				if (nums[j]<nums[i]){
					f[i]=Math.max(f[i],f[j]+1);
					//System.out.printf("%d",f[i]);
				}				
			}
			if(f[i]>global) global=f[i];
		}
		
		return global;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={10,9,2,5,3,7,101,18};
		int nums2[]={1,3,6,7,9,4,10,5,6};
		int result = LIS(nums2);
		System.out.printf("%d",result);
	}

}
