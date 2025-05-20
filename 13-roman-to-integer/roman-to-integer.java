class Solution {
    public int romanToInt(String s) {

        //first make a hashmap of the roman numeral letter corresponding to the value
        HashMap<Character, Integer> romanNumeralToNumber = new HashMap<>();

        romanNumeralToNumber.put('I', 1);
        romanNumeralToNumber.put('V', 5);
        romanNumeralToNumber.put('X', 10);
        romanNumeralToNumber.put('L', 50);
        romanNumeralToNumber.put('C', 100);
        romanNumeralToNumber.put('D', 500);
        romanNumeralToNumber.put('M', 1000);

        //start from the back of the roman numeral value to get the starting addend

        int result = romanNumeralToNumber.get(s.charAt(s.length()-1));
        
        //start at the 2nd to last index since we already started on the last index

        for (int i = s.length() - 2;i >= 0; i--) {
            
            //check if the value pair is less than the previous, 
            //if it is then subtract it from the current result
            //if it is not then add it to current result
            if (romanNumeralToNumber.get(s.charAt(i)) < romanNumeralToNumber.get(s.charAt(i+1))){
                result -= romanNumeralToNumber.get(s.charAt(i));
            } else { 
                result += romanNumeralToNumber.get(s.charAt(i));
            }
        }
        return result;
    }
}