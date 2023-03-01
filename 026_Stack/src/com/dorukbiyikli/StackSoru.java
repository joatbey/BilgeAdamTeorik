package com.dorukbiyikli;

import java.util.Stack;

public class StackSoru {

	public static boolean isValid(String s) {
	
		Stack<Character> solParantezStack = new Stack<Character>(); // sol parantezleri tutacağım bir stack ama character tutsun string değil.
		
		// loop the string s
		for(int i = 0 ; i < s.length(); i++) {
			char c = s.charAt(i);
			if( c == '(' || c=='{' || c=='[' ) {	// characterleri equalsla değil == ile kontrol ediyoruz
			
				solParantezStack.push(c);
			}
			else if( c== ')' && !solParantezStack.isEmpty() && solParantezStack.peek() == '(' ) {
				solParantezStack.pop();
			}

			else if( c== '}' && !solParantezStack.isEmpty() && solParantezStack.peek() == '{' ) {
				solParantezStack.pop();
			}

			else if( c== ']' && !solParantezStack.isEmpty() && solParantezStack.peek() == '[' ) {
				solParantezStack.pop();
			}
			else {
				return false;
				
			}
		}
		
		return solParantezStack.isEmpty(); // true donup bırakamayız çünkü mesela [((((() olursa push ede ede sol parantezleri gittik . sağ parantezi gördü girdi ilk else ife . olup bitti mi ? bitmedi. empty mi değil mi kontrol etmemiz lazım.
 	}
	
	public static void main(String[] args) {
		
		System.out.println( isValid("((())))") );	// false
		System.out.println( isValid("(((())))") );	// true
		System.out.println( isValid("{[()]}"));		// true
		System.out.println( isValid("(){}[]")); 	// true
		
	}
	// Düzgün Parantezler Problemi 
	/* 
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. Constraints : s consists of parentheses only
	 * '()[]{}'.
	 * 
	 * Example 1: Input: s = "()" Output: true
	 * 
	 * Example 2: Input: s = "()[]{}" Output: true
	 * 
	 * Example 3: Input: s = "(]" Output: false
	 * 
	 * Example 4: Input: s = "([)]" Output: false
	 * 
	 * Example 5: Input: s = "{[]}" Output: true
	 * 
	 * Note: In this question, we need to deal with only 6 symbols — (, ), {, }, [,].
	 *  We will be given a string containing only these symbols.
	 */				
	
}
