package javacode;

public class unique_path_ii {
	private static int[][] f;
	
	public static int uniquePathWithObstacles(int[][] obstacleGrid){
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if(obstacleGrid[0][0] !=0 || obstacleGrid[m-1][n-1]!=0) return 0;
		
		f = new int[m][n];
		f[0][0]=1;
		
		return dfs(obstacleGrid, m-1, n-1);
	}
	
	private static int dfs(int[][] obstacleGrid, int x, int y){
		if (x<0 || y<0) return 0;
		if (obstacleGrid[x][y]!=0) return 0;		
		
		if (x==0 && y==0) return 1;
		if(f[x][y]>0){
			return f[x][y];
		}else{
			return f[x][y]=dfs(obstacleGrid, x-1, y)+dfs(obstacleGrid, x, y-1);
		}

	}
	
	public static void main(String[] args){
		int[][] obstacleGrid = {{0,0},{1,1},{0,0}};
		System.out.print(uniquePathWithObstacles(obstacleGrid));
		System.out.println("success");
	}
}
