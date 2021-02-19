import java.util.*;

class MergeArrays {
    public static void main(String[] args){
    int arr1[] = {4,6,8};
    int arr2[] = {5,7};
    int l1 = arr1.length;
    int l2 = arr2.length;
    Arrays.sort(arr2);
    Arrays.sort(arr1);
    // int latestMin = 0;
    for(int i=0;i<l1;i++){
        for(int j=0;j<l2;j++){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
        }
    }
    for(int k=0;k<l1;k++){
        System.out.print(arr1[k]+"->");
    }
    Arrays.sort(arr2);
    for(int k=0;k<l2;k++){
        System.out.print(arr2[k]+"->");
    }
    }
}
