import java.util.*;

public class CountSwaps {
    public static void main(String[] ARGS){
        int arr[] = {2,4,1,3,5};
        int N = arr.length;
        int swap = 0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }
        }
        System.out.print(swap);
    }
    
}
