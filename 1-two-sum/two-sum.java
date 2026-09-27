class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num;
        int [] r= new int[2];
        HashMap < Integer,Integer> h = new HashMap <>();
        for(int i=0 ; i< nums.length;i++){
            num = target - nums[i];
            if(h.containsKey(num)){
               return new int[] {h.get(num), i};
            }
             h.put(nums[i],i);
        }
        //for(int i=0; i<nums.length;i++){
            //num = target - nums[i];
            return r;
        }
    }
