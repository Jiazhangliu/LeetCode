
import java.math.BigInteger;
public class PlusOne {
    public int[] plusOne(int[] digits) {
        String s = "";
        for(int i = 0; i<digits.length; i++){
            s+=digits[i];
        }
        
        BigInteger number = new BigInteger(s);
        BigInteger numberPlusOne = number.add(new BigInteger("1"));
        
        String result = numberPlusOne+"";
        
        int [] value = new int[digits.length];;
        if(result.length() == s.length()+1)
            value = new int[digits.length+1];
            
        for(int i = 0; i < result.length(); i++){
            value[i] = Character.getNumericValue(result.charAt(i));
        }
        
        return value;
    }
}
