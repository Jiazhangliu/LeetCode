public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        int index = A.length;
        for(int i = 0; i < A.length; i++){
            if(A[i] == target){
                index = i;
                break;
            }else if(A[i] > target){
                
                index = i;
                break;
            }
        }
        return index;
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
    	SearchInsertPosition s = new SearchInsertPosition();
    	int array[] = {1,2,3,4,5};
    	int target = 3;
    	
    	System.out.println(s.searchInsert(array,target));
    }
}

