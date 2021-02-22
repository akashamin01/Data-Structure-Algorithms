import java.util.*;

class BestTimeToBuyStocks{
    public static void main(String[] args){
      int prices[] = {7,0,5,3,9,4};
      // if( prices.length <= 1 )
  		int lowest = Integer.MAX_VALUE , maxprofit = 0; 
  		for(int i = 0 ; i < prices.length - 1 ; i++) {
  			if( prices[i] < lowest ) lowest = prices[i];
  			maxprofit = prices[i+1] - lowest > maxprofit ? prices[i+1] - lowest : maxprofit;
		}
		System.out.print( maxprofit);
    }
}