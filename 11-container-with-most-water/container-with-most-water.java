class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int mostWater = 0;
        
        
        while (leftPointer < rightPointer){
            if (height[leftPointer] < height[rightPointer]){
                mostWater = Math.max(mostWater, height[leftPointer] * (rightPointer - leftPointer));
                leftPointer++;
            } else {
                mostWater = Math.max(mostWater, height[rightPointer] * (rightPointer - leftPointer));
                rightPointer--; 
            }
        }
        return mostWater;
    }
}