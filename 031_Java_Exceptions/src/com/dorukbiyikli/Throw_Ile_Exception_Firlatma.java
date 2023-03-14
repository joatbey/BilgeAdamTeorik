package com.dorukbiyikli;

import java.util.Scanner;

// throw ile throws farklı... 
// throw ile unchecked exception fırlatıyoruz. o yüzden runtimeda oluyor


public class Throw_Ile_Exception_Firlatma {
	
	
	// hiz değeri 120'den buyukse exception fırlatacağız
	public static void hizKontrol(int hiz) { // kendimiz de exception throw edebiliyoruz...
		
		
		if (hiz > 120) {
			throw new ArithmeticException(); // şimdilik javanın bi exceptionunu kullanıyoruz. Sonra kendi exception	// unchecked exception
												// sınıfımızı da yazacağız...
		} else {
			System.out.println("iyi yolculuklar...");

			// Arabanın hızını parametre olarak gelen değere yükselt falan...

			// veya sıcaklıkla ilgili işlemlerinizi yapın...
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz : ");
		int hiz = scanner.nextInt();

		//
		// hizKontrol(hiz); // 120den buyuk değer girince program coktu. bilerek yaptık
		// bunu...
		
		// throw ile atılan exceptionlarda try catch yazmayabilirsiniz ama bu durumda exception yenildiğinde exception çöker...
		try {
			hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Lütfen hızını azalt çok hızlı gidiyorsun...");
		}

		
		System.out.println("Hoşçakal....");
	}
	

}
