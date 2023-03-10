package com.dorukbiyikli;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {
		// String metin = "Merhaba Nasılsın?"
		// Scanner input = new Scanner(System.in)
		// metin = input.nextLine();
		// System.out.println(metin);

		// 0 1 2 3 4 5 6 7 ...
		// {'B','u','g','u','n',' ','J','a','v','a',' ','i','l','e'...
		// index dizilimi 0,1,2,3...
		String metin = "Bugün Java ile string konusunu işleyeceğiz.";
		String tekharf = "a"; // char[] dizi => {'a'} Java bunu 1 elemanlı char dizisi olarak tutar

		// String en çok kullanılan method/fonksiyonları:

		// *************
		// length metodu:
		// metin.lentgh() => metnin uzunluğunu int olarak verir. 4 karakter varsa uzunluk 4 . son karakterin indexi 3 ama. oraya dikkat.
		
		int uzunluk = metin.length();
		System.out.println(uzunluk);

		// charAt methodu:
		// belirli bir indexteki karakteri return eder.
		System.out.println("0. index karakter: " + metin.charAt(0));
		System.out.println("2. index karakter: " + metin.charAt(2));

		// sonuncu karaktere ulaşmak
		System.out.println(metin.charAt(uzunluk - 1));
		System.out.println(metin.charAt(metin.length() - 1)); // son karakter stringlerde istisnasız length -1 aslında dizilerde de aynı çünkü string de char dizisi

		//indexOf methodu
		// s harfi İLK hangi indexte geçiyor ?
		System.out.println("s ilk nerede geçiyor ?  " + metin.indexOf("s"));
		System.out.println("B ilk nerede geçiyor ?  " + metin.indexOf("B"));
		System.out.println("b ilk nerede geçiyor ?  " + metin.indexOf("b")); // aradığın yoksa -1 return eder.

		// birden fazla karakter arama
		System.out.println("Java kelimesi ilk nerede geçiyor? " + metin.indexOf("Java"));

		// Soru: x harfi var mı yok mu ?
		if (metin.indexOf('x') == -1) {
			System.out.println("metinde 'x' yok");
		} else {
			System.out.println("metinde 'x var ");
		}

		// i ilk nerede geçiyor ?

		System.out.println("i harfi ilk nerede geçiyor ? " + metin.indexOf("i"));

		System.out.println(" i 14.indexten sonra ilk nerede geçiyor " + metin.indexOf("i", 14));
		// i harfi metnin yarısından itibaren ilk nerede geçiyor.
		System.out.println("i metnin yarısından itibaren nerede geçiyor " + metin.indexOf("i", (metin.length() / 2)));

		// substring
		// substring(baslangic index , bitis index) ==> baslangic dahil - bitis dahil degil
		// 
		// gets substring of a string
		System.out.println("metnin ilk 5 karakteri: " + metin.substring(0, 6));

		// metindeki java ifadesini substringle çek
		System.out.println("javanın ilk geçtiği yer: " + metin.substring(6, 11));

		String cumle = "   Hello Java ";
		System.out.println(cumle);
		cumle = cumle.trim(); // yanlız cumle.trim() yaparak olmaz atama yapman lazım
		System.out.println(cumle);
		// kullanıcı adı şifre yazan uygulamalarda trim kullanmazsanız sorun
		// yaşarsınız...

		// **************************************
		// toUpperCase ve toLowerCase
		// metnin içindeki harflerin case'ini değiştirir.
		metin = "Hello Java";
		System.out.println(metin.toUpperCase());
		System.out.println(metin.toLowerCase()); // mail alırken bu lazım...

		// Soru:
		// Aşağıdaki çıktıyı ekrana yazdıran bir döngü yazınız:
		/*
		 *
		 * 
		 * * * * * * * * * * * * * * * * * * * * * *
		 * 
		 */

//		for (int i = 1; i <= 7; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();

		String s = "*";
		for (int i = 0; i < 7; i++) {
			System.out.println(s);
			s = s + " *";
		}

		// *****************************
		// value of
		// conversts different types of values to String
		int sayi = 2233;
		String ss = String.valueOf(sayi);
		System.out.println(ss);

		boolean flag = true;
		ss = String.valueOf(flag);
		System.out.println(ss);

		// ***********************

		// equals metodu
		String uname = "gsungur@test.com"; // DB'de loginname boyle tutuluyor diyelim

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adı giriniz: ");
		String userName = input.nextLine();

		// !!DİKKAT stringleri karşılaştırırken == ile yapılmaz !! doğru olsa da
		// eşleşmedi diyor. equals metodu kullanılır.
//		if(userName == uname) {
//			System.out.println("Kullanıcı adı eşleşti");
//		}
//		else {
//			System.out.println("Kullanıcı adı eşleşmedi");
//		}

		// hatta aslında trim etmek lazım önce .space falan varsa başında sonunda çünkü
		// hatta case de yapmak lazım . toLowerCase ile

		userName = userName.toLowerCase();
		userName = userName.trim();
		// ya da userName= userName.toLowerCase().trim(); tek satırda da olur
		// böyle mailsel şeyleri databasede lowercase tutmak lazım
		// çevirip kaydetmek lazım veritabanına yine kontrol ederken de çevirip bakmak
		// lazım inputa

		if (userName.equals(uname)) {
			System.out.println("Kullanıcı adı eşleşti");
		} else {
			System.out.println("Kullanıcı adı eşleşmedi");
		}

		// **********
		// equalsIgnoreCase metodu
		// Metin karşılaştırması yaparken case dikkate almaz

		String isim1 = "Vedat";
		String isim2 = "vedat";
		if (isim1.equalsIgnoreCase(isim2)) {
			System.out.println("isimler eşleşti");
		} else {
			System.out.println("isimler eşleşmedi");
		}

		
		// replace metodu
		//
		String s2 = "Şahin yırtıcı bir kuştur. ";
		String s3 = s2.replace("Ş","s");
		System.out.println(s3);
		
		// nerelerde kullanılır?
		
		String sozlesme = "Ali Kaya güneş sokaktaki evini ayşeye kiraladı";
		String yeniSozlesme = sozlesme.replace("ayşe", "merve");
		System.out.println(yeniSozlesme);
		
		
		// türkçe karakter webde özellikle sıkıntı çıakrtabiliryor.
		// bi şeyi kaydederken türkçe karakter kullanılmaz dosya adı olarak
		// user öyle yaptıysa onu düzeltmek lazım.
		// boşlukları da tre ile değiştirmek lazım öyle saklamak lazım.
		
		String dosyaAdi = "https://www.isbasvuru.com/alikaya iş başvurusu.pdf" ; // böyle bi şey oldu
		dosyaAdi = dosyaAdi.replace(" ", "-").replace("ş", "s"); // böyle iki metodu arka arkaya koyabilirz. string return ediyor sonra tekrar replace 
		System.out.println(dosyaAdi);
		
		// contains metodu
		// herhangi bir substringin hedef string içinde var olup olmadığını kontrol eder
		String yeniMetin = "Hava bugün çok yağmurlu";
		System.out.println("ağ kelimesi var mi ? "+ yeniMetin.contains("ağ"));
		
		if(yeniMetin.contains("yağmur")) {
			System.out.println("Hava durumunda bugun yagmur gorunuyor");
		}
		else {
			System.out.println("yagmur yok");
		}
		
		
		//**************
		// startsWith
		
		String ad = "Ali Kaya";
		System.out.println(ad.startsWith("ali")); // false
		System.out.println(ad.startsWith("Ali")); // true
		
		
		//split
		// verilen ifadeye göre metni böler
		String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";
		
		// String[] syntaxına dikkat
		String[] isimler = liste.split(","); // isimler isminde bir String dizisi yapar dizi array demek 
		
		System.out.println(isimler[0]); // isimler arrayinin ilk şeyini yaz
		System.out.println(isimler[isimler.length-1]); // sonuncu 
														// arraylerin bir özelliği olarak length var method olmadığı için () yok sonunda
		System.out.println();							// 
		for(int i=0; i< isimler.length; i++ ) {
			System.out.println(isimler[i]);
		}
		
		
		
		//örnek 
		// ögrencilerin listsi String olarak tutulutyor olsun  be bunları ayrıştırmak istiyorum
		
		String ogrencilerStr = "Ali Kaya,123;Veli Öz,222;Zeynep Naz,342"; // dikkat et öğrenci ve nosu arasında , var öğrencileri ayırırken ; var
		
		String[] ogrenciler = ogrencilerStr.split(";"); // ogrenciler[0] = {"Ali Kaya", "123" } 
		
		System.out.println();							// tüm arrayı tek tek indexleri yazdır.
		for(int i=0; i< ogrenciler.length; i++ ) {
			System.out.println(ogrenciler[i]);
		}
		
		//Soru: ilk ögğrencinin okul numarasını ekrana yaz
		
	
		System.out.println(ogrenciler[0].split(",")[1]); // ogrenciler[0] nested arrayin icindeki ilk indexteki array gelecek yani {"Ali Kaya", "123" }
														//bu arrayin arkasına nokta split yapınca ogrenciler[0].split(",") 
														// ikinci indexteki [1] elemanı yazdırdık.
		
		//soru: velinin yalnız ismini yaz soyadını yazma
		System.out.println(ogrenciler[1].split(",")[0].split(" ")[0]); // split ede ede gittim. 
	
		
		//stringbuilder kullanımı 
//		String s5 = "test";
//		String y= s5 + "hello"; bunlar memory açısından işlem yaptırıyor çok olursa n programı yavaşlatır.
//		System.out.println(y);
		
		StringBuilder stringBuilder = new StringBuilder(); // bir StringBuilder classı yarat. sınıftan türeyen nesne olan stringBuilder nesnesine ata bunu
		stringBuilder.append("Merhaba"); // oluşan bu character array e yani stringe yeni şeyler ekle
		stringBuilder.append(" Dünya");
		stringBuilder.append(" Java");
		System.out.println(stringBuilder); // Merhaba Dünya Java 
		
		
//		Scanner sc = new Scanner(System.in);
//		stringBuilder.append(sc.nextLine()); // kullanıcıdan bir string alıp yeni bi sc nesnesinde tut , stringBuilder nesnesine bu stringi .append ile ekle  
//		System.out.println(stringBuilder);    
		
		// String karşılaştırma konusu detay : 
		
		// x==y şeklinde string kıyaslarsan memory adresslerini karşılaştırmış olursun 
		// string içerik karşılaştırmada bu yüzden equals metodları kullanılmalıdır
		// sınavlarda mülakatlarda çok sorulur.
		
		String x = "Ali";
		String y = "Veli";
		
		if (x==y) {
			System.out.println("eşit");
		}
		else {
			System.out.println(" eşit değil");
		}
		
		String z = "Ali" ;  // x zaten Java String Poolda  "Ali" nin memorysinde şimdi z ile "Ali" tanımlayınca zaten olan x memory şeyine gidiyor
		if (x==z) {
			System.out.println("eşit"); 
		}
		else {
			System.out.println(" eşit değil");
		}
		

		String w = "Ali ".trim() ; // dikkat aliboşluk şeklinde girip trim ettiriyor. Bu olurken ilk başta yeni bir memory yeri oluşuyor. 
								//o yüzden buradan gelen "Ali" stringinin memory yeri farklı olduğu için w ile x eşit değil diyecek x==w diyince
	

		System.out.println(w);
		
		if (x==w) {
			System.out.println(" w ve z eşit"); 
		}
		else {
			System.out.println(" w ve z eşit değil");
		}
		
		
		// dikkat lazım
		if(w.equals(x)) {
			System.out.println("eşit");
		}
		else {
			System.out.println("eşit değil");
		}
		
		
		
		
	}

}
