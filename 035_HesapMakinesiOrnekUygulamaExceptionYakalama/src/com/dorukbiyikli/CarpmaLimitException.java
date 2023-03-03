package com.dorukbiyikli;

public class CarpmaLimitException extends Exception{

	@Override
	public void printStackTrace() {
		System.out.println("iki çok buyuk sayı çarpılmak isteniyor daha kucuk sayılar giriniz!");
	}

}
