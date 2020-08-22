package com.program;

public class DistributeNCandiesAmongKPeople {
	public static void main(String[] args) {
		int n=10,k=3;
		candies(n,k);
	}

	public static void candies(int n, int k) {
		int count=0; //count number of complete turns
		int ind=1; //Get the last term;
		
		int[] arr = new int[k];//stores number of candies
		
		for(int i=0;i<k;i++) {
			arr[i]=0;
		}
		
		while(n>0) {
			  // Last term of last and 
            // current series 
			int f1=(ind-1)*k;
			int f2= ind*k;
			
			// Sum of current and last series 
			int sum1 = (f1*(f1+1))/2;
			int sum2 = (f2*(f2+1))/2;
			
			// Sum of current series only 
			int result = sum2-sum1;
			
			// If sum of current is less than N if
			if(result <= n) {
				count++;
				n-= result;
				ind++;
			}else {// Individually distribute 
				int i=0;
				
				int term = ((ind-1)*k)+1;
				while(n>0) {
					if(term<=n) {
						arr[i++] = term;
						n-=term;
						term++;
					}else {
						arr[i++]=n;
						n=0;
					}
				}
			}	
		}
		// Count the total candies 
		for(int i=0;i<k;i++) {
			arr[i]+= (count*(i+1))+(k*(count*(count-1))/2);
		}
		// Print the total candies 
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
