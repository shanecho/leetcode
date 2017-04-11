package javacode;

public class searchInsertPosition {
	public static int searchInsert(int[] nums, int target){
		int result=binarySearch(nums,target);
		return result;
	}
	
	public static int binarySearch(int[] nums, int target){
		
		int First=0;
		int Last=nums.length-1;
		if (target>nums[Last]) return Last+1;
		else{
			while(First!=Last){
				int Mid=First+(Last-First)/2;
				if(target>nums[Mid]) First=++Mid;//dont forget ++
				else Last=Mid;
			}
		}		
		return First;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,5,6};
		int target=7;
		System.out.printf("the result is: %d",searchInsert(nums,target));
		System.out.printf("success");
	}

}
