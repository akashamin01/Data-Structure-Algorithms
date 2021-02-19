import java.util.*;

public class LargestSubArraySum{

    static void largestSumSubarray(int arr[],int len){
        int max = 0;
        for(int i=0;i<(1<<len);i++){
            System.out.print("\n");
            int sum = 0;
            for(int j =0; j<len;j++){
                if((i & 1<<j) > 0){
                    sum  = sum + arr[j];
                    System.out.print(arr[j]);
                }
            }
            if(sum > max ){
                max = sum;
            }
            System.out.print("sum = "+sum);
        }
        System.out.print("max = "+max);

    }
    public static void main(String[] xyz){
        int arr[] = {1,2,3,-2,5};
        int len = arr.length;
        largestSumSubarray(arr,len);
    }
}
