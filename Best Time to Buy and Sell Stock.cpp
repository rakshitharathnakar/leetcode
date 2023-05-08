class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int i=1,profit=0,min_prices=prices[0],n=prices.size();
        while(i<n){
            if(prices[i]<min_prices){
                min_prices=prices[i];
            }
            else{
                profit=max(profit,prices[i]-min_prices);
            }
            i++;
        }
        return profit;
    }
};
