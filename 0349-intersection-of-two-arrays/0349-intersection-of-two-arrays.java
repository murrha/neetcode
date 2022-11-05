class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        /* 
        if the number repeats, just place it once -> uniqueness
        is it possible to have an intersection with more than 2 numbers?
        can't be a set of same numbers -> ordered together
        
        edge case: no intersection

        time complexity: O(m + n) -> the arrays maybe of difference sizes
        space complexity: O(m + n) -> different sizes
        */

        HashSet<Integer> set1 = new HashSet<>();
        for(int i: nums1){
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for(int i: nums2){
            set2.add(i);
        }

        set1.retainAll(set2);

        int array[] = new int[set1.size()]; 
        int j = 0;
        for(int i: set1){
            array[j++] = i;
        }

        return array; 
    }
}