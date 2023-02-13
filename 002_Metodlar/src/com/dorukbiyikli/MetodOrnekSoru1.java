package com.dorukbiyikli;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnekSoru1 {

//	private static void randomNumber7(int ustLimit) {
//		Random random = new Random();
//		long startTime = System.currentTimeMillis();
//
//		for (int i = 0; i < 10; i++) {
//			int result = random.nextInt(ustLimit / 7 + 1); // integer bölümü yaptığı için örneğin 70de 10 , 77de 11
//															// verecek ve bu random.nextInt
//															// methodu 0ı include ediyor specified valueyı etmiyor yani
//															// 11 yazarsa 10 a kadar yapacak 70 verecek max. +1 o yuzden geliyor.
//			result = result * 7;
//			System.out.println(result + " ");
//
//		}long endTime = System.currentTimeMillis();
//		System.out.println("işlem süresi: "+ (endTime-startTime)+ " milisaniye");//işlem süresi: 26717 milisaniye 10 milyon için
//
//		
//	}

	public static void randomNumber7() { // for içinde do while döngüsü 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen üst limiti giriniz: ");
		int ustLimit = scanner.nextInt();

		Random random = new Random();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) { // kaç sayı yapacağı belli , for döngüsü
			int result = 1;
			
			do {
				result = random.nextInt(ustLimit); // belli olmayan yerde sürekli dönsün while içinde 
			} while ((result % 7) != 0);
			System.out.println("sayı " + i + ": " + result);
		}long endTime = System.currentTimeMillis();
		System.out.println("işlem süresi: "+ (endTime-startTime)+ " milisaniye");//işlem süresi: 30596 milisaniye 10milyon için

	}

	public static void main(String[] args) {
		// Rastgele 7'nin katı olan 10 tane tam sayı üreten ve ekrana yazdıran bir
		// method yazınız.
		// üstlimiti parametre olarak kullanıcıdan alın.

		randomNumber7(); // burada method overriding yaptım ilk algoritmada

	}

}
