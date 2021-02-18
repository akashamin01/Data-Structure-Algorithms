import java.util.*;

public class MinimizeHeights{
  static void minimizeHeight(int arr[],int k,int n){
    int ans  = arr[n-1] - arr[0];
    int smallest = arr[0] + k;
    int largest = arr[n-1] - k;
    //Swap if smallest is greater than largerst
    if(smallest>largest){
        int temp = smallest;
        smallest = largest;
        largest = temp;
    }
    for(int i=0;i<n;i++){
      int add = arr[i] + k;
      int sub = arr[i] - k;
      if(sub>=smallest || add<=largest)
        continue;  
      if(largest-sub <= add-smallest ){
          smallest = sub;
      }else{
          largest = add;
      }
    }
    int ans1 = largest - smallest;
    if(ans1< ans){
        ans = ans1;  
    }
    System.out.print(ans);
  }
  public static void main(String[] xyz){
    // {2,6,3,4,7,2,10,3,2,1}
    int arr[] = {2,6,3,4,7,2,10,3,2,1};
    int k = 5;
    int n = arr.length;
    Arrays.sort(arr);
    minimizeHeight(arr, k, n);
  }
}
