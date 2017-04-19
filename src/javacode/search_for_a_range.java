//���׷���ĵط��� first=++mid; ���û��ǰ���++������������ǣ�first=mid!=target; while first!=last forever;
//last should = nums.length; instead of nums.length-1; �б�Ҫ��nums.length������ΪUpperbound������η��ص���ֵ������Ѱ��ֵ�ĺ�һλ������Ҫ��ȥ1��
//�б�Ҫ�ж��Ƿ�Ϸ�������տ�ʼ��Ҫ�ж�nums�����Ƿ�Ϊ��
//special test case: {[] 1}; {[1],1}
package javacode;

public class search_for_a_range {
	public static int[] searchRange(int[] nums,int target){
		if(nums.length==0) return new int[]{-1,-1};
		int first=0, last=nums.length;
		int upper=upperBound(target,nums,first, last);
		int lower=lowerBound(target,nums, first, last);
		//System.out.println(nums[last]);
		if(lower==nums.length||nums[lower]!=target)	return new int[]{-1,-1};
		else return new int[]{lower, upper-1};
		
	}
	
	public static int upperBound(int target,int[] nums,int first, int last){		
		while(first!=last){
			System.out.println(last);
			int mid=first+(last-first)/2;
			if(nums[mid]<=target) first=++mid; 
			else last =mid;
		}
		return first;
	}
	public static int lowerBound(int target, int[] nums, int first, int last){		
		while(first!=last){
			int mid=first+(last-first)/2;
			if(nums[mid]<target) first=++mid;
			else last=mid;
		}
		return first;
	}
	public static void main(String[] args){
		int[] nums={5,7,7,8,8,10};
		//int[] nums={1};
		int[] result = searchRange(nums,10);
		System.out.print(result[0]);
		System.out.print(result[1]);
		System.out.println("success");
	}
}
