package com.dorukbiyikli;

public class Ogrenci {

	public int ogrenciNo;
	public String ad; // null bir stringi sysout ile yazdırmaya çalışırsanız exception vermez ekrana null yazar. 
	public String soyad; // bu stringlerdeki nulla özgü birsey . normalde başka bir objede null bir şeyi yazdırmak istersen exception hatası verir patlar...

	public IletisimBilgileri iletisimBilgileri = new IletisimBilgileri(); // baska classin objesini yaratıp burada field olarak tutuyorm.

	// sağ tık source generate toString
	@Override
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + ", ad=" + ad + ", soyad=" + soyad + ", iletisim Bilgileri="
				+ iletisimBilgileri + "]";// köşeli parantezlerin önemi yok string yani zaten normal parantezle
											// değiştirebilirsin
	}

	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.ogrenciNo = 100;
		ogrenci1.ad = "Ali";
		ogrenci1.soyad = "Özkan";
		ogrenci1.iletisimBilgileri = new IletisimBilgileri();
		ogrenci1.iletisimBilgileri.tel = 513412124;
		ogrenci1.iletisimBilgileri.adres = "ıhlamur sokak no5 cankaya";
		System.out.println(ogrenci1.toString());

		//System.out.println(ogrenci1); // böyle de olur

		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ogrenciNo = 101;
		ogrenci2.ad = "Zeynep";
		ogrenci2.soyad = "Çalışkan";
		ogrenci2.iletisimBilgileri = new IletisimBilgileri();
		ogrenci2.iletisimBilgileri.tel = 51313124 ;
		ogrenci2.iletisimBilgileri.adres = " su sokak no4 antalya";
		System.out.println(ogrenci2.toString());
		

		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.ogrenciNo = 101;
		ogrenci3.ad = "Ahmet";
		ogrenci3.soyad = "Kaya";
		ogrenci3.iletisimBilgileri = new IletisimBilgileri();
		ogrenci3.iletisimBilgileri.tel = 511231314;
		ogrenci3.iletisimBilgileri.adres = " bu sokak no6 bursa";
		System.out.println(ogrenci3.toString());
		
//		
//		Soru öğrenci nesnelerinden oluşan bir dizi oluşturun diziye sırasıyla ogrenci1 ogrenci2 ogernci3ü içerik olarak atayın
//		for each döngsü ile dizinin tüm elemanlarını yazdırın:
		System.out.println("*******************************************************************************************************************");
 		
		Ogrenci diziOgrenci[] = new Ogrenci[4];
		//Ogrenci[] diziDizi = new Ogrenci //{ null, null,null, null]
		diziOgrenci[0]= ogrenci1;
		diziOgrenci[1]= ogrenci2;
		diziOgrenci[2]= ogrenci3;
		diziOgrenci[3] = new Ogrenci(); // 
		diziOgrenci[3].ad = "Bartu";
		diziOgrenci[3].ogrenciNo = 103;
		diziOgrenci[3].soyad = "Barbar";
		diziOgrenci[3].iletisimBilgileri = new IletisimBilgileri(); // diziOgrenci dizisi içinde yeni bir dizi oluşturdum
		diziOgrenci[3].iletisimBilgileri.adres = "ayrancı mah çankaya ankara";
		diziOgrenci[3].iletisimBilgileri.tel = 5461231243L; 

		
		for (Ogrenci ogr:diziOgrenci) {
			System.out.println(ogr);
			//null kontrolü 
			if(ogr!= null) {
				System.out.println(ogr.ad); // null olmayanları yazıyor. 
			}
		}

	
	
	
	
	
	
	}

}
