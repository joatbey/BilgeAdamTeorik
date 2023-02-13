package com.dorukbiyikli;

public class MetodOrnekSoru2 {
	// bir tamsayı fizisi içideki sayıları toplatıp toplamı return eden bir metod yazalım...
	private static int diziTopla(int[] dizi) {
		int toplam = 0 ;
		for (int i =0; i<dizi.length; i++) {
			toplam += dizi[i];
		}
		return toplam;
	}
	private static void arrayIlkElemanDegistir(int[] dizi) {
		if(dizi.length!=0) {
			dizi[0] = 100;
		}
	}
	
	private static void test(int sayi) { // buradaki parametre oldupğu için sayi local variable
		sayi = 200;
	}
	
	private static int test2(int sayi) { // buradaki parametre oldupğu için sayi local variable
		sayi = 300;
		return sayi;
	}
	
	public static void main(String[] args) {
		int[] array1 = {5 , 10 , 15 , 20, 25};
		int[] array2 = {0} ;
		
		System.out.println(diziTopla(array1));
		System.out.println(diziTopla(array2));
		
		arrayIlkElemanDegistir(array1);// arrayler parametre olarak gönderilirse array içeriğine bir referans gider, içerik kopyalanmaz
		
		System.out.println(array1[0]); // 100 yazar !! nesnelerde pointer gibi çalışıyor.
		System.out.println(diziTopla(array1));
		
		System.out.println();
		int z=40;
		int sayi =1; // değişkenlerde durum farklı ilkel tipler parametre olarak giderse içerik kopyalanır, referans gitmez...
		test(sayi);// buradaki sayi parametre
		
		
		System.out.println(sayi); // 1 yazar...!! primitive data tipleri stackte kayıt edildiği için
		//orn.
		System.out.println(test2(sayi)); // 300
		System.out.println("sayi: "+ sayi );//sayi: 1

		
		
		
	}

	
	
}
