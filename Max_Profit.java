import java.util.HashMap;

public class Max_Profit {

    public int maxProfit(int[] prices) {
       int profit = 0;
       int local = 0;
        if(prices==null || prices.length==0)
            return 0;

        for(int i = 0; i< prices.length - 2; i++){
            local = Math.max(local + prices[i + 2]-prices[i],0);
            profit = Math.max(local,profit);
        }
       return profit;
    }

    public static void main(String []args) {

        Max_Profit result = new Max_Profit();
        int[] input = {9,10,12,8,4,2};
        System.out.println(result.maxProfit(input));

    }
}
