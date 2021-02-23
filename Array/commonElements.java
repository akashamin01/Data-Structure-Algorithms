import java.util.*;

class CommonElements{
    static ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        int small = 0;
        if(n1<n2){
            if(n3<n1){
                small = n3;
            }else{
                small = n1;
            }
        }else{
            small = n2;
        }
        // System.out.print("\nsmall=>"+small);
        ArrayList<Integer> arr = new ArrayList<Integer>(small); 
        // int arr[] = new int[small];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i] == b[j]){
                    for(int k=0;k<n3;k++){
                        if(a[i] == b[j] && b[j] == c[k]){
                            if(arr.contains(a[i])){
                                //        
                            }else{
                                arr.add(a[i]);
                            }
                                    // System.out.print("\n=>"+arr.size());     
                            // System.out.print("\n=>"+arr[l]);  
                            // l++;
                        }
                    }
                }
            }
        }
        return arr;
      
    }
    public static void main(String[] args){
        int a[] = {1, 5, 10, 20, 40, 3,3,3,3,6,33,3,4,4,5};
        int b[] = {6, 7, 20, 80, 1003,6,3,3,3,2,3,3,3,6,4,5};
        int c[] = {3, 4, 15, 20, 30, 70, 80, 1206,3,3,3,2,3,3,3,6,4};
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;
        ArrayList<Integer> res = commonElements(a, b, c, n1, n2, n3);
        if(res.size() == 0){
            System.out.print(-1);
        }else{
            for(int i=0;i<res.size();i++){
                System.out.print(res.get(i)+"->");
            }
        }
    }

}
