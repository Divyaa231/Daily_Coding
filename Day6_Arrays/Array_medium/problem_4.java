package Day6_Arrays.Array_medium;

public class problem_4 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < i;j++){
                int profit = prices[i] - prices[j];
                
                if(profit>=maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }

public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
