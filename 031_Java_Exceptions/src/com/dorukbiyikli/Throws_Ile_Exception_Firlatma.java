package com.dorukbiyikli;

import java.sql.SQLException;
import java.util.Scanner;

public class Throws_Ile_Exception_Firlatma {

	// hiz değeri 120'den buyukse exception fırlatacağız
		public static void hizKontrol(int hiz) throws SQLException { // throws SQLException yazmam lazım
			
			
			if (hiz > 120) {
				throw new SQLException(); //SQLException bir checkedException olduğu için kontrolu zorunlu başına extra throws yazmamız gerekir... 
			} else {
				System.out.println("iyi yolculuklar...");

			}

		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz : ");
		int hiz = scanner.nextInt();

		//hizKontrol(hiz);//Unhandled exception type SQLException
		
		try {
			hizKontrol(hiz);
		} catch (SQLException e) {
			System.out.println("Çok hızlı gidiyorsun hızını azalt...");
			//e.printStackTrace();
		}
		
		
	}

}
