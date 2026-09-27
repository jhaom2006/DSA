class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> f = new HashMap<>();
       HashMap<Character,Integer> g = new HashMap<>();
       int n =s.length();
       int m =t.length();
       if(m !=n){
        return false;
       }
       for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            f.put(c,f.getOrDefault(c,0)+1);
       }
       for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            g.put(c,g.getOrDefault(c,0)+1);
       }
       return f.equals(g);
    }
}