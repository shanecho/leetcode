package javacode;
//˼·�������γ�һ�����죬ע���κ�һ������չ�����Բ���������1�㡣���ͨ�����ַ�ʽ�ܹ�һ�ΰ�һ�������1ȫ����������ô�䱾��͹���һ�����졣
//Basic Idea: for any form of island, starting from anyone point of this area by applying DFS algorithm, this island could be killed. The return value of number of killed is the number of island.
//island: no cross line, only in horizontal or in parallel

public class number_of_island {
	static int numIsland(char[][] grid){
		if(grid.length==0) return 0;//����������Ϊ0����������
		
		int islandCount=0;
		int m=grid.length;
		int n=grid[0].length;
		
		for(int i=0;i<m;i++) for (int j=0;j<n;j++){
			if(grid[i][j]=='1'){
				DFSMarker(grid,i,j);
				islandCount++;
			}
		}
		return islandCount;
	}
	
	static void DFSMarker(char[][] grid,int i, int j ){//clean for a single island, ע��Խ������
		if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1') return;//ע���жϵ�˳�����ж�Խ�磬���ж��Ƿ�Ϊ1
		grid[i][j]='0';
		DFSMarker(grid,i-1,j);
		DFSMarker(grid,i+1,j);
		DFSMarker(grid,i,j-1);
		DFSMarker(grid,i,j+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] map ={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		int result =numIsland(map);
		System.out.printf("%d",result);
		System.out.printf("\nSuccess");
	}

}
