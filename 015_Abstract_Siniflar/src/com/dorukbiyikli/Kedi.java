package com.dorukbiyikli;


public class Kedi extends Hayvan {// classı yazarken superclassı olarak Hayvan yaptık.

	
	public void sesCikar() {
		System.out.println("Miyav Miyav!");
	}

	public Kedi(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
	}

	@Override
	public String toString() {
		return "Kedi [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunluk()=" + getUzunluk() + "]";
	}

	@Override
	public void yemekYe() {
		System.out.println("Kedi mama yiyor.");
		
	}

	public void sutIc() {
		System.out.println("Kedi sut içiyor...");
	}
	
}
