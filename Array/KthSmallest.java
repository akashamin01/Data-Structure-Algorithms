import java.util.*;

class KthSmallest{
    //sorting algorithm - Sorts Ascending - Selection Sort - O[n^2] time Complexity
    static void sortAsc(int arr[],int len){
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    //Main function - Execution Begins from here
    public static void main(String[] args){
        int newArray[] = {23,62,48,4828,24,342,74,84859,434,4,223,42442,48,999294,929};
        System.out.print("Please Enter a number to get that smallest Element\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = newArray.length;
        //Sort Array
        sortAsc(newArray,len);
        //Get the nth smallest/ nth largest element
        System.out.print("The "+n+"th element is =>"+newArray[n-1]);
    }
}
