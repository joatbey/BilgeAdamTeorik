package com.dorukbiyikli;

public class AlgoritmaKarmasikligi {

	public static void main(String[] args) {
		int islemAdedi = 100000;
		
		// 1. algoritmanın çalışma süresi hesaplanıyor.
//		long startTime = System.currentTimeMillis();		//1971 1 ocaktan itibaren milisaniye olarak sayıyor şimdiye kadar ve return ediyor. ...
//		// süre ölçmek istiyorum. başlangıç ve son zamanları alıp farka bakacağız.
//		String metin = "Hello";
//		for(int i = 0; i<islemAdedi; i++) {
//			metin= metin+i;   //yeni bir alan açıyor memoryde her seferinde ona atıyor
//			}
//		long endTime = System.currentTimeMillis();
//		System.out.println("işlem süresi: "+ (endTime-startTime)+ " milisaniye");
		// 5837 milisaniye çıktı
		
		// 2. algoritmanın çalışma süresi hesaplanıyor.
		long startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		for(int i = 0; i<islemAdedi; i++) {
			stringBuilder.append(i);  // ayni memory yerinde ki sayıyı değiştiriyor index mekanizmasıyla sadece
			}
		long endTime = System.currentTimeMillis();
		System.out.println("işlem süresi: "+ (endTime-startTime)+ " milisaniye");
		// 11 milisaniye çıktı
		
		
		
		
	}

}
