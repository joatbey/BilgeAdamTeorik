package com.dorukbiyikli;

import java.util.Random;

import com.alikaya.YardimciSinif;

public class Main {

	// METODLAR - FONKSİYONLAR
	//
	// public => Access modifier(Erişim belirleyici)
	// public: Bütün package'lar kullanılabilir.
	// protected: Sadece aynı package içi kullanım sağlar.
	// private : Sadece sınıf içi kullanım sağlar.

	// static => (zorunlu değil.) static methodların hepsi program çalışır çalışmaz
	// adresslenir memoryde machine languagede.
	// static olmasa idi, adress nesne oluşunca oluşacaktı.
	// OOP dışındaki tüm methodlar static tanımlanır o classa özgüdür

	// final => ( zorunlu değil) : methodun başına final yazılırsa o method override
	// edilemez demektir.(OOP'ta göreceğiz)
	// final keyword'u sınıfın başına gelirse o sınıftan yeni sınıf turetilemez
	// (inheritence yapılamaz )
	// final en çok sabit olan değişkenlerde kullanırız.
	final static double PI = 3.14; // PI değerini değiştiremeyiz anlamına gelir.

	// Return type: => Zorunlu. Hiçbir şey return etmeyecekse , void yazılmalıdır.
	// return eden şey varsa onun type'ı yazılmalıdır.

	// hello : Method ismi yazılmak zorundadır.

	// Parantezler: Parantezlerin içine isterseniz parametre(ler) yazabilirsiniz.
	// (opsiyonel)
	// aşağıdaki hello() örneğinde parametre yok
	// {} : metodun içeriğini (code body) süslü parantezlerin içine yazmanız
	// gerekir.

	// örnek metod:
	// bir sayının (int) karesini alıp int type return etmeli ( int return etmezse
	// hata alırız...)
	// parametreli metod:

	private static int kareAl(int sayi) {

		int sonuc = sayi * sayi; // bu 'sonuc' bu methodun içinde tanımlı scopeu burası. methodun local değişkeni. ya da sayi da öyle . 
		
		return sonuc;

	}
	
	// örnek metod: 
	public static int randomNumber() {
		Random random = new Random();
		int result = random.nextInt(100);// 0dan 100e kadar random integer urettik.
		return result;
	}
	
	//örnek method: 
	// üst limiti parametre olarak alan yeni bir randomNumber methodu
	// aynı method ismi kullanalım: bu method overloading demek.
	public static int randomNumber (int ustLimit) {
		Random random = new Random();
		int result = random.nextInt(ustLimit);
		return result;
		
	}
	
	// örnek : aşağıdaki işlem yanlıştır.  // çünkü parametreli bir tane varken ona gidiyordu aynı isimde ama parametrenin ismi farklı olunca 
											// method overloading yanlış oldu 
//	public static int randomNumber (int uLimit) {
//		Random random = new Random();
//		int result = random.nextInt(uLimit);
//		return result;}

	// bu da method overloading değildir:
	public static int rastegleSayiUret (int ustLimit) {
		Random random = new Random();
		int result = random.nextInt(ustLimit);
		return result;
		
	}
	
//	// aşağıdaki işlem yanlıştır : nereye gideceğini bilmez 
//	public static void randomNumber (int ustLimit) { // duplicate method diyor. ( yani void ya da int ile olması farketmiyor.) bunlar aynı method değil demiyor.
//		// parametresi olan ve olmayan iki randomNumber methodu olsa anlayabiliyordu ... return type'ı farklı olsa da bulamıyor void ya da int diyerek...
// 		System.out.println();
//		
//	}
	
	public static final void hello() {
		System.out.println("Hello from hello method in Main.java");
	}

	public static void main(String[] args) { // main method: program run edildiğinde buradan girilecek...
		System.out.println("Merhaba");

		hello();

		Main.hello(); // Main class ismi , hello metod.
		// aynı class içindeki static methodları çağırmak için uzun uzun paket ismi
		// yazmak zorunda değilsin. Hatta yukardaki gibi
		// sadece hello(); da yazılabilir aynı class içinde

		// alinin methodunu çağırmak için farklı package ismini yazmam lazim.... ya da
		// import etmem lazım o package'i

		com.alikaya.YardimciSinif.hello(); // methodun üstüne gelip f3e basarsan oraya gider.
		// eğer YardimciSinif public yerine protected olsaydi

		// yukarda private static int kareAl(int sayi) ile tanımladığm metodu çağırıyoruz main method içinde ... aynı class içinde private çağırabilirm.
		int matSonuc = Main.kareAl(5);// 5 parametre. Bu parametrelerin de scopeları local. 
										//yani buradaki 5i methodun scopu içinde tutuyor. en son return ettiğinde 25i bu 5i tutmuyor.
										// buradaki matSonuc da local ama main methodu içinde local 
		
		System.out.println("matSonuc: " + matSonuc );
		System.out.println("0-100 arasında random bir sayı: "+ randomNumber()); // bu StringBuilder ile olduğu için debug burada ona gidiyor.
		// bu arada Main.randomNumber
		int randomSayi3= Main.randomNumber();
		System.out.println("Random bir sayi 3 : "+ randomSayi3);
		
		// overload ettiğim methodu çağıralm, bunu bir parametre ile çağıracağız...
		System.out.println("Random nir sayı v2 : " + randomNumber(1000)); // parametreli olunca parametreli methoda gidiyor.
		
		
		// scanner import ediyorduk ya
		java.util.Scanner scanner; // şeklinde java kütüphanesinde (package'inda) var

		// com.alikaya.YardimciSinif.hello2(); // The method hello2() from the type
		// YardimciSinif is not visible
		// com.alikaya.YardimciSinif.hello3(); //The method hello2() from the type
		// YardimciSinif is not visible

		System.out.println("Hoşçakalın...");

		// Main.PI = 3 ; //yapamazsın The final field Main.PI cannot be assigned der

	}

}
