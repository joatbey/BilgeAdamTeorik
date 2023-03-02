package com.dorukbiyikli;

public class MainEnumOrnek {

	enum Size{
		LOW,
		MEDIUM,
		HIGH,
	}
	
	
	enum Mevsimler{ // ; değil , ile 
		ILKBAHAR,
		YAZ,
		SONBAHAR,
		KIS,
	}
	//enumlar bizi aşağıdaki gibi tek tek static değişken tanımlama zahmetinden kurtarır. Çünkü enum değerleri static ve finaldır.
	
	public static final int LOW =1 ;
	public static final int MEDIUM =2 ;
	public static final int HIGH =3 ;
	
	public static void ekranaYaz(Mevsimler m) {
		System.out.println(m);
	}
	
	
	public static void main(String[] args) {
		
	//enumlardan nesne turetilmez
	
	
	Size size = Size.HIGH;
	size = Size.MEDIUM;
	System.out.println(size);
	
	for(Size s: Size.values()) {
		System.out.println(s);
	}


	// enum'lar nerelerde kullanılır?
	// Değişmeze değerlerini varsa kullanırsınız
	// Meslea ilkbahar, yaz, v.b.
	Size beden = size.MEDIUM;
	if (beden == size.MEDIUM)
	{
		System.out.println("Orta-M beden");
	}
	
	// Enum'lar sayeisnde parametre gönderimi daha hızlı ve doğru olur.
	MainEnumOrnek.ekranaYaz(Mevsimler.SONBAHAR);
	
}
}
