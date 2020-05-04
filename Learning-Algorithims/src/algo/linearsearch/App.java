package algo.linearsearch;

public class App {
	public static void main(String[] args) {
		int arr[] = {3,8,9,11,2,7,15,20};
		int key=7;
		System.out.println(linearSearch(arr,key));
	}
	
	public static int linearSearch(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
}
