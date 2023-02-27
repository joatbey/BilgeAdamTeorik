package com.dorukbiyikli;

public class GoldenRetriever extends Hayvan implements IYirticiHayvan {

	
	


	public GoldenRetriever(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("HavHav");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek "  + this.getAd() + " kemik yiyor...");
	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd()+" isimli Golden " + nesne + " ye dişleriyle saldırıyor...");		
		
	}

}
