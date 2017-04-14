package javacode;

public class maximumSubArray {
    public static int maxSubArray(int[] nums) {
        int[] subArray = new int[nums.length];
        subArray[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        	subArray[i]= Math.max(subArray[i-1]+nums[i],nums[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<subArray.length;i++){
        	max=Math.max(max, subArray[i]);
        }
        return max;
    }
    
    public static void main(String[] args){
    	System.out.println("success");
    	int[] nums={-2,1,-3,4,-1,2,1,-5,4};
    	int result=maxSubArray(nums);
    	System.out.printf("%d",result);
    	
    }

}
