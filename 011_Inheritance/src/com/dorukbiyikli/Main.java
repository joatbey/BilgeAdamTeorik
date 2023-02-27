package com.dorukbiyikli;

public class Main {
	
    //INHERITANCE

	// INHERITANCE bir sınıfın üst sınıftan üye özellikleri ve metodları miras
	// almasına denir miras aldığı zaman alt sınıf üst sınıfın özelliklerini tıpkı
	// kendisindeymişcesine kullanabilir.
	//
	//alt sınıf türetme hiyerarşik yapıda olur. 
	//bir alt sınıfın türetildiği sınıf o alt sınıfın üst sınıfı olur
	
	// javada bir alt sınıfın yalnızca en fazla sadece 1 üst sınıfı olabilir. bu diğer dillerde python c# gibi farklılık gösterir.
	// üst sınıfa super class ata (parent), alt sınıfa cocuk (child) ya da sub class denir

	
	public static void main(String[] args) {
//		Muhendis muhendis1 = new Muhendis();
//		muhendis1.setAd("Ali");
//		muhendis1.setSoyad("Özkan");
//		muhendis1.setTcKimlik("1213132121");
//		muhendis1.setUzmanlikAlani("Elektrik Elektronik Müh.");
//		
//		System.out.println(muhendis1.getAd() + " " + muhendis1.getSoyad() + " " + muhendis1.getUzmanlikAlani());
//
//		IdariMemur idariMemur = new IdariMemur();
//		idariMemur.setAd("Ali");
//		idariMemur.setSoyad("Veli");
//		idariMemur.setTcKimlik("32312321322");
//		idariMemur.setGorevi("D. Bşk. Sekteretri");
//		System.out.println(idariMemur.getAd() + " " + idariMemur.getSoyad() + " " + idariMemur.getGorevi() + " " +idariMemur.getTcKimlik()  );

		Muhendis muhendis2 = new Muhendis();
		muhendis2.setAd("Ahmet"); // inheritance olduğu için f3 ile Personel classına gidiyor.
		muhendis2.setSoyad("Çalışkan");
		muhendis2.setUzmanlikAlani("Makine Müh.");
		System.out.println(muhendis2.getAd() + " " + muhendis2.getSoyad() + " " + muhendis2.getUzmanlikAlani());
		
		Muhendis m = new Muhendis();// Personel sınıfının 1 nolu Constructoru çağırıldı...

		Sekreter s = new Sekreter(5321112233L);//Personel sınıfının 2 nolu Constructoru çağırıldı...
		
		//Mudur mud = new Mudur(); // hata verdi çünkü sadece parametreli tanımladık
		Mudur mud = new Mudur(2); // böyle olur.
	}

}
