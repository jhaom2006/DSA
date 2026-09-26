class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> have= new HashMap<>();
        HashMap <Character,Integer> need= new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            have.put(c,have.getOrDefault(c,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
        for( Map.Entry<Character, Integer> i : have.entrySet()){
            char c = i.getKey();
            int fneed = i.getValue();
            int fhave = need.getOrDefault(c, 0);
            if(fhave<fneed)
                return false;
        }
        return true;
    }
}