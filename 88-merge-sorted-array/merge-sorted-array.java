class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        NOTES
        - have to merge array 1 and array 2 into one array in ascending order
        - will merge into array 1
        - array 1 already has sum of both array lengths of values != 0 
        APPROACH
        - have 3 pointers in order to manipulate the elements inside array 1 
            - pointer a pointing to n+m -1 
            - pointer b pointing to m-1
            - pointer c pointing to n-1 
         */
        int pointerA = n + m - 1;
        int pointerB = m - 1;
        int pointerC = n - 1;
        
        while(pointerB >= 0 && pointerC >= 0){
            if (nums1[pointerB] > nums2[pointerC]){
                nums1[pointerA] = nums1[pointerB];
                pointerB--;
                pointerA--;
            } else {
                nums1[pointerA] = nums2[pointerC];
                pointerC--;
                pointerA--;
            }
        }
        
        while (pointerC >= 0){
            nums1[pointerA] = nums2[pointerC];
            pointerC--;
            pointerA--;
        }
    }
}