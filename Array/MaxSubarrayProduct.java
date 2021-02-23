import java.util.*;

public class MaxSubarrayProduct {
    public static void main(String[] args){
        // int arr[] = {6, -3, -10, 0, 2};
        // int arr[] = {8,-2,-2,0,8,0,-6,-8,-6,-1};
        int arr[] = {90,91,-91,91,-91,-90,90,90,-90,-90};
        int n = arr.length;
        long max = 1;
        for(int i=0;i<n;i++){
          long mul=1;
            for(int j=i;j<n;j++){
                mul = mul * arr[j];
                System.out.print("\nobj=>"+mul);
                if(mul>max){
                  max = mul;
                  // System.out.print("obj=>"+max);
               }
            }
            // System.out.print("\nobj=>"+mul);
        }
        System.out.print(max);
    }
}
