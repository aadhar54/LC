class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ansSet = new HashSet<>();
        
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i =0,j = 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                ansSet.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        List<Integer> ansList = new ArrayList<>(ansSet);
        return ansList.stream().mapToInt(Integer::intValue).toArray();
        
    }
}