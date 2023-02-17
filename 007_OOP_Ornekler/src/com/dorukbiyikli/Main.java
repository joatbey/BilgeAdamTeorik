package com.dorukbiyikli;

public class Main {

	public static void main(String[] args) {
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "Audi";
		otomobil1.model = "A3";
		otomobil1.yil =  2012;
		otomobil1.aracinKm = 0;
		otomobil1.motor = new Motor();
		otomobil1.motor.motorHacmi = 1400;
		otomobil1.motor.motorNo = "AUDS1D1DSAD11";
		otomobil1.motor.yakitTuketimi = 7;
		
		otomobil1.bilgileriEkranaYaz();
		
		
		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = "Opel";
		otomobil2.model = "Astra";
		otomobil2.yil = 2017 ; 
		otomobil2.aracinKm = 0;
	
		otomobil2.motor = new Motor();
		otomobil2.motor.motorHacmi = 1600;
		otomobil2.motor.motorNo = "AKJHKLJASDSA11";
		otomobil2.motor.yakitTuketimi = 9;
		otomobil2.bilgileriEkranaYaz();
		
		
		otomobil1.araciSur(100); // otomobil1.aracinKm += 100 de diyebilirdik
		otomobil1.bilgileriEkranaYaz();
		otomobil1.araciSur(200);
		otomobil1.bilgileriEkranaYaz();
		 
		otomobil2.araciSur(500);
		otomobil2.bilgileriEkranaYaz();
		
		System.out.println();
		otomobil2.aracYilBilgisiDegistir(2018);
		otomobil2.bilgileriEkranaYaz(); // değiştirmedi this kullanmadan... this yil = yil 
		System.out.println();

		SUV jeep = new SUV();
		jeep.aracinKm = 200000;
		jeep.marka = "JEEP";
		jeep.model = "Cherokee";
		jeep.yil = 2020;
		jeep.motor = new Motor();
		jeep.motor.motorHacmi = 2000;
		jeep.motor.motorNo = "1809j2oı1";
		jeep.motor.yakitTuketimi = 14;
		jeep.bilgileriEkranaYaz();
		
		
		// motor nesnesi bağımsız üretme: 
		Motor m1 = new Motor();
		m1.motorHacmi = 1200;
		m1.motorNo = "aksdasd";
		m1.yakitTuketimi = 5;
		m1.motorBilgileriniYazdir();
		
		
		System.out.println();
		Otomobil temp ; 
		temp = otomobil2;
		temp.motor.motorHacmi = 1200;
		System.out.println(otomobil2.motor.motorHacmi); // ekrana 
		System.out.println(m1.motorHacmi);
		
	}

}
