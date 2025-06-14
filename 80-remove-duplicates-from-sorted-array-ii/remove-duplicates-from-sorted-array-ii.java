class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        NOTES
        - remove duplicates from an array, but allow at most 2 suplicates of a
        unique element
        - array is in non-decreasing order (ascending)
        - array should return with the first elements containing the numbers
        APPROACH
        - do the same thing for remove duplicate
        - have 2 pointers
        - one scanner and one placeHolder
        - check if scanner is equal to placeholder index - 2 to check if there are two duplicate of it already
        - if there is then just increment scanner by 1

         */
        
        int scanner = 2;
        int placeHolder = 2;
        if (nums.length < 3){
            return nums.length;
        }
        
        while (scanner < nums.length){
            if (nums[scanner] != nums[placeHolder - 2]){
                
                nums[placeHolder] = nums[scanner];
                placeHolder++;
            } 
            scanner++;
            
        }
        return placeHolder;
    }
}