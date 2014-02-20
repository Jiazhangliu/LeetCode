import java.util.ArrayList;
import java.util.List;

public class contiguousNumberAddToK {
	List<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> ll;
	 public List<ArrayList<Integer>> find(int [] input, int k){
	    	if(input.length == 0){
	    		return null;
	    	}
	    	
	    	for(int i = 0; i < input.length; i++){
	    		int result = 0;
	    		ll = new ArrayList<Integer>();
	    		for(int j = i; j < input.length; j++){
	    			result += input[j];
	    			ll.add(input[j]);
	    			if(result == k){
	    				l.add(ll);
	    				result = 0;
	    				ll = new ArrayList<Integer>();
	    				break;
	    			}
	    		}
	    	}
	    	return l;
	    }
	
	 public static void main(String args[]){
		 contiguousNumberAddToK s = new contiguousNumberAddToK();

	    	int [] input = {4, 3, 5, -3, -1, 2, -3, 10, 2};
	    	List<ArrayList<Integer>> list = s.find(input, 1);
	    	
	    	for(int i = 0; i < list.size(); i++){
	    		System.err.println(list.get(i));
	    	}
	    }
}

