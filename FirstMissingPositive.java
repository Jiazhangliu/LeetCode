import java.util.Arrays;
public class FirstMissingPositive {
    public int firstMissingPositive(int[] A) {
        if(A.length == 0){
            return 1;
        }
        if(A.length == 1){
            if(A[0] <= 0)
                return 1;
            else{
                if(A[0] > 1)
                    return 1;
                else
                    return A[0]+1;
            }
        }
        
        Arrays.sort(A);
        int index = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] <= 0){
                continue;
            }else{
                index = i;
                break;
            }
        }
        
        if(A[index] >1)
            return 1;
        
        int result = 0;
        for(int i = index; i < A.length; i++){
            if(i == A.length-1){
                result = A[i]+1;
                break;
            }
            if(A[i+1]-A[i] == 1 || A[i+1]-A[i] == 0){
                continue;
            }else{
                result = A[i]+1;
                break;
            }
        }
        return result;
    }
}
