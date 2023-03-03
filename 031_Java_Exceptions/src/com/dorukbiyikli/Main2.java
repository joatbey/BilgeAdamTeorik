package com.dorukbiyikli;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 4. Bölüm 
				
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Lütfen bölen sayıyı giriniz...");
				int bolen = scanner.nextInt();
				String s = null;
				try {
					int sayi = 25/ bolen;
					int[] array2 = { 1,2,3,4 };
					System.out.println(array2[2]);
					
					System.out.println(s.length()); // null pointer exceptionu explicit olarak gormek için ayrı bir catch yazacağız.
				
					
				}
				catch (NullPointerException e) {
					System.out.println("NULL POINTER EXCEPTION");
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ARRAYIN SINIRLARI DIŞINA ÇIKILIYOR");			 // bu kesin hata
				} 
				catch (ArithmeticException e) {
					System.out.println("0'a bölme hatası ");							// bu sıfır olursa hata verecek 
				}
				catch (Exception e) {
					System.out.println("Tahmin edilemeyen bir hata oluştu.");			// 
				}
				
			
				
				System.out.println("\nHoşçakalın");

	}

}
