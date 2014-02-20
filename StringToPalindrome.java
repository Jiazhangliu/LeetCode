import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * Check if a string can be changed into a palindrome.
 */
public class StringToPalindrome {
	public String change(String s){ 
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++){
			if(m.containsKey(s.charAt(i))){
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}else{
				m.put(s.charAt(i), 1);
			}
		}
		
		int counter = 0;
		String result = "";
		Character c = null;
		Set<Character> l = m.keySet();
		Character [] a = new Character[l.size()];
		l.toArray(a);
		for(int i = 0; i < l.size(); i++){
			if(m.get(a[i]) % 2 == 1){
				counter += 1;
				c = a[i];
				if(counter == 2){
					return "-1";
				}
			}else{
				for(int j = 0; j< m.get(a[i])/2; j++){
					result = a[i] + result;
				}
				for(int j = m.get(a[i])/2; j< m.get(a[i]); j++){
					result = result + a[i];
				}
			}
		}
		
		String odd = "";
		if(c != null){
			for(int i = 0; i < m.get(c); i++){
				odd += c;
			}
		}
		
		result = result.substring(0, result.length()/2) + odd + result.substring(result.length()/2, result.length());
		
		return result;
	}
	
	public static void main(String args[]){
		String s = "hahal";
		StringToPalindrome stp = new StringToPalindrome();
		
		System.err.println(stp.change(s));
	}
}

