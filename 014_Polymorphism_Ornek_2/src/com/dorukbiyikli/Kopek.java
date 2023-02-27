package com.dorukbiyikli;

public class Kopek extends Hayvan {

	@Override
	public String toString() {
		return "getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunluk()=" + getUzunluk() + "]";
	}

	public void sesCikar() {
		System.out.println("Hav Hav!");
	}

	public Kopek(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);

	}

}
