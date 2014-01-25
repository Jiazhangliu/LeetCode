public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        // http://cs.lmu.edu/~ray/notes/binarytrees/
        if(n == 0 || n == 1 || n == 2)
            return n;
        int results=2;
        for(int i=3; i<=n; i++)
            results=results*2*(2*i-1)/(i+1);
        return results;
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
    	UniqueBinarySearchTrees s = new UniqueBinarySearchTrees();
    	int integer = 3;
    	
    	System.out.println(s.numTrees(integer));
    }
}
