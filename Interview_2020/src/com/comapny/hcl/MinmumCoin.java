package com.comapny.hcl;

public class MinmumCoin {
		public static void main(String[] args) {
			 int coins[] =  {9, 6, 4, 1}; 
		       int m = coins.length; 
		       int V = 11; 
		       System.out.println("Minimum coins required is "+ minCoins(coins, m, V) ); 
		}

		private static int minCoins(int[] coins, int m, int v) {
			if(v== 0)
				return 0;
			
			int res = Integer.MAX_VALUE;
			for(int i=0;i<m;i++) {
				if(coins[i] <= v) {
					int sub_res = minCoins(coins, m, v-coins[i]);
					
					if(sub_res != Integer.MAX_VALUE && sub_res+1 < res)
						res = sub_res+1;
				}
			}
			return res;
		}
}
