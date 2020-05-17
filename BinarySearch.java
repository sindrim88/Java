import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {-5,-2,-1,1,3,4,5,9,11,15,20};
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		search(arr, x);
		scan.close();
	}
	//Binary search
	//array of numbers in ascending order
	public static int search(int arr[], int x) {
		
		int i = 0; 
		int j = arr.length;
		int m;
		m = (i+j)/2;
		while(i < j) {
			
			m = (i+j)/2;
			if(arr[m] >= x) {
				j = m;
			}
			else {
				i = m+1;
			}
		}
		if(arr[i] != x) {
			System.out.println("Element was not found");
			return -1;
		}
		System.out.println(x + " is in " + i + " place in the array");
		return i;
	}
}
