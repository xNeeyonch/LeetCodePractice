class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        /*
        NOTES
        - check if array has a duplicate of a number
        - the number of elements in between the two duplicates should be less
            than or equal to k

        APPROACH
        - insert all the elements in nums array into a hashmap where
        - the key will equal the element value and the value will be the index will be value
        - create a fori loop to insert each index into the hashmap
        - if the hashmap already contains the same key(value) then check if the value
            is greater than or equal to k
        - if this is true then return true
        - if false then replace the value(index) with the new index and repeat
        - if no solutions found then return false
         */

        HashMap<Integer, Integer> newNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!newNums.containsKey(nums[i])){
                newNums.put(nums[i], i);
            } else {
                
                int difference = Math.abs(newNums.get(nums[i]) - i);
                if (difference <= k){
                    return true;
                } else {
                    newNums.put(nums[i], i);
                }
            }
        }
        return false;

    }

}