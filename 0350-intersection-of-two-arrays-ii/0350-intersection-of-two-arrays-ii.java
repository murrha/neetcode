class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        /*
        repeating elements are fine, must appear as many times as it is shown
        any order is ok
        
        intersection of two arrays I
        create two hashsets, add the values, retained all that matched, created a new array of hashset size, then filled it in, and returned it
        
        binary search
        start with middle, move right else move left if one of the arrays has a smaller size than the other 
        
        */
        
        Arrays.sort(nums1);
        Arrays.sort(nums2); 
        
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = 0;
        
        while(true){
            
            //when both arrays are of different length and we are done with one of them
            if(top >= nums1.length || bottom >= nums2.length){
                break;
            }
            if(nums1[top] == nums2[bottom]){
                list.add(nums1[top]);
                top++;
                bottom++;
            }else if(nums1[top] < nums2[bottom]){
                top++;
            } else if(nums1[top] > nums2[bottom]){
                bottom++; 
            }
        }
    
        int[] array = new int[list.size()];
        int j = 0;
        for(Integer i: list){
            array[j++] = i;
        }
        
        return array; 
    }
}