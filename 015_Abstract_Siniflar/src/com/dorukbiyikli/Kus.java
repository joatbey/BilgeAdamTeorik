package com.dorukbiyikli;


public class Kus extends Hayvan {
	public Kus(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
	}

	@Override
	public String toString() {
		return "getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunluk()=" + getUzunluk() + "]";
	}

	public void sesCikar() {
		System.out.println("Cik Cik!");
	}

	
	@Override
	public void yemekYe() {
		System.out.println("Kus buğday yiyor");
		
	}

}
