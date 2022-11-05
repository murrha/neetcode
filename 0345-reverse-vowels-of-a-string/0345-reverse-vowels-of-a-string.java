class Solution {

    private boolean checkVowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E'|| c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }//end checkVowel

    private void swap(char[] cArray, int a, int b){
        char temp = cArray[a];
        cArray[a] = cArray[b];
        cArray[b] = temp;
    }

    public String reverseVowels(String s) {

        /* 
        string can be in lowercase and uppercase letters
        reverse the placement of the vowels PRESENT within the string 

        for the second example, there are 3 e's and 1 o
        the first and the last e switch while the final e swaps with o

        return the string as is
        time complexity: O(N)
        space complexity: O(N)

        edge case: if the string has only 1 vowel we can return it

        two pointer approach -> swap the vowels based on their locations
        one at the start and other at the end

        while start and end don't equal to each other
            if start is a vowel and end is a vowel
                swap the placements
                increment start
                increment end
        endwhile

        return the string 
        */
        
        int start = 0;
        int end  = s.length() - 1; 

        char[] array = s.toCharArray(); 

        while(start < end){

            //searches the lefthand side
            while(start < s.length() && !checkVowel(array[start])){
                start++;
            }

            //searches the righthand side
            while(end >= 0 && !checkVowel(array[end])){
                end--;
            }

            if(start < end){
                swap(array, start++, end--); 
            }

        }//end while

        return new String(array); 
    }//end reverse vowels
}