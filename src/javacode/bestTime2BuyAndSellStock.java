package javacode;

public class bestTime2BuyAndSellStock {
	static int bestTime(int[] prices){//this method exceed time limit, although it works
		int venue=0;
		for(int i=0;i<prices.length;i++) for(int j=0;j<prices.length;j++){
			if((j>i) && (venue<prices[j]-prices[i])) {venue=prices[j]-prices[i];}
			//System.out.printf("%d ",venue);
		}
		if(venue<0) return 0;
		return venue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={7,1,5,3,6,4};
		int result=bestTime(nums);
		System.out.printf("\n%d",result);
	}

}
