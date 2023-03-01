package com.dorukbiyikli;

import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
	
		// Stack metodu içinde synchronized methodlar bulunur
		Stack<String> stack = new Stack<String>();
		
		stack.add("Kedi");
		stack.push("Köpek"); // push da olur add yerine ...
		stack.add("Aslan");
		stack.add("Kus");
		
		for(String s: stack) {
			System.out.println(s);
		}
		
		//LIFO uygulanışı  ---------
		
		// Peek() : stack'e son giren elemanı getir(çıkarmadan ama yalnız göster) methodu,
		System.out.println(stack);
		System.out.println("****");
		System.out.println(stack.peek()); // son gireni gösteriyor.
		
		//Pop() : stack'e son giren elemanı çıkar methodu.
		System.out.println("\n pop -------- \n");
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		System.out.println("*******");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println("****");

		// isEmpty(): stack boş mu kontrolü
		System.out.println("Stack boş mu ? : " + stack.isEmpty());
		stack.pop();
		stack.pop();
		//stack.pop(); // boşken çağırınca  Exception in thread "main" 
		
		if(!stack.isEmpty())
			stack.pop();
				
}
}
