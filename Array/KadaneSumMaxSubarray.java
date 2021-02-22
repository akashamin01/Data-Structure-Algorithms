import java.util.*;

class KadaneSumMaxSubarray{
    public static void main(String[] args){
    int a[] = {1,2,3,-2,5};
    int size = a.length;
    int max_so_far = a[0];
    int curr_max = a[0];
 
    for (int i = 1; i < size; i++)
    {
        curr_max = Math.max(a[i], curr_max+a[i]);
        max_so_far = Math.max(max_so_far, curr_max);
    }
    System.out.print("max=>"+max_so_far);
    }
}