class Solution {
    public int minimumRounds(int[] tasks) {
        /*
        can complete 2-3 tasks of same difficulty - min 2 tasks with max 3 -> we can't have 1 task left in the array
        return the MIN number of rounds it takes to complete the task within the array
        
        [2,2,3,3,2,4,4,4,4,4]
        2,2,2
        3,3
        4,4,4
        4,4
        
        []
        
        [2,3,3]
        can't complete it because there's one task of level 2 -> can do 2-3 tasks of the SAME difficulty
        
        cases:
        [2]
        []
        if there is only one type of level for that task, not possible to complete tasks
        
        track all of the different levels in the array -> not in order so smaller leveled tasks can be in beginning, middle, or end
        how to divide the tasks - 2-3 at a time one can't be left over
        counter to track the num of times we see that difficulty level - when the counter reaches 3 -> counts as one round
        
        using a hashmap
        
        3 conditions to think about
        count of numbers divisible by 3
        count mod 3 with 1 left over
        count mod 3 with two left over
        
        create a hashmap 
        for every int within the array
            put the elements into the map with default plus 1
            

        create a variable for the round
        
        get the number of counts from the map
        
            if the count is equal to 1
                return -1
            else if count is divisible by 3
                round += count / 3
            else 
                round += count / 3 + 1
                
        return round
        
        
        */
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: tasks){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int round = 0;
        
        //count will represent frequency
        for(int count: map.values()){
            
            if(count == 1){
                return - 1;
            }
        
            else if(count % 3 == 0){
                round += count / 3; 
            }else{
                round += count / 3 + 1;
            }
        }
        
        return round; 
    }
}