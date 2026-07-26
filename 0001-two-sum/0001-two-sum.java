class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> found = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int complete = target - nums[i];
            if(found.containsKey(complete))
            {
                return new int[]{found.get(complete) , i};           
            }
            found.put(nums[i], i);   
       } 
        return new int[]{};
    }
}