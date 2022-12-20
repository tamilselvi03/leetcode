class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>twosum=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
              if(twosum.containsKey(target-nums[i]))
             
                  return new int[]{i,twosum.get(target-nums[i])};
                  twosum.put(nums[i],i);
              }
              return null;
        
        
        
    }
}
