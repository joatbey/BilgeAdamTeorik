package com.dorukbiyikli;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		// Multi-threading
		// Multi-threading applicationlarda ArrayListler safe kabul edilmez.
		// Multi-threading uygulamalarda ArrayList yerine Vector kullanılmalıdır.
		// Vector sınıfı thread-safe bir sınıfır.
		// Vectorlerin dezavantajı ArrayListe göre daha yavaş çalışmalarıdır.
		
		List<String> vector = new Vector<String>();
		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Aslan");
		vector.add("Kaplan");
		
		for(String s: vector) {
			System.out.println(s);
		}
		System.out.println("\n");
		
		// Iterator kullanımı: 
		ListIterator<String> iterator = vector.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
