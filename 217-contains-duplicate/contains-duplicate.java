class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> f = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            f.put(nums[i],f.getOrDefault(nums[i],0)+1);
        }
        for(int i=0; i<nums.length;i++){
            if(f.getOrDefault(nums[i],0) != 1){
                return true;
            }
        }
        
            
       return false;
    }
}