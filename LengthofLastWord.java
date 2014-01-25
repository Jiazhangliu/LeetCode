public class LengthofLastWord  {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }

        boolean result = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                result = false;
                break;
            }
        }
        if(result){
            return 0;
        }
        
        String newS = s;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                newS = s.substring(0,i);
            }else{
                break;
            }
        }
        
        int counter = 0;
        for(int i = newS.length()-1; i>=0; i--){
            if(newS.charAt(i) != ' '){
                counter++;
            }else{
                break;
            }
        }
        
        return counter;
    }
}
