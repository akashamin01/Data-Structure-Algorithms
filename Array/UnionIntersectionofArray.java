import java.util.*;
//Program to get distinct values from two arrays

class UnionIntersectionofArray{
     // Function to find intersection
    static void intersection(int a[], int b[], int n, int m)
    {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] > b[j]) {
                j++;
            }
            else if (b[j] > a[i]) {
                i++;
            }
            else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
    static int Union(int arr1[], int arr2[], int m, int n) 
    { 
        int i = 0, j = 0; 
        while (i < m && j < n) { 
            if (arr1[i] < arr2[j]) 
                System.out.print(arr1[i++] + " "); 
            else if (arr2[j] < arr1[i]) 
                System.out.print(arr2[j++] + " "); 
            else { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
        /* Print remaining elements of  
         the larger array */
        while (i < m) 
            System.out.print(arr1[i++] + " "); 
        while (j < n) 
            System.out.print(arr2[j++] + " "); 
        return 0; 
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 1, 3,2,3,3,3,5,5,7,8,9, 6 };
        int b[] = { 1, 2, 2, 3, 5 };
 
        int n = a.length;
        int m = b.length;
        //if array-1 is smaller than array-2 Swap
        if(m>n){
            int temp[] = a;
            a=b;
            b=temp;
        }
        n = a.length;
        m = b.length;
        // sort
        Arrays.sort(a);
        Arrays.sort(b);
       
        // Function call
        System.out.print("The Intersection Part =>\n");
        intersection(a, b, n, m);
        System.out.print("\nThe Union Part =>\n");
        Union(a, b, n, m);
    }
}
