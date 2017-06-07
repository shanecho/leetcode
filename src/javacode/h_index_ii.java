// test case: {0, 0}, {1, 0}, {0}
package javacode;

import java.util.Arrays;

public class h_index_ii {
	public static int hIndex(int[] citations){
		int begin = 0;
		int len = citations.length;
		int end = len;
		
		while(begin < end){
			int mid = begin + (end - begin)/2;
			
			if(citations[mid] < len - mid){
				begin = mid + 1;
			} else{
				end = mid;//�������1����ô���п��ܱ������Եĵ����ˣ�if�з���û�£����else����˾Ͳ�����
			}
		}
		
		return len - begin;
	}
	public static void main(String[] args){
		int[] citations={1, 0};
		Arrays.sort(citations);
		for(int cit:citations) 	System.out.print(cit);
		System.out.println(hIndex(citations));
		System.out.println("success");
	}
}
