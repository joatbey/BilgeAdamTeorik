package com.dorukbiyikli;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
	
	
	public static void nemGoster(INemOlcer nemOlcer) {
		System.out.println(nemOlcer.nemOlc()); // tek methodla yaptık generic bir meto
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) { // tarigSaatGosterenCihaz da polymorphism var bu hem arzum hem casio olabilr.
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + " " + tarihSaatGosterenCihaz.saatGoster());
	
	}
	
	//Interfaceler abstraction sağlar.
	public static ITermometre termometreOlustur() {
		//ITermometre termometre = new Arzum(); // arzum 22 ,simbo 27 // buraya mesela değiştireceğim simbo yapacağım o zaman aynı kod aşağıda 27 yazar...
		ITermometre termometre = new Simbo();
		//Arzum termometre = new Arzum(); sol tarafta böyle de yazılabilir.
		return termometre;
	}
	
	
	public static void main(String [] args) {
		
	Arzum arzum = new Arzum() ; 
	
	System.out.println(arzum.sicakligiOlc());
	
	ITermometre termometre = new Simbo();
	
	System.out.println(termometre.sicakligiOlc());
	
	
	Simbo simboCihaz = new Simbo();
	simboCihaz.sicakligiOlc();
	simboCihaz.nemOlc();
		
		Main.nemGoster(simboCihaz);
		Main.nemGoster(arzum);

		Casio casio = new Casio();
		
	//	Main.nemGoster(casio);  // nem ölçme özelliği yok bunun
	// yani casio sınıfı INemOlcer interfaceini implement etmiyor.
	System.out.println("*****************************");
	
	ITermometre term = Main.termometreOlustur(); // kütüphaneyi değiştirdiğinde 
	System.out.println(term.sicakligiOlc());
	
	// javada genelde inheritanceden ziyade interfaceler ile çalışılacak.
	 // testlerde inheritance falan çıkar ama bu interface işini iyi anlaman lazım ...
	}
	
}
