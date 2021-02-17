import java.util.*;

class RotateArraybyN{
    static void rotate(int N,int len,int arr[]){
        for(int j=0; j<N;j++){
            for(int i=len-2; i>=0;i--){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    static void print(int len,int arr[]){
        for(int i =0; i<len;i++){
            System.out.print(arr[i]+"->");
        }
    }
    public static void main(String[] xyz){
        int arr[]={1,2,3,4,5,6,7,8,9};
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter the number of Rotations You want\n");
        int N = sc.nextInt();
        System.out.print(N+"\n");
        int len = arr.length;
        rotate(N,len,arr);
        print(len,arr);
    }
}
