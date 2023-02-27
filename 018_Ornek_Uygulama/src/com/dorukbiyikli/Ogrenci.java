package com.dorukbiyikli;

public class Ogrenci {

	private String ad;
	private String soyad;
	private int ogrenciNo;
	private int notOrtalaması;
	
	//constructor
	public Ogrenci(String ad, String soyad, int ogrenciNo, int notOrtalaması) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.ogrenciNo = ogrenciNo;
		this.notOrtalaması = notOrtalaması;
	}
	
	
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyad=" + soyad + ", ogrenciNo=" + ogrenciNo + ", notOrtalaması="
				+ notOrtalaması + "]";
	}

	//getter-setter
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public int getNotOrtalaması() {
		return notOrtalaması;
	}
	public void setNotOrtalaması(int notOrtalaması) {
		this.notOrtalaması = notOrtalaması;
	}
	
	
}
