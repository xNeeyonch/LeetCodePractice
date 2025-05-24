class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        /*
        NOTES ON PROBLEM
        RETURN TRUE if any element in nums array appears at least twice
        RETURN FALSE if not 
         */
        
        /*
        APPROACH TO PROBLEM
        - make a hashset that contains all the elements in nums
        - before you add an element, check if it  already exists, 
            if it does then return true (found duplicate)
         */
        
        Set<Integer> listOfNums = new HashSet<>();
        
        for (Integer currNum : nums){
            if (listOfNums.contains(currNum)){
                return true;
            }
            listOfNums.add(currNum);
        }
        
        return false;
        
    }
}