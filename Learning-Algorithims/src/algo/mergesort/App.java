package algo.mergesort;

public class App {
	public static void main(String[] args) {
		int[] inputArray = {5,7,12,0,16,2,9,5,8};
		MergeSort mSort = new MergeSort();
		
		mSort.mergeSort(inputArray);
		
		for(int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i]+"  ");
		}
	}
	
}
