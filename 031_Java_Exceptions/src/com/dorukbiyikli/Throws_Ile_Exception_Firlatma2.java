package com.dorukbiyikli;

import java.sql.SQLException;
import java.util.Scanner;

public class Throws_Ile_Exception_Firlatma2 {

	public static void hizKontrol(int hiz) throws SQLException { 
		
		
		if (hiz > 120) {
			throw new SQLException(); //SQLException bir checkedException olduğu için kontrolu zorunlu başına extra throws yazmamız gerekir... 
		} else {
			System.out.println("iyi yolculuklar...");

		}

	}
	
	
	// main metod basliginda throws ile exception atması api olarak bizim kodumuzu kullanacak kişinin yakalaması içindir...
	public static void main(String[] args) throws SQLException { // yazılımı başkası kullanacaksa o yakalasın diye exceptionu boyle yapılır.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz : ");
		int hiz = scanner.nextInt();
		
		hizKontrol(hiz);
	}

}
