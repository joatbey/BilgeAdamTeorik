package com.dorukbiyikli;

import java.util.Scanner;

public class Diziler {

	public static void main(String[] args) {
		// Bir veri tipinin multiple örnek içeren versiyonu
		// tam sayı dizisi => { 3,5,2,23,4,6,7} 
		// metin dizisi => { "ali", "veli" , "ayşe", "fatma"}
		// nesnelerden oluşan diziler de var OOP
		
		//dizi tanımlama
		//dizinin cinsi önce yazılır byte short int etc... sonra []
		long[] dizi1 ; // bu şekilde
		// dizileri initialize etmeden onları kullanamazsınız.
		// burada dizi1[0] yazarsam 0 vermez hata verir.
		dizi1 = new long[7]; // böyle memoryde ne kadar yer kullanacağını söylemek lazım
				// new komutu ile  bir class oluşturuyorsun. stackte ismi olan bu şeyin heap içinde adresslenmesi gerekiyor initialize etmek 
				// java arkaplanda şöyle bir şey oluşuturuyor.
				// { 0, 0, 0, 0, 0, 0, 0 } 
		System.out.println(dizi1[0]); // ilk eleman
		System.out.println(dizi1[dizi1.length-1]); // son eleman
		System.out.println("dizinin lengthi: " + (dizi1.length));
		System.out.println("dizinin son elemanının indexi: " + (dizi1.length -1));
		System.out.println("*********");

		// Dikkat: 
		// Dizinin boyutlarını aşan indekslere erişmeye çalışırsanız hata alırsınız mesela:
		// System.out.println(dizi1[7]); hata verir çünkü son indeksten büyük. 0la başlıyor
		
		// dizilere atama yapmak
		dizi1[0] = 10;
		dizi1[1] = 15;
		dizi1[6] = 28;
		System.out.println(dizi1[1]);
		System.out.println("\n\n");
		System.out.println("*********");

		//dizilerin değerleri okunurken genelde loop kullanılır:
		for (int i = 0 ; i <7 ; i++) {
			System.out.println(dizi1[i]);
		}
		
		for (int i = 0 ; i < dizi1.length;i++) {
			System.out.println(dizi1[i]);
		}
		
		// dizi tanımlama 2. yöntem:
		int[] myArray = { 1 , 5 , 9 , 24 , 112} ; 
		System.out.println(myArray[2]);
		
		// dizi tanımlama 3. yöntem:
		int[] arrayInt = new int[ ] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arrayInt.toString());
		
		for (int i = 0 ; i< arrayInt.length ; i++) {
			System.out.println(arrayInt[i]);
		}
		System.out.println("*********");

		// Soru: ekrana ne yazar ??
		//bu enteresan ben 10 yazdırır diye düşünmüştüm 999 gösterdi.
		// stack kısmında ramin array1 array2 tutuluyor, Heap kısmına içerikler yazılmıştı.
		// array1=array2 derken array2nin içeriğine gidiyor artık array1in pointeri 
		// array1[0] ı değiştirince artık stackte memory 
		
		int[] array1 = {1,5,9,24,112} ;
		int[] array2 = {10,50,90,240,1120} ;
		array1 = array2 ;
		array1[0] = 999 ;
		System.out.println(array2[0]);
		System.out.println("*********");

		//dizi tanımlama String
		String[]  arrayString = new String[] { "ali " , "veli ", "zeynep" , "can" };
		for (int i = 0 ; i< arrayString.length ; i++) {
			System.out.println(arrayString[i]);
		}
		System.out.println("*********");

		
		String[] dizi2 = new String[3];
		dizi2[0] = "papatya" ; 
		dizi2[1] = "gül";
		dizi2[2] = "lale";
		// dizi2[3] = "orkide" hata olur 3 elemanlı diziye 4. indekse eleman atamaya çalışıyorsun.
		for (int i = 0 ; i< dizi2.length ; i++) {
			System.out.println(dizi2[i]);
		}
		System.out.println("*********");

		//null konusu:
		String isim;
		//System.out.println(isim); // isim değişkeniyle atama yapmazsan (initialize etmezsen)  IDE kırmızıya boyayıp hata verir.
		
		
		
		//örnek
		String[] dizi3 = new String[3]  ; //==> {null, null ,null} 
		dizi3[0]= "Ali"; 	              // ==> { "Ali", null, null}
		for(int i = 0; i < dizi3.length; i++) {
			System.out.println(dizi3[i]);
		}
		System.out.println("*********");

		
		
		// kullanıcıdan bir tamsayı alalım girilen tamsayı dizinin boyutu olsun
		// bu dizinin içeriğini de yine kullanıcı consoledan alsın.
		// runtime (programın çalışma esnasında) dizi oluşturma
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dizinin boyutunu giriniz: ");
		int diziBoyutu = scanner.nextInt();
		int[] diziOrnek = new int[diziBoyutu];
		for (int i=0 ; i<diziBoyutu; i++) {
			System.out.println("Lütfen dizinin "+i+". elemanını giriniz: ");
			diziOrnek[i] = scanner.nextInt();
		}
		// yukarıdaki kullanıcının oluşturduğu diziyi ekrana yazdıralım 
		
		for(int i = 0 ; i< diziOrnek.length; i++) {
			System.out.print(diziOrnek[i]+", ");
		}
		System.out.println("*********");

		
		
		
	}

}
