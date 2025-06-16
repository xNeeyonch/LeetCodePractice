class Solution {
    public int maxProfit(int[] prices) {
        int leftPointer = 0;
        int rightPointer = 1;
        int highestMargin = 0;
        
        while (rightPointer < prices.length){
            if (prices[rightPointer] < prices[leftPointer]){
                leftPointer = rightPointer;
                rightPointer++;
            } else {
                if (prices[rightPointer] - prices[leftPointer] > highestMargin){
                    highestMargin = prices[rightPointer] - prices[leftPointer];
                    rightPointer++;
                } else {
                    rightPointer++;
                }
            }
        }
        return highestMargin;
    }
}