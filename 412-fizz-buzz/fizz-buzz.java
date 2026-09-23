class Solution {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n]; 
        for(int i=0; i<n ; i++){
            if((i+1)%3==0 && (i+1)%5==0){
                answer[i] = "FizzBuzz";
            }
            else if ((i+1)%3 == 0){
                answer[i] = "Fizz";
            }
             else if ((i+1)%5 == 0){
                answer[i] = "Buzz";
            }
            else{
                answer[i] =String.valueOf(i+1);
            }
        }
    return Arrays.asList(answer);
   }
}