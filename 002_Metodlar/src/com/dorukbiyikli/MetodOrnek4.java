package com.dorukbiyikli;

import java.util.Arrays;
import java.util.Scanner;

public class MetodOrnek4 {

	private static long dikdortgenAlanHesapla(long kisaKenar, long uzunKenar) {
		return (kisaKenar*uzunKenar);
		
	}
	
	private static int kareAlanHesapla() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen karenin kenarını giriniz: ");
		int kenar = input.nextInt();
		return (kenar*kenar);
		
	}
	
	public static void main(String[] args) {
		//Soru: Dikdörtgenin alanını hesaplayan bir metod yazınız :
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen uzun kenarı giriniz: ");
//		long uzunKenar = input.nextLong();
//		System.out.println("Lütfen kısa kenarı giriniz: ");
//		long kisaKenar = input.nextLong();		
//		
//		System.out.println("Alan= " + dikdortgenAlanHesapla(kisaKenar,uzunKenar));
		System.out.println("Karenin alanı: "+ kareAlanHesapla());
		//Soru2: 
		// N tane kare alanı tutan bir dizi oluşturun...(int arrayı)
		// Bu dizilerdeki her bir değer için kullanıcıdan kare kenar uzunlukları alıp alanlarını hesaplayıp dizide saklayın
		Scanner input = new Scanner(System.in);
		System.out.println("Kaç tane kare alanı dizide tutmak istersiniz?  ");
		int n = input.nextInt();
		System.out.println();
		int[] kareAlanlariDizi = new int[n] ; // {0,0,0} oluşturuyor heapde
		for (int i = 0 ; i <n ; i++ ) {
			kareAlanlariDizi[i] = kareAlanHesapla();
		}
		
		for (int i =0; i<n;i++) {
		System.out.println(i+". karenin alanı: "+ kareAlanlariDizi[i] ); // dizileri ya böyle tek tek yazacaksın, ya print kullanıp , ile falan yanyana
		}
		
		System.out.println(Arrays.toString(kareAlanlariDizi));// ya da bu Arrays Classindaki toString methodunu çağırarak...
		
		
	}

}
