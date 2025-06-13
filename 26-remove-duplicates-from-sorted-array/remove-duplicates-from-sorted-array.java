class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        NOTES
        - remove duplicates from an array
        - array is in non-decreasing order (ascending)
        - array should return with the first elements containing the numbers

        APPROACH
        - create one variable to hold initial value to check if there are dupicates
        - create 2 pointers
            - one pointer scans for replacements
            - one pointer acts as a place holder
         */

        

        int scanner = 1;
        int placeHolder = 0;

        while(scanner < nums.length){
            if (nums[scanner] != nums[placeHolder]){
                placeHolder++;
                nums[placeHolder] = nums[scanner];
                scanner++;

            } else {
                scanner++;
            }
        }
        return placeHolder + 1;
    }
}