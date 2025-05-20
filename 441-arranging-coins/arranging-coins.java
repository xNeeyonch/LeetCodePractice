class Solution {
    public int arrangeCoins(int n) {
        
        int stairCounter = 0;

        for (int i = 1; i <= n; i++) {
            n -= i;
            stairCounter++;
        }
        
        return stairCounter;
    }
}