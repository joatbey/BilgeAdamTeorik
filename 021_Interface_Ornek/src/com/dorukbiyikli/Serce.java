package com.dorukbiyikli;

public class Serce extends Hayvan implements IUcabilir{

	public Serce() {
		// TODO Auto-generated constructor stub
	}

	public Serce(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("cik cik cik");

	}

	@Override
	public void yemekYe() {
		System.out.println("Serce " + this.getAd() + " yem yiyor...");

	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adlı serce saniyede 15 kez kanat çırpıyor...");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adlı serce kanatlarını temizliyor...");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adlı serce küçük gagasıyla " + nesne + " gagalıyor...");
		
	}

}
