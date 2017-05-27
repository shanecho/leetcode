//他丫的有病吧，非要我用DP， DFS一点不让用啊，我已经把复杂度降到n square了明明
package javacode;

public class unique_path {
	private static int[][] f;
	public static int uniquePaths(int m, int n){
		f = new int[m][n];
		f[0][0]=1;
		return dfs(m-1,n-1);		
	}
	
	private static int dfs(int x, int y){
		if(x<0 || y<0) return 0;
		if(x==0 && y==0) return 1;
		if(f[x][y]>0){
			return f[x][y];
		}else{
			return f[x][y]= dfs(x-1,y)+dfs(x,y-1);
		}
		
	}
	
	public static void main(String[] args){
		System.out.print(uniquePaths(23,12));
		System.out.println("success");
	}
}
