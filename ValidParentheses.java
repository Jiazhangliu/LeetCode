import java.util.Stack;
public class ValidParentheses  {
    public boolean isValid(String s) {
    	if(s.equals("")) {return true;}
    	if(s.length() % 2 == 1) {return false;}

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length()-1;){
        	if(s.charAt(i) == '('){
        		stack.push(s.charAt(i));
        	}else if(s.charAt(i) == '{'){
        		stack.push(s.charAt(i));
        	}else if(s.charAt(i) == '['){
        		stack.push(s.charAt(i));
        	}else{
        	    if(i == 0)
        		    return false;
        	}
        	
        	i++;
        	
        	if(s.charAt(i) == ')'){
        		if (stack.pop() != '('){
        			return false; 
        		}
        	}else if(s.charAt(i) == '}'){
        		if (stack.pop() != '{'){
        			return false;
        		}
        	}else if(s.charAt(i) == ']'){
        		if (stack.pop() != '['){
        			return false;
        		}
        	}
        }
        
        return stack.isEmpty();
    }
}
