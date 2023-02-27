package com.dorukbiyikli;

public class Main {

	public static void main(String[] args) {
		//elli tane üye değişken olsa elle mi yazacağız ? 
		//constructor ile yapacağız...
		
//		Motor motor = new Motor(); // bi parametreli constructor yapmıştık, o olduğu için bu blok hata veriyordu(açıklaması motorun içinde). bir de boş constructor yazınca kurtardı.
//		motor.setMotorHacmi(1400);
//		motor.setMotorHacmi(10);
//		
	Motor motor = new Motor(1400," asdsad1sdaf", 10);
	System.out.println(motor);
	
	Motor motor2 = new Motor(150000, "vaasdas11e", 2); // burada 150000 malca bi değer böyle durumlarda hata versin istiyoruz hep...
	// consept hatası bu. yazılımsal syntax hatası değil oop hatası değil ama problem bu. 
	// bu hatayı set motorHacmi derken kontrol ediyorduk ...
	// yine aynı şekilde o methodu kullanalım 
	
	System.out.println(motor2);
	
	
	System.out.println();
	
	Otomobil otomobil1 = new Otomobil("BMW","1.18",2020,57500,motor2);
	Otomobil otomobil2 = new Otomobil("Renault","Clio", 2017, 120000, new Motor(1200, "SWERDSF", 8)); 
	System.out.println(otomobil1);
	System.out.println(otomobil2);
	System.out.println(otomobil2.getMotor().getMotorHacmi());
	otomobil2.getMotor().setMotorHacmi(1208);
	System.out.println(otomobil2.getMotor().getMotorHacmi());

	Otomobil otomobil3 = new Otomobil(	" Fiat " , "Egea ");
	System.out.println(otomobil3); // Otomobil [marka= Fiat , model=Egea , yil=0, aracinKm=0, motor=null]
	
	otomobil3.setMotor(new Motor(2000, " adsadsdpkmsad" , 7)); // yeni bir motor oluşturup atadık
	System.out.println(otomobil3.getMotor());
	
	System.out.println(otomobil3);
	
	
	// Son ornek : 
	System.out.println();
	Otomobil otomobil5 = new Otomobil("Skoda", "Superb", 2021, 57500 , 1500, "asdsadassafs" ,8) ; 
	System.out.println(otomobil5); // böyle yazabilmemizin sebebi otonobil classına toString methodu koymamız...
	}
	

}
