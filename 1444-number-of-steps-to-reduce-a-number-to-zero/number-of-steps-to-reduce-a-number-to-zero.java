class Solution {
    public int numberOfSteps(int num) {
        int output=0;
         while(num >0){
            if(num%2 == 0){
                num = num/2;
                output++;
            }
            else{
                num --;
                output++;
            }
        }
        return output;
    }
}