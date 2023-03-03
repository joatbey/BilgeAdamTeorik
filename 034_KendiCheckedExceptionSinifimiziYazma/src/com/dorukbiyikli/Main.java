package com.dorukbiyikli;

import java.util.Scanner;

public class Main {

	
	public static void hizKontrol(int hiz) throws AsiriHizException { // checked exceptionlarda bunu yazdırmak gerekiyor...
		if(hiz>150) {
			throw new AsiriHizException("Çoook Asiri hiz yapılmak isteniyor...");
			
		}else if(hiz>120){
			throw new AsiriHizException("Aşırı hız yapılmak isteniyor...");
		}
		
		else {
			System.out.println("iyi yolculuklar");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz");
		int hiz = scanner.nextInt();
		
		try {
			hizKontrol(hiz);
		} catch (AsiriHizException e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); // detayı böyle yazıyoruz 150den fazlası için
		}

	}

}
