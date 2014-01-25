import java.util.Arrays;

public class MergeSortedArray {
	static int A[] = {1,3,5,0,0,0};
	static int B[] = {2,4,6};
    public void merge(int A[], int m, int B[], int n) {
        if(A.length == 0){ A = B; }
        if(B.length == 0){ return; }
        
        Arrays.copyOf(A, m+n); 
        int k = 0;
        for(int i = m; i < m+n; i++){
            A[i] = B[k];
            k++;
        }
        
        Arrays.sort(A); 
    }

    public static void main(String args[]){
    	MergeSortedArray s = new MergeSortedArray();
    	
    	s.merge(A,3,B,3);
    	
    	for(int i = 0; i < 6;i++){
    		System.out.println(A[i]);
    	}
    }
}

