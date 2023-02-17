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
		System.out.println();
		
		//Örnek2:
		
		String name = ""; // şimdi name = isim diyorum ki name değişkenine alabileyim for döngüsündeki isim değerini baştan initialize ediyorum
		String[] isimlerDizi= { "Ali" , "Veli", "Osman","Zeynep"};
		for(String isim : isimlerDizi) {
			System.out.println(isim);
			name = isim;
		}
		
		//Scope'a dikkat
		//System.out.println(isim); // isim cannot be resolved to a variable
		
		//dikkat2
//		int z ;
//		int y = z*2; // initialize edilmedi z bunun hatalı olduğunu görebilmelisiniz... int z = 0 , String name = "" gibi de olsa initialize edilmeli
//		
		
		
		
	}
}
