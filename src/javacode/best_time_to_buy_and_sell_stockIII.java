//cha fen Array To solve
package javacode;

public class best_time_to_buy_and_sell_stockIII {
	
	
	public static int maxProfit(int[] prices){
		if (prices.length==0 || prices.length==1) return 0; //I ve tried price==null for judgement, failed however. 
		int n=prices.length;
		int[] f = new int[n];
		int[] g = new int[n];
				
		int max_profit=0;
		int valey=prices[0];
		int peak=prices[n-1];
		
		//forward to find max
		f[0]=0;
		for(int i=1;i<n;i++){
			valey=Math.min(valey,prices[i]);
		 	f[i]=Math.max(f[i-1], prices[i]-valey);
		}
		
		//backward find max
		g[n-1]=0;
		for(int i=n-2;i>=0;i--){
			peak=Math.max(peak, prices[i]);
			g[i]=Math.max(g[i+1], peak-prices[i]);
		}
		//combine to find max
		for(int i=0;i<n;i++){
			max_profit=Math.max(max_profit, f[i]+g[i]);
		}
		
		return max_profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={4,1,2};
		int result=maxProfit(nums);
		//System.out.printf("%d",result);
		System.out.print(result);
		System.out.println("success");
	}

}
 