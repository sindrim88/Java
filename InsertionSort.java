
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {-1, 7, 4, 2, 5, 8, 0, 2, 9, -5, 0};
		insertionSort(arr);
	}
	
	public static void insertionSort(int arr[]) {
		
		int i = 1;
		while(i < arr.length) {
			
			int j = i-1;
			int key = arr[i];

			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key; 
			//Visualizing the steps 
			for(int k = 0; k<arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println(" ");
			i++;
		}
	}
}
