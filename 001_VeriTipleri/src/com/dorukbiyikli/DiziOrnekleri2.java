package com.dorukbiyikli;

import java.util.Scanner;

public class DiziOrnekleri2 {

	public static void main(String[] args) {
		// Soru: 
		// Kullanıcı bir sayı girsin consoledan
		// bu sayının binary olup olmadığını bulan bir program yazınız.
		// ornek: 101010 binary, 123 binary değil
		System.out.println("Lütfen bir sayı giriniz: ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		boolean sayiBinaryMi = true;
		String temp= String.valueOf(sayi); // stringe çevirdik
		for(int i = 0 ; i < temp.length(); i++) {
			char rakam = temp.charAt(i); // stringşn i. indeksindeki karakterleri bir char rakam tanımladık atadık tek tek .
			if(rakam !=0 || rakam!= 1) { // ilkel veri tipi olduğu için== ile kontrol edebiliyoruz equals ile değil
				sayiBinaryMi = false;
				break;
			
			}
			else {				
			}
			
			
			
		}

		
		if (sayiBinaryMi == true) {
			System.out.println("BINARY");

		} else {
			System.out.println("BINARY DEĞİL");

		}	
		
			// bunu tekrar çöz
		
	}

}
