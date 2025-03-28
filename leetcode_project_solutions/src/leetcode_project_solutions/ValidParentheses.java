package leetcode_project_solutions;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "{([])}()";
		ValidParentheses v = new ValidParentheses();
		System.out.println(v.isValid(s));

	}

	public boolean isValid(String s) {

		HashMap<Character, Character> mappedBrackets = new HashMap<>();

		mappedBrackets.put(')', '(');
		mappedBrackets.put('}', '{');
		mappedBrackets.put(']', '[');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (!mappedBrackets.containsKey(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char topElement = stack.pop();
				if (topElement != mappedBrackets.get(c)) {
					return false;
				}    /*
					 * if(topElement == mappedBrackets.get(c)){ continue; } 
					 * else{ return false; }
					 */
			}
		}

		return stack.isEmpty();
	}

}
