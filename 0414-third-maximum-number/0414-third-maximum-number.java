class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> sortedSet = new TreeSet<Integer>();
        
        for(int el : nums){
            sortedSet.add(el);
        }
        
        // tree set has unique ascending elements
        int sortedSetLen = sortedSet.size();
        if(sortedSetLen < 3){
            return getSetEl(sortedSet,sortedSetLen-1);
        }else{
            return getSetEl(sortedSet,sortedSetLen-3);
        }
        
        
    }
    
    private int getSetEl(Set sortedSet, int index){
        int count = 0;
        Iterator<Integer> it = sortedSet.iterator();
        while(it.hasNext()){
            Integer el = it.next();
            if(count == index){
                return el.intValue();
            }
            count++;
        }
        return -1;
    }
}