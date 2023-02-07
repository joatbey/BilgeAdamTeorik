package com.dorukbiyikli;

public class DizilerMultiDimensional {

	public static void main(String[] args) {
		int[] tekBoyutluDizi = new int[4]; // {0,0,0,0}
		int[] tekBoyutluDizi2 = { 3, 7, 12, 95, 23 };

		// çok boyutlu dizi yani matrix
		int[][] cokBoyutluDizi = new int[2][3]; // 2 row (satır) 3 column (sütun) // çift [][] olduğunu unutma
		// { {0,0,0}, {0,0,0} }
		//
		// 0 0 0 [
		// 0 0 0

		cokBoyutluDizi[0][0] = 1;
		// 1 0 0
		// 0 0 0

		cokBoyutluDizi[1][2] = 8;
		// 1 0 0
		// 0 0 8

		System.out.println(cokBoyutluDizi[0][0]); // 1 yazsın
		System.out.println(cokBoyutluDizi[1][2]); // 8 yazsın

		int[][] cokBoyutluDizi2 = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 }, { 10, 11, 12 } }; // 4 satır 3 sütünlük iki
																								// boyutlu dizi...

		int[][] cokBoyutluDizi3 = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 }, { 10, 11, 12 } }; // 4 satır 3 sütünlük iki
																								// boyutlu dizi...

		System.out.println(cokBoyutluDizi);// boyle yapınca şunu verdi: [[I@36baf30c

		// örnek:
		// Bir sınıf listesi yapalım içeriği şu şekilde olsun:
		// dizilerde tek tip olacağı için hepsi string olacak. string dizisi...
		// integerler burada "123" şeklinde yazılacak...
		// Sıra no: Öğrenci no: Ad: Soyad: // bunlar tutulmayacak!!
		// 1 101 Ali Kaya
		// 2 102 Veli Öz
		// 3 103 Zeynep Çalışkan

		String[][] sinifListesi = new String[3][4]; // 3 satır 4 sütun , 2 boyutlu matris...

		// şimdi içine kayıt atalım:
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ali";
		sinifListesi[0][3] = "Kaya";

		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Veli";
		sinifListesi[1][3] = "Öz";

		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Zeynep";
		sinifListesi[2][3] = "Çalışkan";

		System.out.println(sinifListesi);// boyle yapınca şunu verdi:[[Ljava.lang.String;@7a81197d
											// Ljava.lang.String;@ is returned where you used string arrays as strings.
		System.out.println();
		
		System.out.println("Öğrenci Listesi ");
		System.out.println("\n------------\n");
		System.out.println(
				sinifListesi[0][0] + " " + sinifListesi[0][1] + " " + sinifListesi[0][2] + " " + sinifListesi[0][3]);
		System.out.println(
				sinifListesi[1][0] + " " + sinifListesi[1][1] + " " + sinifListesi[1][2] + " " + sinifListesi[1][3]);
		System.out.println(
				sinifListesi[2][0] + " " + sinifListesi[2][1] + " " + sinifListesi[2][2] + " " + sinifListesi[2][3]);

		// burada satır satır yazılmayacak kadar şey olsaydı?

		// Çözüm: iç içe for döngüleri...

		System.out.println("Öğrenci Listesi iç içe loop ");
		System.out.println("\n------------\n");
		// 3 satır 4 sütun nested arrayimiz yani multidimensioal iki boyutlu dizimiz...
		// ilk döngü satır sayısı kadar dönecek
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) { //ikinci döngüde sütünları yazdırıyoruz ikinci döngü sütun sayısı kadar dönecek
				System.out.print(sinifListesi[i][j]+ " "); 
				
			}
			System.out.println();// her bir satır sonunda alt satıra geçmek istiyorum. burası ilk for döngüsünün sonu
		}

		
		// CODE REFINING
		// Burada 3 satır 4 sütün sayılarını kod içine gömmek yerine dizilerin length özelliğini kullanabiliriz
		System.out.println("Öğrenci Listesi iç içe loop - code refining ");
		System.out.println("\n------------\n");
		for (int i = 0; i < sinifListesi.length; i++) {// 3x4 olduğu için sinifListesi.length '3' return eder yani satır sayısını...
			for (int j = 0; j < sinifListesi[i].length ; j++) {  // i . satırdaki dizinin lengthi yani i. satırdaki sütun sayısı yani 3x4 teki '4'... 
				System.out.print(sinifListesi[i][j]+ " "); 
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		// EK BİLGİ
		// Herhangi bir String ifade içindeli sayıyı primitive veri tipine çevirmek için
		// wrapper(sarmalayıcı) class'ları kullanırız.
		System.out.println("*************");

		int siraNo = Integer.parseInt(sinifListesi[0][0]);
		System.out.println(siraNo);

		String sayiStr = "12.345";
		double sayi2 = Double.parseDouble(sayiStr);
		System.out.println(sayi2);

		// WRAPPER SINIFLAR:
		// ARAŞTIRIN
//      byte    Byte
//      short    Short
//      int       Integer
//      long    Long
//      float    Float
//      double    Double
//      boolean    Boolean
//      char    Character

		// 3 boyutlu dizi yapalım: bu n boyutlular yapay zeka için kullanılıyor daha çok python ile...,
		int[][][] dizi3Boyut = new int[3][3][3];
		dizi3Boyut[0][0][0] =23;
		System.out.println(dizi3Boyut[0][0][0]);
		
		
		
		
	}

}
