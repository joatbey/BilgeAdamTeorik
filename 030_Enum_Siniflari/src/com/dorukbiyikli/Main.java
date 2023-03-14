package com.dorukbiyikli;

public class Main {
	public static void main(String[] args) {
		
		
		Main.ucusBilgileriniGoster(EUcusTipi.EKONOMIK);
		Main.ucusBilgileriniGoster(EUcusTipi.OZEL);
		Main.ucusBilgileriniGoster(EUcusTipi.VIP);
	}

	private static void ucusBilgileriniGoster(EUcusTipi ucusTipi) {
		System.out.println("Uçuş Tipi : "+ ucusTipi.getTip()+" Açıklama : "+ucusTipi.getMetin());
		
	}

}
