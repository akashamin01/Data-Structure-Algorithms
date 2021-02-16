import java.io.*;

class NegativesOnTop{
    //Method to Rearrange Array(Negatives to the top)
	static void rearrange(int arr[], int n){
		int j = 0, temp;
		for (int i = 0; i < n-1; i++) {
			if (arr[i] < 0) {
                temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                j++;
			}
		}
	}
    //Method to print an Array
	static void printArray(int arr[], int n){
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	// Driver code
	public static void main(String args[]){
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int n = arr.length;
		rearrange(arr, n);
		printArray(arr, n);
	}
}
