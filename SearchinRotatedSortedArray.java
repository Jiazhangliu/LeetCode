public class SearchinRotatedSortedArray  {
    public int search(int[] A, int target) {
        if(A.length == 0){
            return -1;
        }
        
        for(int i = 0; i < A.length; i++){
            if(A[i] == target){
                return i;
            }
        }
        
        return -1;
    }
}
