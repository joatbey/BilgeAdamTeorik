package com.dorukbiyikli;

public class UncheckedExceptionsMain {

	public static void main(String[] args) {
		// Unchecked Exceptionları Programcının ongormesi ve kontrol etmesi lazim.
		// Java bu tarz exceptionlar uzerinde hata veya uyarı vermez.
		// Bunlar runtime exception sınıfından türerler...

		String s = null;
//		System.out.println(s.length()); // uyarmadı ama null pointer exception alırız...

		// try catch ile yapaplm..

		try {
			System.out.println(s.length()); // try catch ile programı çökertmedi yalnız try kısmı içindeki kodu sanki
											// commentlemiş gibi oldu...
		} catch (Exception e) {// Null Pointer Exception da yazabilirdik açık açık ya da üst sınıfı olan
								// Runtime Exception ya da daha üst sınıf olan Exception...
			System.out.println("hatayı yakaladık..."); // loga yazarsın bunu ne hatası olduğuyla birlikte ki maintenance
														// yaparken bunları görebilsin yazılımcılar...
		}

		System.out.println("programın sonu");

	}

}
