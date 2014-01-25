public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int l = 0;
        String longest = "";
        
        if(s.length() == 1){
            return 1;
        }
        
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(longest.contains(s.charAt(j)+"")){
                    length = Math.max(length,l);
                    longest = "";
                    l = 0;
                    break;
                }else{
                    longest+=s.charAt(j);
                    l++;
                }
            }
        }
        
        return length;
    }
}
