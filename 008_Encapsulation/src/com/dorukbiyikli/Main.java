package com.dorukbiyikli;

public class Main {

	public static void main(String[] args) {

		Motor motor = new Motor();
		//motor.motorHacmi = 1400;
		motor.setMotorHacmi(1400);
		//motor.motorNo = "sdfadad";
		//motor.yakitTuketimi = 10;
		motor.setYakitTuketimi(10);
//		motor.motorNo = "asdasdasdadas"; // bunu değiştiremezsin dünyada normalde bunu değiştirilemeyen bi halde yazalım...
//		 private yaparsan buradan erişemeyiz 
//		The field Motor.motorHacmi is not visible
//		The field Motor.motorNo is not visible
//		The field Motor.yakitTuketimi is not visible
//		The field Motor.motorNo is not visible
	
		// peki nasıl değiştireceğim belki yakıt tüketimini değiştirmem lazım 
		//private üye değişkeni nasıl değiştrieceğiz ? 
		
		
		System.out.println(motor); // toString varsa direkt çağırabiliyor!
		
		Otomobil otomobil1 = new Otomobil();
		otomobil1.setAracinKm(0);
		otomobil1.setMarka("Opel");
		otomobil1.setModel("Insignia");
		otomobil1.setYil(2023);
		
		Motor motor1 = new Motor();
		motor1.setMotorHacmi(1500);
		motor1.setYakitTuketimi(10);
		
		otomobil1.setMotor(motor1); // motorunu taktık
		
		System.out.println(otomobil1); // objeyi böyle yazdırabiliryorum çünkü otomobil classı içine toString methodu yazdık.
		
		Motor motor2 = new Motor();
		motor2.setMotorHacmi(1800);
		motor2.setYakitTuketimi(12);
		otomobil1.setMotor(motor2);
		
		System.out.println("motor değiştikten sonra: ");
		System.out.println(otomobil1);
		
		// 
		System.out.println();
		System.out.println(motor1.getMotorHacmi());
		System.out.println(otomobil1.getMotor().getMotorHacmi()); // otomobil1.motor.motorHacmi diyerek eriştirtmez çünkü private tanımladık. access modifiers kullandik.
		//
		System.out.println();//
		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.setAracinKm(100);
		otomobil2.setMarka("Audi");
		otomobil2.setModel("A3");
		otomobil2.setYil(2012);
		
		System.out.println(otomobil2.getMotor()); // null yazdı daha motor takmadan istedik diye ama exception da yemedik
		//otomobil2.getMotor().setMotorHacmi(1400); // bu null pointer exception verecektir Exception in thread "main" java.lang.NullPointerException
		Motor m = null ;
		otomobil2.setMotor(m); 		// The local variable m may not have been initialized diyor üst satırda null demezsek. null demenin avantaji setMotorun içinde null kontrolü yapabilirz
		//otomobil2.getMotor().setMotorHacmi(1400);
		m = new Motor();
		
		otomobil2.setMotor(m);
		
		otomobil2.getMotor().setMotorHacmi(1400);

		System.out.println("oto2 mot hacmi: " + otomobil2.getMotor().getMotorHacmi());
		
		
		
	}

}
