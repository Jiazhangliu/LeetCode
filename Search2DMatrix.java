public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        
        int row = 0;
        boolean result = false;
        if(matrix.length == 1){
            row = 0;
        }
        else{
            for(int i = 0; i < matrix.length; i++){
                if(matrix[i][matrix[0].length-1] == target || matrix[i][matrix[0].length-1] > target){
                     row = i;
                     break;
                }else{
                    continue;
                }
            }
        }
        
        for(int i = 0; i < matrix[0].length; i++){
        	System.err.println(matrix[row][i]);
            if(matrix[row][i] == target)
                result = true;
        }
        
        return result;
    }
}
