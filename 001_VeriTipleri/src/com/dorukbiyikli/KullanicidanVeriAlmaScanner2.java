package com.dorukbiyikli;

import java.util.Scanner;

public class KullanicidanVeriAlmaScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen adınızı yazınız: ");
		String isim;
		isim = input.nextLine();
		String soyisim;
		System.out.println("Lütfen soyadınızı yazınız: ");
		soyisim = input.nextLine();
		System.out.println("İsminiz : "+ isim);
		System.out.println("Yaşınızı giriniz : ");
		int yas = input.nextInt();
		
		// DİKKAT! nextInt ile integer aldıktan sonra enter yapınca bi hata var. bi sonra sorduğumuz sehir stringi boş almışız gibi oldu.
		// nextFloatla falan da herhangi bir sayı alma yöntemi ile de olur bu sorun
		// boş bir nextLine alın bunu çözmek için
		
		input.nextLine(); //
		
		System.out.println("Yaşadığnız şehri yazınız: ");
		String sehir = input.next();
		System.out.println("isminiz : "+ isim + " soyadınız : "+ soyisim + " yaşınız: "+ yas + " şehir: "+ sehir  );
		
		// Stringden inte çevirmek için ilgili veri tipinin wrapper classı kullanılır.
		String yas2 = "30";
		int yasIntValue = Integer.valueOf(yas2);
		System.out.println(yasIntValue);
	
		
		
		
		
		
		
	}

}
