https://leetcode.com/problems/maximum-subarray/submissions/

lass Solution {
    public int maxProfit(int[] prices) 
    {
        int pro=0;int sell=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
                sell=prices[i];
            }
            if(sell<prices[i])
            {
                sell=prices[i];
            }
            if(pro<sell-buy)
            {
                pro=sell-buy;
            }
            
        }
        return pro;
        
    }
}
