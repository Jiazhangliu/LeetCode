import java.util.Arrays;

public class RemoveElelment {
    public int removeElement(int[] A, int elem) {
        int counter = 0;
        int index = 0;
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            if(A[i] == elem){
                index = i;
                counter++;
            }
        }

        int start = index + 1 - counter;
        
        for(int i = 1; i < A.length-index; i++){
            A[start] = A[index+i];
            start++;
        }
        int length = A.length;
        A = Arrays.copyOf(A,length-counter);

        return A.length;
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
    	RemoveElelment s = new RemoveElelment();
    	int array[] = {1,4,3,3,2,5};
    	int target = 3;
    	
    	for(int i = 0; i < array.length; i++){
    		System.out.print(array[i]+" ");
    	}   	
    	System.out.println();
    	int size = s.removeElement(array,target);
    	for(int i = 0; i < size; i++){
    		System.out.print(array[i]+" ");
    	}  
    }
}

