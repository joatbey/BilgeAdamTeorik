package com.dorukbiyikli;

import java.util.Scanner; // Scanner librarysini import et

public class KullanicidanVeriAlmaScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner bir class javanın kendi classı new ile Scanner sınıfının bir 
												// input Scanner classının bir objecti
												// System.in  ' IDEnin konsolundan al input alacak
		// f3 ya da fn+f3 ile bi classın üstüne gelip basarsan o classı açıyor 
		
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi1 = 0;
		sayi1 = input.nextInt(); //Scans the next token of the input as an int. sayi1'e input olarak girilen integerı atıyor  
		System.out.println("Girdiğiniz sayı: "+ sayi1 );  
		
		int sayi2 = sayi1*sayi1; // girilen sayi1i kullanarak sayi 2 hesaplıyor
		System.out.println("Girdiğiniz sayının karesi: " + sayi2 );
		
		
		int sayi3 = sayi1*sayi1*sayi1 ; 
		System.out.println("Girdiğiniz sayının küpü: "+ sayi3 );
		
		 
	}

}