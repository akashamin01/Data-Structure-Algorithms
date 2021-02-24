import java.util.*;

class TripletSum{
    public static void main(String[] args){
        int arr[] = {1,2,4,3,6};
        int n = arr.length;
        int x = 10;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=0;
                for(int k=j+1;k<n;k++){
                    sum = arr[i]+arr[j]+arr[k];
                    if(sum == x){
                        System.out.print("num=>{"+arr[i]+","+arr[j]+","+arr[k]+"}");
                    }
                }
            }
        }
    }
}