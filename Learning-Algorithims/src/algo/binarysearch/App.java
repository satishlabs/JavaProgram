package algo.binarysearch;

public class App {
	public static void main(String[] args) {
		//System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18},12));
		System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18},0,7,18));
	}
	public static int binarySearch(int[] arr,int x) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(x<arr[mid])
				right =mid-1;
			else if(x>arr[mid])
				left = mid+1;
			else return mid;
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] arr,int left,int right, int key) {
		System.out.println("[ "+left+"..."+right+" ]");
		if(left >right) {
			return -1;
		}else {
			int mid =(left+right)/2;
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] > key) {
				return recursiveBinarySearch(arr, left, right-1, key);
			}else {
				return recursiveBinarySearch(arr, left+1, right, key);
			}
		}
	}
}
