import java.util.*;

class Sort012{
    //sorting algorithm - Sorts Ascending - Selection Sort - O[n^2] time Complexity
    static void sortAsc(int arr[],int len){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<len;i++){
            if(arr[i] == 0){
                count0++;
            }else if(arr[i] == 1){
                count1++;
            }else if(arr[i] == 2){
                count2++;
            }
        }
        for(int j=0; j<count0;j++){
            arr[j] = 0;
        }
        for(int j=count0; j<count1+count0;j++){
            arr[j] = 1;
        }
        for(int j=count1+count0; j<count2+count0+count1;j++){
            arr[j] = 2;
        }
    }
    static void printArray(int arr[],int len){
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+",");
        }
    }
    //Main function - Execution Begins from here
    public static void main(String[] args){
        int newArray[] = {1,2,0,1,0,2,1,2,1,2,2,0,0,1,2,2,0,1,1,2,2,0,1,0,0,1};
        System.out.print("This is the sorted 0,1,2 without any sorting algorithm\n");
        int len = newArray.length;
        //Sort Array
        System.out.print("\nOriginal Array =>");
        printArray(newArray,len);
        sortAsc(newArray,len);
        System.out.print("\nSorted Array =>");
        printArray(newArray,len);
    }
}
