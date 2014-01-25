import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] A) {
        if(A.length == 1){
            return A[0];
        }    
        
        Arrays.sort(A);
        int single=A[A.length-1];
     
        for(int i=0;i<A.length-1;i=i+2){
            if(A[i]!=A[i+1]){
                single = A[i];
                break;
            }
        }
        return single;
    }
    
    public static void main(String args[]){
    	SingleNumber s = new SingleNumber();
    	int [] array = {1,1,2,2,3};
    	
    	System.out.println(s.singleNumber(array));
    }
}
