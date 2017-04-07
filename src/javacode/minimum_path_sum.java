package javacode;

import java.util.Arrays;

//题目的想法：
//DP解决，对于一个GRID来说，因为题目限制了运动方向，只能向右或者向下，所以对于这两行特殊处理一下，其他空格均满足：
//state: f[i,j]= min{f[m-1][n],f[m][n-1]}+f[i,j]

public class minimum_path_sum {
	static int minPathSum(int[][] grid){
		if (grid==null || grid.length ==0|| grid[0].length==0) return 0;
		int m = grid.length;
		int n = grid[0].length;		
		int f[][]=new int[m][n];
		//Arrays.fill(f,1); //并不是二维数组的初始化方式
		
		f[0][0]=grid[0][0];
		for(int i=1; i<m;i++) f[i][0]=f[i-1][0]+grid[i][0];
		
		for (int j=1;j<n;j++) f[0][j]=f[0][j-1]+grid[0][j];
			
		for(int i=1;i<m;i++) for(int j=1;j<n;j++){
				f[i][j]=Math.min(f[i-1][j], f[i][j-1])+grid[i][j];
			}
		
		return f[m-1][n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("success");
		int grid[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int result;
		result=minPathSum(grid);
		System.out.printf("%d",result);
	}

}
