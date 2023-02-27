package com.dorukbiyikli;

public class Main {
	// Şimdiye kadar gördüğümüz sınıflar concrete yani somut sınıflardı.
	//
	// Abstract snıflar ise soyut sınıflardır.
	//
	// Abstract bir sınıftan new ile nesne(object) oluşturamazsınız. Abstract
	// sınıfların nesnesi olmaz.

	public static void hayvani2KezBesle(Hayvan h) {// polymorfizm
		h.yemekYe();
		h.yemekYe();

	}

	public static void main(String[] args) {

		// şimdi hayvan zaten soyut bir kavram...
		// bir hayvan ya kuştur ya kedidir ya köpek etc...

		// Aşağıdaki örnekte de görüldüğü üzere abstract bir sınıftan nesne
		// oluşturulmaz...
//		Hayvan h = new Hayvan(); // Cannot instantiate the type Hayvan hatası veriyor abstract sınıf olarak tanımladığımda...
//
//		
//		h.sesCikar(); // burada ne sesi çıkacak şimdi ? hayvan sesi diye bir kavram soyut zaten subclasslara göre anlam kazanıyor. tek başına yok.

		Hayvan h = new Kedi("Tekir", 3, 35); // eğer burada kedi sınıfında bi ses çıkar methodu implement etmeseydim.
		// o zaman üst sınıfa gidip hayvan classındaki methodu kullanacaktı. Fakat ben
		// abstract yaparak buna izin vermiyorum. Eğer kedi için override etmeyi
		// yapmadıysam hata verecek.
		h.sesCikar(); // The type Kedi must implement the inherited abstract method Hayvan.sesCikar()
		h.yemekYe();

		Kus kus = new Kus("Birdie", 1, 12);

		Main.hayvani2KezBesle(kus);
		Main.hayvani2KezBesle(new Kopek("Toni", 5, 59));

		Kedi kedi1 = new Kedi("poncik", 5, 60);
		kedi1.sutIc();
		// h.sutIc();//The method sutIc() is undefined for the type Hayvan
		// burası önemli : kedinin sutIc() methodu kediye özel.
		// Hayvan classı üzerinden Hayvan h = new Kedi("Tekir",3,35); diyince, bu h
		// üzerinden yanlız POLYMORPHIC methodları çağırabilirsin...

		// bir başka şekil ise casting:
		// Advanced konu: Casting.
		// bir üst sınıfı(hayvan) alt sınıfa(kedi) cast ettik: //
		// (Sınıf)nesne şeklinde cast edeceğiz.
		// casting işleminde sorumluluk sende dikkatli olacaksın.
		((Kedi) h).sutIc();

		Hayvan h2 = new Kopek("Lessie ", 8, 77);
		//((Kedi) h2).sutIc(); // bak burada bu köpek nesnesini kediye cast ettik methodu da çağırdı hata 
								// vermiyor idede Java hata vermedi...
		//runtime exception verir: h2 nesnesi köpek sınıfından , kedi sınıfına cast ederek hatalı bir işlem yapmış oluruz.
		// Exception in thread "main" java.lang.ClassCastException: class com.dorukbiyikli.Kopek cannot be cast to class com.dorukbiyikli.Kedi
		// 
		
	}

}
