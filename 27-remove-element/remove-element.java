class Solution {
    public int removeElement(int[] nums, int val) {
        /*
        NOTES 
        - given array nums, remove all instances of value val in the array
        - use 2 pointers to manipulate the data in the array
            - one pointer will be used to check the current index of the array to see 
            if it is equal to val
            - the other will be the pointer looking for values to replace the other
        - return int of how many numbers are left after replacing val
         */
        
        int scanner = 0;
        int replaceNumber = 0;
        
        while (replaceNumber < nums.length){
            if (nums[replaceNumber] == val){
                replaceNumber++;
                
            } else {
                nums[scanner] = nums[replaceNumber];
                scanner++;
                replaceNumber++;
                
            }
        }
        return scanner;
    }
}