package javacode;

public class removeElement {
	
	static int elementRemove(int[] nums, int val){
		int index =0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[index++]=nums[i];
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,2,3,4,5,5,2};
		int result = elementRemove(nums,2);
		System.out.printf("%d\n",result);
		
		for(int i=0;i<result;i++){
			System.out.printf("%d ",nums[i]);
			//System.out.printf("(i =%d) ",i);
		}
		System.out.println("\nSuccess");
	}

}
