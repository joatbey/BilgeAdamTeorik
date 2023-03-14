package com.dorukbiyikli;

import java.util.Scanner;

public class Main1 {

	// TRY-CATCH BLOKU
	/*
	 * try {
	 * 
	 * } catch (Exception e) { // TODO: handle exception }
	 */

	public static void main(String[] args) {

		// 1. Bölüm

		// int y=5/0; //Exception in thread "main" java.lang.ArithmeticException: / by
		// zero

		try {
			int y = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme hatası");
		}

		// 2. Bölüm
		System.out.println();
		int[] array = new int[57];
		// System.out.println(array[5]); //Exception in thread "main"
		// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

		try {
			System.out.println(array[57]);
		} catch (Exception e) {
			System.out.println("Array sınıfının dışına çıkma hatası\n");
			e.printStackTrace();// java.lang.ArrayIndexOutOfBoundsException: Index 57 out of bounds for length
								// 57at com.dorukbiyikli.Main.main(Main.java:34)
			String logaYazilacakMesaj = e.toString();
			System.out.println(logaYazilacakMesaj);// java.lang.ArrayIndexOutOfBoundsException: Index 57 out of bounds
													// for length 57

		}

		
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		// 3. Bölüm 
		// Birden çok exception yakalama
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bölen sayıyı giriniz...");
		int bolen = scanner.nextInt();
		
		try { 
			int sayi = 25/ bolen;
			int[] array2 = { 1,2,3,4 };
			System.out.println(array2[7]);
			// ayrı ayrı yakalayıp loga yazmak tavsiye olunur...
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ARRAYIN SINIRLARI DIŞINA ÇIKILIYOR");			 // bu kesin hata
		} 
		catch (ArithmeticException e) {
			System.out.println("0'a bölme hatası ");							// bu sıfır olursa hata verecek 
		}
		catch (Exception e) {
			System.out.println("Tahmin edilemeyen bir hata oluştu.");			// bu iyi bişi çünkü anlamadığın bi hata varsa program patlamasın bişi oldu ama anlamadık diye devam etsin.
			e.printStackTrace();
		}
		
		// ilk hata nerede bulacak eğer 0 a bölünüyorsa  55. satırda .
		// onun artihmetic exceptionuna girer
		
		// herhangi bir catche girince diğerlerine girmez...
		
		
		// HATAYI EĞER TRYIN DIŞINDA ALIRSAN MESELA YUKARDA NEXTINT DERKEN STRİNG VERİRSE KULLANICI.... 
		// ORADA TRY CATCH OLMADIĞI İÇİN EXCEPTION YAKALAYAMAZSIN
		
		System.out.println("\nHoşçakalın");
	}

}
