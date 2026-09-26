class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> f = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            f.put(nums[i],f.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length;
        for(int i=0; i<nums.length;i++){
            if(f.getOrDefault(nums[i],0) > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}