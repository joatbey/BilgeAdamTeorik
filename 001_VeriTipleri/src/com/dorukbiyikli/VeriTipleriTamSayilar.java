package com.dorukbiyikli;

public class VeriTipleriTamSayilar{ // 

	
	public static void test() {
		System.out.println("Test yazıyorrrr");
	}
	public static void main(String[] args) {
		
		System.out.println("Hello Java 1");// ln alt satıra geçirir
		System.out.print("Hello Java 2");
		System.out.println("Hello Java 3");
		System.out.println("Hello Java 4");
		System.out.println("Hello"+" "+"Java");
		test();
//		//Değişken tanımlama
//		int x = 4;
//		System.out.println(x);
		byte byteValue = 0 ; // 1 Byte yer tutar byte değişken isimlerini camelCasing yaz 
						// local variable bu. scope'u tanımlandğı yer method içinde...		
		byteValue= 42;
						// Bir local değişkenin ilk değer ataması olmaksızın ekrana yazdırılamaz, kullanılamaz
		System.out.println(byteValue);
		byteValue=6;

		short shortVal1 =3, shortVal2 = 40 ; 
		// Büyük ilkel veritip = küçük ilkel veritip diyebiliriz ancak tersini yapamayız
		shortVal2 = byteValue ; // olur
		//byteValue = shortVal1 ;  olmaz
		byteValue = (byte) shortVal1 ; // şeklinde yaparsak izin veriyo casting deniyor buna ama tabi byte ile saklayabilirsek sadece yoksa int bytea sıgmaz diyor
		System.out.println("byteValue:" + byteValue); // burada val1 300 olduğu için 128 çıkara çıkara gitmiş 44 kalmış sonra saklayabileceği 
		byte ogrenciSayisi; // dogru
		
		byte maxURLSayisi; 
		// yanlış tanımlamalar:
		//byte ogrenci Sayisi;
		//byte *ogrenciSayisi;
		//byte öğrencisayısı;
		//byte 1ogrenciSayısı; numaralar sona konur başa konmaz değişken isimlerinde
		//ogrenciSayisi1=> Doğru;
		
		int intValue = 0 ;
		int i1,i2,i3 ;
		i1=0;
		i2=3;
		i3=4;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		byte b2; 
		byteValue = 12;
		b2 = (byte) (byteValue + byteValue);
		System.out.println(b2);
		// b2 = byteValue + byteValue; hata verir çünkü iki byte toplanırsa java otomatik olarak integere atıyor toplamı
		
		//shortlar da toplanırsa integer olacak
		short sh1= 3;
		short sh2= 2;
		// sh3= short( sh1+ sh2); //bu direkt hata verir yine çünkü 
		long longValue = 7;
		System.out.println(longValue);
		// long için atarken integeri aşacak bi sayı atarsak hata veriyor
		// çünkü assignmentlarda sağ tarafı int atar.
		longValue = 922337203685477580L ;// şeklinde yazmazsak sonuna L koyarak, integer atıyor sağı 
	    // çarparken de hata olur 
		long myTimer = 123281313901293921L *2 ; // burada da L koymazsak hata verecek
		
		int carpan = 100000;
		long carpim = carpan * carpan; // burada da L koymazsak hata yapacak üstelik hata vermeden yapacak 100bin * 100bine 1410065408 diyor 
		System.out.println("carpim: " + carpim); 
		carpim = 1L * carpan * carpan ;
		System.out.println("carpim: " + carpim);// böyle düzgün
		System.out.println(longValue);
		System.out.println(myTimer);
		
		//long altçizgi kullanımı
		long x =123_231_123_231L; // okumayı kolaylaştırsın diye
		System.out.println(x);

		
		
		
		
		
		
		
	}

}
