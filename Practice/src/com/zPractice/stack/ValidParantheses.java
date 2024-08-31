package com.zPractice.stack;

import java.util.Stack;

public class ValidParantheses {
	public static void main(String[] args) {
		String s = "([])";
		boolean res  = validateParanthese(s);
		System.out.println("String " + s + " is valid = " + res);
	}

	private static boolean validateParanthese(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			if(stack.isEmpty() && ( s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']' )) {
				return false;
			}else {
				if(s.charAt(i) == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					}else {
						return false;
					}
				}else if(s.charAt(i) == '}') {
					if(stack.peek() == '{') {
						stack.pop();
					}else {
						return false;
					}
				}else if(s.charAt(i) == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					}else {
						return false;
					}
				}else {
					stack.push(s.charAt(i));
				}
			}
		}
		if(stack.isEmpty())
			return true;
		
		return false;
	}
}
