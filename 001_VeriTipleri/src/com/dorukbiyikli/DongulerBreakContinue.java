package com.dorukbiyikli;

import java.util.Iterator;

public class DongulerBreakContinue {

	public static void main(String[] args) {
		// break
		//
		// döngünün akışını durdurur ve '}' sonundaki koda gider...

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break; // kır ve çık 
						// yani bir şeyi detect edersek döngüden tamamen çıkmak için kullanılır
 			}
			System.out.println(i);

		}
		System.out.println("Hoşçakalın ... \n");
		System.out.println("*******************");
		
		for (int i=0; i<10;i++) {
			if(i==5) {
				continue; // kırmadan continue with next index diyerek çık yani skip ettik
				// bir şeyi döngü içinde skip etmek için 'continue' kullanılır.
			}
			System.out.println(i);
		}
		System.out.println("*******************");

		//örnek: 7 ye kadar yazar. neden 7yi de yazar ?  !! çünkü sayac 6 ile girdiği döngüde breaki geçip artırıp yazıyor. sonra sayac 7 olunca döngüden break ile çıkar.
		// 7'yi yazmadan çıksın istiyorsan printi sayacı artırın üstüne yazmalısın... bu ufak syntax şeylerine dikkat et...
		int sayac = 0 ;
		while (sayac <10) {
			if (sayac == 7)
				break;
			sayac++;
			System.out.println(sayac);
			}
	
	}
}