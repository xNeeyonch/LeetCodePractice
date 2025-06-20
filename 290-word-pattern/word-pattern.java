class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");


        if (words.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currWord = words[i];
            char currLetter = pattern.charAt(i);

            if (!map.containsKey(currLetter)){
                if (!map.containsValue(currWord)){
                    map.put(currLetter, currWord);
                } else {
                    return false;
                }
            } else {
                if (!map.get(currLetter).equals(currWord)){
                    return false;
                }
            }
        }
        return true;
    }
}