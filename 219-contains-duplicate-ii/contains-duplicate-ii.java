class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        /*
        NOTES 
        - check if array has a duplicate of a number
        - the number of elements in between the two duplicates should be less 
            than or equal to k 
            
        APPROACH
        - make 2 fori loops
        - increment the forj loop until j <= k
         */

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }

}