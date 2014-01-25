public class ReverseInteger {
    public int reverse(int x) {
        String result = "";
        if(x < 10 && x > -10){
            return x;
        }
        
        result += x;
        String s = "";
        boolean isNegative = false;
        if(!isInteger(result.charAt(0)+"")){
            if(result.charAt(0) == '-')
                isNegative = true;
            for(int i = result.length()-1; i >= 1; i--){
                s+=result.charAt(i);
            }
        }else{
            for(int i = result.length()-1; i >= 0; i--){
                s+=result.charAt(i);
            }
        }
        
        int value = Integer.parseInt(s);
        if(isNegative)
            value = -1*Integer.parseInt(s);
        
        return value; 
    }
    
    public static boolean isInteger(String s) {
    	try { 
    		Integer.parseInt(s); 
    	} catch(NumberFormatException e) { 
    		return false; 
    	}
    	// only got here if we didn't return false
    	return true;
    }


    public static void main(String args[]){
    	ReverseInteger s = new ReverseInteger();
    	int integer = 123456;
    	
    	System.out.println(s.reverse(integer));
    }
}
