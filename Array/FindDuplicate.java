import java.util.*;

class FindDuplicates{
    public static void main(String[] args){
        // System.out.print("hello");
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int check = arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]==check){
                    System.out.print(check);
                }
            }
        }
    }
}
