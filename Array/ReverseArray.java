import java.util.*;

class ReverseArray{
    //Print Array Method
    static void printArray(int arr[], int len){
        for(int i=0; i<len;i++){
            System.out.print(arr[i]+",");
        }
    }
    //Reverse Swap Logic - Swap Logic(first<->last) - Recursion Also Possible
    static void reverseArray(int arr[]){
        int start =0;
        int end = arr.length-1;
        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    //Main Function - Execution Begins
    public static void main(String[] args){
        System.out.print("\nProgram To Reverse An Array =>\n");
        int originalArr[] =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.print("\nThe Original Array is => ");
        int len = originalArr.length;
        printArray(originalArr,len);
        reverseArray(originalArr);
        System.out.print("\nThe Reversed Array is => ");
        printArray(originalArr,len);
        System.out.print("\n\nThe overall time complexity is O[n] and Space Complexity is O[1]\n");
    }
}
