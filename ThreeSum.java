import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ThreeSum {
	ArrayList<ArrayList<Integer>> aa = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        Arrays.sort(numbers);

        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < numbers.length-1; i++){
            s.put(numbers[i]+numbers[i+1], i);
        }
        
        for(Integer a : numbers){
            if(s.containsKey(-1*a)){
            	if(a >= numbers[s.get(-1*a)]){
            		result.add(numbers[s.get(-1*a)]);
            		result.add(numbers[s.get(-1*a) + 1]);
            		result.add(a);
            	}else{
            		result.add(a);
            		result.add(numbers[s.get(-1*a)]);
            		result.add(numbers[s.get(-1*a) + 1]);
            	}
            	if(!aa.contains(result))
            		aa.add(result);
                result = new ArrayList<Integer>();
                s.remove(-1*a);
            }
        }
        
        return aa;
    }
    
    public static void main(String args[]){
    	ThreeSum s = new ThreeSum();
    	int[] numbers = {-1, 0, 1, 2, -1, -4};
    	System.err.println(s.threeSum(numbers));
    }
}

