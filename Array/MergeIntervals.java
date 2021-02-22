import java.util.*;

public class MergeIntervals{
    static void print(int intervals[][],int N2,int N){
        for(int i=0;i<N;i++){
          System.out.print("["); 
          for(int j=0;j<N2;j++){
            System.out.print(intervals[i][j]); 
            if(j==0){
            System.out.print(",");
            }
          }
          System.out.print("]");
        } 
    }
    public static void main(String[] ARGS){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        // int[][] intervals = {{1,4},{0,4}};
        // int[][] intervals = {{1,4},{4,5}};
        // int[][] intervals = {{1,4},{2,3}};
        int N = intervals.length;
        int N2= intervals[0].length;
        int remCnt = 0;
        System.out.print("\n");
        System.out.print("[");
        print(intervals,N2,N);
        System.out.print("]");
        int count = intervals.length;
        for (int i = 0; i < intervals.length - 1; i++) {
            int[] s1 = intervals[i];
            for (int j = i + 1; j < intervals.length; j++) {
                int[] s2 = intervals[j];
                if (s1[0] <= s2[1] && s2[0] <= s1[1]) {
                    s2[0] = Math.min(s1[0], s2[0]);
                    s2[1] = Math.max(s1[1], s2[1]);
                    s1[0] = -1;
                    count--;
                    break;
                }
            }
        }
        int[][] ans = new int[count][];
        int index = 0;
        for (int[] itv: intervals) {
            if (itv[0] >= 0) ans[index++] = itv;
        }
        System.out.print("\n");
        System.out.print("[");
        print(ans,N2,count);
        System.out.print("]");
    }
    
}
