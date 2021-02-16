import java.util.*;

class MinMaxFromArray{
    //Function returns Minimum value from the array
    static long minimum(long arr[],long len){
        long min = arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    //Function returns Maximum value from the array
    static long maximum(long arr[],long len){
        long max = arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //Main Function - Execution Begins from here
    public static void main(String[] args){
        long newArray[] = {5,11,18,748,45,53,65,165,57,4,1000000000,422298,41};
        long len = newArray.length;
        long minimum = minimum(newArray,len);
        long maximum = maximum(newArray,len);
        System.out.print("\nThe minimum element of the array is => "+minimum);
        System.out.print("\nThe maximum element of the array is => "+maximum);
    }
}
