//基数排序
//声明数组长度之后实际已经初始化了数组; 但数值不行，必须 int sum=0的形式;
//之所以声明histogram 为 n+1是因为我希望最后返回的数值h不需要再加1
// for(int x: citations) x是citation里面的每一个元素
//隐隐觉得有个问题，如果x取的是元素，那么岂不是说极其可能越界
//但至少某种程度讲，思路是对的：首先数组应该是有序的，而且应该是逆序的，在从后向前进行遍历寻找

package javacode;

public class h_index {
	public static int hIndex(int[] citations){
		int n=citations.length+1;
		int[] histogram= new int[n+1];
		
		for(int x:citations){
			histogram[x>n?n:x]++;
		}
		int sum=0;
		for(int i=n;i>0;i--){
			sum+=histogram[i];
			if(sum>=i){
				return i;
			}			
		}
		
		return 0;
	}
	public static void main(String[] args){
		int[] citations={3,0,6,1,5};
		int result = hIndex(citations);
		System.out.print(result);
		System.out.println("Success");
	}
}
