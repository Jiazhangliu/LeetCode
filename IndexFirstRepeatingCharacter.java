import java.util.Hashtable;

public class IndexFirstRepeatingCharacter {

	public int check(String s){
		int index = 0;

		Hashtable<Character, Integer> t = new Hashtable<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++){
			if(t.containsKey(s.charAt(i))){
				index = i;
				break;
			}else{
				t.put(s.charAt(i), 1);
			}
		}
		
		return index;
	}
	
	public static void main(String [] args){
		String s = "abcdefgayhgfc";
		
		IndexFirstRepeatingCharacter ifrc = new IndexFirstRepeatingCharacter();
		int num;
		System.err.println(num = ifrc.check(s));
		System.err.println(s.charAt(num));
	}
	
	
}

