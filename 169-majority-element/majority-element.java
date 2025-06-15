class Solution {
    public int majorityElement(int[] nums) {
        /*
        NOTES
        - given an array, return the majority element
        - the majority element is the element that shows up at least more than half of the array

        APPROACH
        - create 2 pointers
        - the right pointer checks for duplicates
        - the left pointer stays in place until the right pointer finds
        an element that is not equal to the left pointer

        - create an counter to see if one element is the majority and compare it to nums.length/2

        APPROACH #2 
         */

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (!map.containsKey(num)){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > nums.length / 2){
                return num;
            }
        }

        return 0;
    }
}