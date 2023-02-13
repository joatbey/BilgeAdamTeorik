package com.dorukbiyikli;

public class SinifStatikDegiskenlerTest {

	public static void aktifKullaniciSayisini1Artir() {
		SinifStatikDegiskenler.aktifKullaniciSayisi++;
		System.out.println("Aktif kullanıcı sayısı: " + SinifStatikDegiskenler.aktifKullaniciSayisi );
	}
	
	public static int aktifKullaniciSayisiniGetir() {
		return SinifStatikDegiskenler.aktifKullaniciSayisi;
	}
	
	
	public static void main(String[] args) {

		SinifStatikDegiskenler.aktifKullaniciSayisi++;
		SinifStatikDegiskenler.aktifKullaniciSayisi++;
		SinifStatikDegiskenler.aktifKullaniciSayisi++;
		System.out.println("Aktif kullanıcı sayısı: " + SinifStatikDegiskenler.aktifKullaniciSayisi );
		System.out.println("Aktif kullanıcı sayısı: " + aktifKullaniciSayisiniGetir());
		
	}

}
