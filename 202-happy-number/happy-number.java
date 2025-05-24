class Solution {
    public boolean isHappy(int n) {

        /*
        - separate n into its digits
        - raise them to the power of 2 then add them
        - RETURN TRUE IF the sum of the numbers is 1
        - if not then continue the cycle until it reaches 1
        - sum cannot be repeating ( store in list to check list if it exists)
        - if found current sum in list, return false
        */
        
        //first create the list
        List<Integer> listOfSum = new ArrayList<>();
        
        //create a while infinite while loop so that it 
        //returns either true or false
        while (true){

            int sum = 0;

            //a while loop to seperate the digits of n and 
            //square them then add them to the sum
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }

            
            if (sum == 1){
                return true;
            }

            //make n equal the new sum 
            n = sum;

            if (listOfSum.contains(n)){
                return false;
            }
            listOfSum.add(n);

        }
    }
    
}