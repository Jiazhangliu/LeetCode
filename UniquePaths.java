public class UniquePaths {
	int [][] array;
    public int uniquePaths(int m, int n) {
    	array = new int[m+1][n+1];
        return check(m,n);
    }
    
    public int check(int m, int n){
    	if(m < 1 || n < 1) {return 0;}
        if(m == 1 && n == 1) {return 1;}
        
        return value(m-1,n) + value(m,n-1);
    }
    
    public int value(int m, int n){
    	if(array[m][n] == 0){
    		return array[m][n] = check(m,n);
    	}else{
    		return array[m][n];
    	}
    }

    public static void main(String args[]){
    	UniquePaths s = new UniquePaths();
    	System.err.println(s.uniquePaths(25, 4));

    }
}

