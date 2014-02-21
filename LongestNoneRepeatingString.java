
public class LongestNoneRepeatingString {

	public final int ASCII = 26;
	
	public int check(String s){
		if(s.length() == 0) {return 0;}
		if(s.length() == 1) {return 1;}
		
		
		int[] lastPosition = new int[ASCII];
		int start = 0;
		
		for(int i = 0; i < ASCII; i++){
			lastPosition[i] = -1;
		}
		
		int length = 0;
		for(int i = 0; i < s.length(); i++){
			if(lastPosition[s.charAt(i)-'a'] >= start){
				length = Math.max(length, i-start);
				start = lastPosition[s.charAt(i) - 'a'] + 1;
			}
			lastPosition[s.charAt(i) - 'a'] = i;
		}
		
		return Math.max((int)s.length() - start, length);
	}
	
	public static void main(String args[]){
		String s = "asgsjkdsadasdhdjg";
		
		LongestNoneRepeatingString lnps = new LongestNoneRepeatingString();
		
		System.err.println(lnps.check(s));
	}
	
}

