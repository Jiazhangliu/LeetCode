import java.math.BigInteger;

public class MultiplyStrings  {
    public String multiply(String num1, String num2) {
        if(num1.equals("")) {return "";}
        if(num2.equals("")) {return "";}
        
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        
        BigInteger b3 = b1.multiply(b2);
        
        return b3+"";
    }
}
