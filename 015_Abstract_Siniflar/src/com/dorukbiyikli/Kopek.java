package com.dorukbiyikli;


public class Kopek extends Hayvan {
	
	public Kopek(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);

	}
	@Override
	public String toString() {
		return "getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunluk()=" + getUzunluk() + "]";
	}

	public void sesCikar() {
		System.out.println("Hav Hav!");
	}

	

	@Override
	public void yemekYe() {
		System.out.println("Köpek kemik yiyor...");
		
	}

}
