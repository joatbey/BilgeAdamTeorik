package com.dorukbiyikli;

public class SinifStatikDegiskenler {

	// Javada Global değişkenler yoktur. C'de vardır.
	// Bunun yerine sınıfların statik değişkenlerini public yaparak kullanırsanız global değişken gibi davranabilir.
	// Her classtan erişebileyim
	
	// sınıfların statik değişkenleri
	
	
	public static final int DUNYANIN_YARICAPI = 6371;//km	
	public static int aktifKullaniciSayisi = 0 ;
	
	public void staticOlmayanMetod() {
		System.out.println("statik olmayan metoddan merhaba");
	}
	
	
	
	public static void main(String[] args) {
	
		System.out.println("Aktif kullanıcı sayısı: "+ SinifStatikDegiskenler.aktifKullaniciSayisi);
		SinifStatikDegiskenler.aktifKullaniciSayisi++;
		System.out.println("Aktif kullanıcı sayısı: "+ SinifStatikDegiskenler.aktifKullaniciSayisi);
		SinifStatikDegiskenlerTest.main(args); // test classındaki main methodu çağırdım 3 kere artırdı ve yazdı.
		
		SinifStatikDegiskenlerTest.aktifKullaniciSayisini1Artir();// ve yaz
		//
		//System.out.println(z); hata verir...
		// scope not : 
		// local değişkenler ancak ve ancak tanımlandıktan sonra kullanılabilir
		int z = 9 ; // z bu satırda oluşturuluyor
		System.out.println(z);
		
		
		//Kural: 
		//Static olmayan metodları static metodlar içinden direkt çağıramazsınız...
		// static olmayan metodlar nesne metodlarıdır...
		//staticOlmayanMetod(); => hata verir...
		SinifStatikDegiskenler nesne = new SinifStatikDegiskenler();
		nesne.staticOlmayanMetod();// boyle cağırabiliriz nesnenin metodu olduğu için çağırabildik...
		
		
	}
	public static final double PI = 3.14; // program çalışır çalışmaz  memoryde adreslenir daha mainin içine girmeden oluşturulur...

}
