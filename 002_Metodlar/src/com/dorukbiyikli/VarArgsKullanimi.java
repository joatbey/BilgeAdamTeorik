package com.dorukbiyikli;

public class VarArgsKullanimi {

	public static void toplaVarArgs(int... sayilar) { // sayi1 sayi 2 sayi3 gibi kullanabiliriz ama kaç tane olduğunu
														// bilmiyorsak type ... diziİsmi
		int toplam = 0; // yukarıdaki metodun parametre kısmında yazan sayilar bir dizi gibi davranır
						// https://www.baeldung.com/java-varargs

		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("Toplam: " + toplam);
		
		
		//yukardaki örneği for each ile yapalım
		int toplamForEach =0;
		for(int x : sayilar) {
			toplamForEach+=x;
		}
		System.out.println("For each ile toplam : " + toplamForEach);
	}
	public static void ekranaYazdir(String...isimler) {
		for(String isim : isimler) {
			System.out.println(isim);
		}
	}

	public static void main(String[] args) {
		toplaVarArgs(1, 2, 3, 4, 5, 7);
		// https://www.baeldung.com/java-varargs buna bir bakınız
		ekranaYazdir("Ali","Kaan","Zeynep");
	}
	
	

}
