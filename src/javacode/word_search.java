//找到坐标了，那么下一步去寻找周围有没有下一个字符；注意边界；所以应该是个循环；
//如果能够在周围找到下一个继续循环；
//如果不能找到，退出循环，寻找下一个字符；
//DFS 用栈解决
package javacode;
import java.util.*;

public class word_search {
	
    public static boolean exist(char[][] board, String word) {
        
        int m=board.length;
        int n=board[0].length;
        boolean[][] visit = new boolean[m][n];
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(dfs(visit,word,board,0,i,j))
        			return true;
        	}
        }       
    	return false;
    }
    public static boolean dfs(boolean[][] visit, String word, char[][] board, int index, int i, int j){
    	if(index==word.length()) return true;
    	//out of bound
    	int m=board.length;
    	int n=board[0].length;
    	if(i<0||j<0||i>=m||j>=n) return false;
    	//visited
    	if(visit[i][j]==true) return false;
    	//not equal
    	if(board[i][j]!=word.charAt(index)) return false;
    	//we start it from visited, if the loop is ended, clear it as unvisited;
    	visit[i][j]=true;
    	boolean result= dfs(visit,word,board,index+1,i-1,j)||dfs(visit,word,board,index+1,i+1,j)||dfs(visit,word,board,index+1,i,j-1)||dfs(visit,word,board,index+1,i,j+1);
    	visit[i][j]=false;    	
    	return result;
    	
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="SEE";
		char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		
		System.out.printf("%b",exist(board,word));
		
		
		
	}

}
