class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 ){
            return false;
        } else if (x == 0) {
            return true;
        }
        int reversed = 0;
        int xHolder = x;
        
        while ( xHolder > 0) {
            int nextNum = xHolder % 10;
            
            reversed *= 10;
            
            reversed += nextNum;
            
            xHolder /= 10;
        }
        
        return (x == reversed);
    }
}