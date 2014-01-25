public class sortColors {
    public void sortColors(int[] A) {
        if(A.length == 0) {return;}
        if(A.length == 1) {return;}
        
        int zero = 0;
        int one = 0;
         int two = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0) {zero++;}
            else if (A[i] == 1) {one++;}
            else if(A[i] == 2) {two++;}
        }
        
        for(int i = 0; i < A.length; i++){
            if(i < zero) {A[i] = 0;}
            if(i < zero+one && i >= zero) {A[i] = 1;}
            if(i < zero+two+one && i >= zero+one) {A[i] = 2;}
        }
    }
}
