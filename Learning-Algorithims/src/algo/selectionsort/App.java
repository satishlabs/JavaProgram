package algo.selectionsort;

public class App {
	public static void main(String[] args) {
		int arr[]=selectSort(new int[] {9,8,13,87,12,99});
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] selectSort(int[]a) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min =j;
				}
			}
			int temp =a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		return a;
		
	}
}

/*
 for i=0 to A.length-1
  A.  set minimum to i
  B.  for j=i+1 tp A.lenght
  		a. ifA[j] <A[minimum]
  			then set minimum to j
  C. Swap A[i] with A[minimum]
  
 */
