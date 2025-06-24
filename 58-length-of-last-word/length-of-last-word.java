class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfString = s.length()-1;

        while (lengthOfString >= 0 && s.charAt(lengthOfString) == ' '){
            lengthOfString--;
        }

        int lengthOfLastWord = 0;

        while (lengthOfString >= 0 && s.charAt(lengthOfString) != ' '){
            lengthOfLastWord++;
            lengthOfString--;
        }
        return lengthOfLastWord;
    }
}