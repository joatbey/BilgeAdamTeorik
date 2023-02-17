package com.dorukbiyikli;

public class Anahtar {
	//SINIF : CLASS (TASARIM)
	
	//statik değişken
	// statik değişkenler classa özgüdür tüm nesneleri ilgilendirir o classtan türeyen 
	public static int uzunluk =10 ;
	
	//özellik / üye değişken
	public String renk; 
	public int no;
	public String ad;

	//static üye metod
	public static void uzunluguEkranaYaz() {
		System.out.println(Anahtar.uzunluk);
		System.out.println(uzunluk);// aynı classtaki method oldugu için böyle de olur
		// static metodlar içinde static olmayan değişkenler yazılamaz

		//System.out.println(Anahtar.renk);	 hata verir. çünkü statik olmayan bir üye özellik 
	}
	
	// non statik üye method: 
	public void bilgilerEkranaYaz() {
		System.out.println("no: "+ no+ " ad: " + ad + " renk: "+ renk );
		// non static üye methodlar class adi ile çağrılıyor.
		// mesela Anahtar.bilgilerEkranaYaz() şeklinde...
	}
	
	
}
