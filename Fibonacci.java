
public class Fibonacci {
	
	int [] record;
	
	public Fibonacci(int n){
		record = new int[n];
		record[0] = 0;
		record[1] = 1;
	}
	
	public int fibonacci(int n){
		if(n < 0) return -1;
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	public int fibonacciWithMemorization(int n){
		if(n < 0) return -1;
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		
		if(record[n-1] == 0){
			record[n-1] = fibonacciWithMemorization(n-1);
		}
		
		if(record[n-2] == 0){
			record[n-2] = fibonacciWithMemorization(n-2);
		}
		
		return record[n-1] + record[n-2];
	}
	
	public static void main(String [] args){
		final int N = 100;
		Fibonacci f = new Fibonacci(N);
		for(int i = 0; i <= N; i++)
			System.err.print(f.fibonacci(i)+" ");
		
		System.err.println();
		
		for(int i = 0; i <= N; i++)
			System.err.print(f.fibonacciWithMemorization(i)+" ");
	}
	
}

