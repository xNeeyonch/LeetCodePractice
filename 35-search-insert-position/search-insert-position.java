class Solution {
    public int searchInsert(int[] nums, int target) {


        /*
        KEY POINTS
        - given an array and a target, return the index of the the element that matches with the
        target
        - if there is no match, then return the index where the target would have been

        APPROACH
        - binary search
        - create 2 pointers
            - one on the left (lowest index) and one on the right (highest index)
        - check is the target is greater than or less than the index of half the length
        of the array
            - if equals the index value, then return the index
            - if it is less than index value, move the right pointer one less than the
            index you checked
            - if it is more than index value, move the left pointer one more than the
            index you checked
        - the left pointer will always be the answer if the target is not in the array
            - if the target is in between indexes then since the right pointer
            is always moving to the left if the index value is less than the target
            then the index of the left pointer is the answer
            - if the 
         */
        
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        
        while(leftPointer <= rightPointer){
            int middleIndex = (rightPointer + leftPointer) / 2;
            if (nums[middleIndex] == target){
                return middleIndex;
            } else if (nums[middleIndex] < target) {
                leftPointer = middleIndex + 1;
            } else if (nums[middleIndex] > target) {
                rightPointer = middleIndex - 1;
            }
        }
        return leftPointer;
        /*
        THOUGHTS
        
        at first I was confused on how I was supposed to portray a index greater than the 
        array length, but I realized that since I am using pointers, I don't need the actual
        index to be in the array. So if the target is greater than all the values in the array,
        the logic will check the value of the last index and move the left pointer one more over
        and since it is now greater than the right pointer it stops the while loop and now we 
        just return the left pointer.
         */
    }
}