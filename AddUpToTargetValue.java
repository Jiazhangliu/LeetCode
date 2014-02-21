import java.util.Hashtable;


public class AddUpToTargetValue {

	boolean addUp (int[] array, int target){
		Hashtable<Integer, Integer> t = new Hashtable<Integer, Integer>();
		boolean found = false;
		for(int i = 0; i < array.length; i++){
			if(!t.containsKey(array[i]))
				t.put(array[i], 1);
			else{
				t.put(array[i],t.get(array[i])+1);
			}
		}
		
		for(int i = 0; i < array.length; i++){
			if(t.containsKey(target - array[i])){
				found = true;
				break;
			}	
		}
		
		return found;
	}
	
	public static void main(String args[]){
		int[] array = {1,-3,2,-5,4,6,9,7,8};
		
		AddUpToTargetValue attv = new AddUpToTargetValue();
		
		System.err.println(attv.addUp(array, 30));
		
		System.err.println(attv.addUp(array, 6));
	}
	
}

