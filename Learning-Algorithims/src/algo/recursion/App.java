package algo.recursion;

public class App {
	public static void main(String[] args) {
		//reduceByOne(4);
		System.out.println(recursiveLinearSearch(new int[] {4,48,4,28,34,76,9,3}, 0, 48));
	}
	
	public static void reduceByOne(int n) {
		if(n >= 0) {  //Base Case

			reduceByOne(n-1);
		}
		System.out.println("Completed Call : "+n);
	}
	
	public static int recursiveLinearSearch(int[] arr, int i,int x) {
		if(i > arr.length-1) { //if evaluates the true, x was not found in the array
			return -1;
		}else if(arr[i] == x) {
			return i;
		}else {
			System.out.println("Index at: "+i);
			return recursiveLinearSearch(arr, i+1, x);
		}
	}
}
