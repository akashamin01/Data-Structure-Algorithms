// count possible pairs of sum 
import java.util.*;

class CountPairsOfSum{
    public static void main(String[] atgs){
        // int arr[] = {1,9,2,3,6,5,4,7,2};
        int arr[] = {1,5,7,1};
        // int arr[] = {1, 1, 1, 1};
        int n = arr.length;
        int k = 6;
        int sum = 0;
        int count = 0;
        for(int i = 0; i<n ;i++){
            for(int j=i+1;j<n;j++){
            sum = arr[j] + arr[i];
                if(sum == k){
                  count++;
                }
            }
        }
        System.out.print(count);
    }
}