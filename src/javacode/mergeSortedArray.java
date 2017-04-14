//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//you may assume that nums1 has enough space(size that is greater or equal to m+n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively. 
//
package javacode;

public class mergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2,int n){
		int index=m+n-1;
		int indexA=m-1;
		int indexB=n-1;
		
		while(indexA>=0&&indexB>=0){
			nums1[index--]=nums1[indexA]>nums2[indexB]?nums1[indexA--]:nums2[indexB--];
		}
		
		while(indexB>=0){
			nums1[index--]=nums2[indexB--];
		}
	}
	public static void main(String[] args){
		int[] nums1={1,2,5,-1,-1};
		int[] nums2={4,6};
		int m=3,n=2;
		merge(nums1,3,nums2,2);
		for(int i=0;i<nums1.length;i++){
			System.out.printf("%d,",nums1[i]);
		}
		System.out.println("success");
	}
}
