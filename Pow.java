public class Pow {
    public double pow(double x, int n) {
        //return Math.pow(x,n);
        double result = 1.0;
        
        if(x == 1.0){
            return 1.0;
        }else if(x == -1.0){
            if(n%2 == 1)
                return -1.0;
            else
                return 1.0;
        }
        
        if(n == 0){
            return 1.0;
        }else if(n < 0){
            if(x != 0){
                for(int i = 0; i < Math.abs(n); i++){
                    result *= x;
                    if(result == 0 || result == 1)
                    break;
                }
                result = 1/result;
            }
        }else if (n > 0){
            for(int i = 0; i < n; i++){
                result *= x;
                if(result == 0 || result == 1)
                    break;
            }
        }
        return result;
    }
}
