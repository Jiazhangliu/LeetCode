public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.equals("")) {return true;}
        if(s.length() == 1) {return true;}
        
        int i = 0; 
        int j = s.length() - 1;
        while (i < j) {
            if(!ischar(s.charAt(i))) {
                i++;
                continue;
            }
            if (!ischar(s.charAt(j))){
                j--;
                continue;
            }
            
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }else{
            	i++;
            	j--;
            }
        }
        
        return true;
    }
    
    public boolean ischar(char s){
        return ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z') || (s >= '0' && s <= '9'));
    }
}
