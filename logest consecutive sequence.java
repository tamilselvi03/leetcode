class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet=new HashSet<Integer>();
        for(int num :nums){
            hashSet.add(num);
        }
        int ls=0;
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int currentNum=num;
                int cs=1;
                while(hashSet.contains(currentNum+1)){
                    currentNum+=1;
                    cs+=1;
                }
                ls=Math.max(ls,cs);
            }
        }
        return ls;
        
    }
}
