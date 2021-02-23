import java.util.*;

public class SubArraySumToZero {
    public static void main(String[] args){
        int arr[] = {4,2,0,1,6};
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
          int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + arr[j];
                // System.out.print("\ncount=>"+sum);        
                if(sum ==0){
                    // count++;
                    System.out.println(sum==0); 
                }
            }
        }
        // System.out.print("count=>"+count);
    }    
}
