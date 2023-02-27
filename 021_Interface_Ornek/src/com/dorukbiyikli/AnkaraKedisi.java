package com.dorukbiyikli;

public class AnkaraKedisi extends Hayvan{

	
	
	public AnkaraKedisi(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		
	}

	@Override
	public void sesCikar() {
		System.out.println("Miyav la");
	}

	@Override
	public void yemekYe() {
		System.out.println("Kedi" + this.getAd() + " bira içiyor...");
	}

}
