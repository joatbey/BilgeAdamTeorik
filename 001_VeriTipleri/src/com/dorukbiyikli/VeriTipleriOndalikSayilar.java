package com.dorukbiyikli;

public class VeriTipleriOndalikSayilar {

	public static void main(String[] args) {
		//float : 4 Byte
		//Precision (noktadan sonraki hassasiyet): 7 decimal digits
		//Bilimsel hesaplamalarda kullanırsanız veri kaybedebilirsiniz sonuç yanlış çıkabilir.
		
		float floatValue = 1.2f;
		System.out.println("floatValue:" + floatValue);
		System.out.println("float min:" + Float.MIN_VALUE);
		System.out.println("float max:" + Float.MAX_VALUE);
		floatValue = 22.4f ;// ondalık sayılarda default atama sağ taraf değeri 'double' olarak atar.float olduğunu f ile belirtiyoruz
							// integer kabul etmesi gibi sağ tarafı otomatik olarak ondalıkta da sağı double olarak otomatik kabul ediyor.
		double doubleValue = 1.2 ; // double 8 Byte, precision 15 decimal 
		System.out.println("Double Min:" + Double.MIN_VALUE );
		System.out.println("Double Max:" + Double.MAX_VALUE );
		
	
		doubleValue = 2345.55778;
		doubleValue = 12.334e8; // bunu 1.2334e9 olarak print edecek 
		System.out.println(doubleValue);
		//örnek:
		doubleValue = 23.123456789;
		floatValue = (float) doubleValue; // double Value'yı floata çevir floatValue olarak tut
		System.out.println(floatValue); // 23.123457 yazdı hassasiyeti 7 digit tutmadı float
		floatValue = 1.1234567F;		//  1.1234567 yazdı 7 digit tuttu
		System.out.println(floatValue);
	
		String kusuratliSayi = String.format("Sayı: %.2f", floatValue); // %.2f yazip kac digit istiyorsan precision o böyle oluyor. f de floatun f'si
		System.out.println(kusuratliSayi);
	
		final double PI = 3.14; // başında final kullanılırsa PI değişken değil, sabit. Constant olur const değiştirilemez bi daha. sabit olur.
		
	}
	

}
