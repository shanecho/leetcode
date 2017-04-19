//int[][] matrix={{}}; matrix.length==1 instead of 0; µ«ÊÇ matrix[0].length==0;
package javacode;

public class search_a_2d_matrix_ii {
	public static boolean searchMatrix(int[][] matrix, int target){
		if(matrix.length==0||matrix[0].length==0) return false;
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		int m = matrix.length;
		int n=matrix[0].length;
		int i=0,j=n-1;
		while(i<matrix.length && j>=0){	
			if(matrix[i][j]==target) return true;			
			if(target>matrix[i][j]) i++;
			else j--;
		}
		
		return false;
	}
	public static void main(String[] args){
		int[][] matrix={
				  {1,   4,  7, 11, 15},
				  {2,   5,  8, 12, 19},
				  {3,   6,  9, 16, 22},
				  {10, 13, 14, 17, 24},
				  {18, 21, 23, 26, 30}				
		};
//		int[][] matrix={{}};
		
		System.out.println(searchMatrix(matrix,5));
		System.out.println("success");
	}
}
