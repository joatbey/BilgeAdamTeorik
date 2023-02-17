package com.alikaya;

public class MainAli {

	public static void main(String[] args) {
		Paralelkenar paralelkenar1 = new Paralelkenar();
		paralelkenar1.kenarUzun = 27;
		paralelkenar1.kisaKenar = 40;
		
		//paralelkenar1.isim = " Benim Paralelkenarım" ; buna da erişilemez.

		Ucgen ucgen1 = new Ucgen();
		ucgen1.kenar1 = 7;
		ucgen1.kenar2 = 8;
		ucgen1.kenar3 = 9;
		System.out.println("ucgen1 cevresi: " + ucgen1.ucgenCevresi());
		
		Ucgen ucgen2 = new Ucgen();
		ucgen2.kenar1 = 70;
		ucgen2.kenar2 = 80;
		ucgen2.kenar3 = 90;
		System.out.println("ücgen2 cevresi: "+ ucgen2.ucgenCevresi());
		
		ucgen1.kenarlariUzat(10); // ayni package içinden ulaşılabiliyor yani 
		// kenarlariUzat() methodu alinin paketine ucgen classında
		System.out.println("ucgen1 cevresi: " + ucgen1.ucgenCevresi());

		
		
	}

}
