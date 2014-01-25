public class rotateImage {
    public void rotate(int[][] matrix) {
        rot(matrix);
        for(int i = 0; i < matrix.length; i++){
            reverse(matrix[i]);
        }
    }
    
    public void reverse(int[] A){
        for(int i = 0; i < A.length/2; i++){
            int temp = A[A.length-i-1];
            A[A.length-i-1] = A[i];
            A[i] = temp;
        }
    }
    
    public void rot(int[][] A){
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A[0].length; j++){
                if(i == j){
                    continue;
                }else{
                    int temp = A[j][i];
                    A[j][i] = A[i][j];
                    A[i][j] = temp;
                }
            }
        }
    }
}
