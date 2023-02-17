package com.dorukbiyikli;

public class Main {

	public static void main(String[] args) {
		Kitap kitap1; // stack memoryde Kitap classına ait kitap1 denen değişken pointer gibi...

		kitap1 = new Kitap(); // bu satır heap memoryde bir kitap1 objesi oluşturur. ona memoryde String ad ,
								// int sayfaSayisi, String yazarAdi alanları açar...
		// boş da olsa rezerve edilmiş oluyor.
		// Bu satırdan önce memorynin neresine yazacağını bilmiyor.
		// heapte memory adressi oluşmadı bunu yazmazsan
		// dolayısıyla

		kitap1.ad = "ince memed";
		kitap1.yazarAdi = "yasar kemal";
		kitap1.sayfaSayisi = 450;
		kitap1.sayfaSayisi = 600; // böyle değiştirebilirim memoryde yeri belli çünkü
		kitap1.stokMiktarı = 500;

		Kitap kitap2 = new Kitap(); // tek satırda yapılabliyor zaten yukarda detaylı stack heap olayını anlamak
									// için yazdım.
		kitap2.ad = "kasagi";
		kitap2.yazarAdi = "omer seyfettin";
		kitap2.sayfaSayisi = 50;
		kitap2.stokMiktarı = 80;

		System.out.println(kitap1.kitapBilgileriniGetir());

		System.out.println(kitap2.kitapBilgileriniGetir());

		// puzzle classına ait nesneleri oluşturalım
		Puzzle ravensBurgerEyfel = new Puzzle();
		ravensBurgerEyfel.adi = "Eyfel Kulesi";
		ravensBurgerEyfel.marka = "RavensBurger";
		ravensBurgerEyfel.parcaSayisi = 1000;
		ravensBurgerEyfel.stokMiktari = 300;

		System.out.println(ravensBurgerEyfel.puzzleBilgileriniGetir());

		Kitap kitap3;
		// System.out.println(kitap3.ad); //may not have been initialized hatası verir
		// henüz bir yere point etmiyor bu kitap3 çünkü henüz öyle bir yer yaratmadık =
		// new Kitap() diyerek

		kitap3 = kitap2; // tıpki C C++ daki pointerlar gibi
		// birkaç byte ile adını ve türünü bilerek bunu stackta pointer gibi tutuyor.
		// kitap3 = kitap2 assignmentını yaparken kitap3 'pointer'ını kitap2nin heapteki // aslında nesne referansı demek lazım pointer değil   
		// memorysine atıyorsun.
		System.out.println(kitap3.ad) ; // kitap2nin pointerının da point ettiği heapteki adı 'kaşağı' yı print ediyorsun.

		
		kitap3.sayfaSayisi = 75 ; // şimdi de aynı yere gidip 80i 75 ile değiştirir. 
		System.out.println(kitap3.sayfaSayisi); //75
		
		System.out.println(kitap2.sayfaSayisi); //75 
		
		
		// şimdi mesela desek ki 
		kitap2 = new Kitap();  // BU SATIRLA HEAPTE BAŞKA BİR MEMORY OLUŞTURULUR. KİTAP2 BU YENİ YERE POİNT EDER...
		kitap2.ad = "80 günde devrialem";
		kitap2.sayfaSayisi =75;
		kitap2.stokMiktarı = 220;
		kitap2.yazarAdi = "Jules Verne";
		
		System.out.println(kitap1.kitapBilgileriniGetir()); //bu düz.
		System.out.println(kitap2.kitapBilgileriniGetir());// şimdi bu kitap2 YENİ BİR HEAP MEMORYDE OLAN ve yeni girdiğimiz datalarla olan bi nesne oldu 
		System.out.println(kitap3.kitapBilgileriniGetir());// bu ilk kitap2 refernsıyla heapta oluşturduğumuz sonra kitap3 referansını da aynı heape atadığımız.
		// 46. satırda kitap3ün nesne referansı ile kitap2nin refere ettiği yeri bağlamıştık
		// yani kitap3 e o eski kitap2nin bulunduğu memoryi atamıştık
		//  bunu yapmasaydık ve kitap2nesnesinin içindeki değişkenlerin olduğu memory ÖKSÜZ/YETİM kalacaktı
		// bu durumda Javada c ve c++ da olmayan garbage collector unallocated memoryleri bir süre sonra siliyor...
		// memory allocation - deallocation üzerinde maksimum kontrol programlamayı zorlaştıracağı gibi spesifik yazılımlarda c++ kullanılmasının anlamlarından biri budur.
		// öte yandan javada ve c# dillerinde bu problem yok burada bahsedilen şekilde oluyor... unallocated memoryler garbage addediliyor ve siliniyor.
		
		
	}

}
