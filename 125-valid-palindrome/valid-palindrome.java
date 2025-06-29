class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }

        s = s.toLowerCase();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer <= rightPointer){
            char start = s.charAt(leftPointer);
            char end = s.charAt(rightPointer);

            if (!Character.isLetterOrDigit(start)){
                leftPointer++;
            } else if (!Character.isLetterOrDigit(end)) {
                rightPointer--;
            } else {
                if (start != end){
                    return false;
                }
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
    
}