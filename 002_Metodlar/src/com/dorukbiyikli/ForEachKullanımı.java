package com.dorukbiyikli;

public class ForEachKullanımı {

	public static void main(String[] args) {
		int[] dizi = { 1, 24, 35, 55, 78, 83, 39 };
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println();

		// for each döngüsü:
		// köşeli parantezler kullanmadan yapılır
		for ( int i : dizi) {
			System.out.print(i + " ");
		}
	}
}
