//Description: write an efficient algorithm that searches for a value in an mxn matrix. This matrix has the following properties.
	//Integers in each row are sorted from left to right
	//The first integer of each row is greater than the last integer of the previous row
//注意 当矩阵为空的时候，是没有列数的 test case: [], 0
package javacode;

public class search_a_2d_matrix {
	public static boolean searchMatrix(int[][] matrix, int target){
		if (matrix.length==0) return false;//当矩阵为空的时候，矩阵是没有n的
		int m=matrix.length;
		int n=matrix[0].length;
		int first=0, last=m*n;
		
		while(first!=last){
			int mid=first+(last-first)/2;
			int val=matrix[mid/n][mid%n];
			
			if(val==target) return true;
			if(target>val) first=++mid;
			else last=mid;			
		}
		
		return false;
	}
	public static void main(String[] args){
		//int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int[][] matrix={{}};
		System.out.println(searchMatrix(matrix,5));
		System.out.println("success");
	}
}
