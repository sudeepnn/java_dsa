public class best_time_to_sell_stock {
    public static int maxProfit(int[] prices) {
       
       //this soution is soved in O[n^2] but the solution should be in O[n]
        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(-prices[i]+prices[j]>max)
        //             max=-prices[i]+prices[j];
        //     }
        // }
        // return max;


        // solution in O[n]
        int maxprofit=0;
        int minsofar=prices[0];
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(prices[i],minsofar);
            int profit=prices[i]-minsofar;
            maxprofit=Math.max(maxprofit, profit);
        }
        return maxprofit;
        
    }

    public static void main(String[] args) {
        int ar[]={5,2,6,1,4};
        int ans=maxProfit(ar);
        System.out.println(ans);
    }
    
}
