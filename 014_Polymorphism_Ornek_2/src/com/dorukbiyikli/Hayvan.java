package com.dorukbiyikli;

public class Hayvan {
	private String ad;
	private int kilosu;
	private int uzunluk;
	
	
	public Hayvan(String ad, int kilosu, int uzunluk) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunluk = uzunluk;
	}



	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunluk=" + uzunluk + "]";
	}



	public void sesCikar() {
	
		
	}
	
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getKilosu() {
		return kilosu;
	}
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	public int getUzunluk() {
		return uzunluk;
	}
	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	
	

}
