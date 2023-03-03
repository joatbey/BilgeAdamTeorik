package com.dorukbiyikli;

import java.util.Scanner;

public class Main {

	
	public static void hizKontrol(int hiz) {
		if(hiz>120) {
			throw new AsiriHizException("Asiri hiz yapılmak isteniyor...");
			
		}else {
			System.out.println("iyi yolculuklar");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz");
		int hiz = scanner.nextInt();
		
		//Main.hizKontrol(hiz); UNCHECKED EXCEPTIONLARDA JAVA BİZE BIRAKIYOR KONTROLU
		
		try {
			Main.hizKontrol(hiz);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); //Exception in thread "main" com.dorukbiyikli.AsiriHizException: Asiri hiz yapılmak isteniyor...
		}

		
		System.out.println("bye");
	}

}
