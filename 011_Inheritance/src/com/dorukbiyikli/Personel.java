package com.dorukbiyikli;

public class Personel {

	// tüm diğer classlarda bunlar var şimdi zaten...
	// bu sınıfı ust sınıf / ata sınıf / parent sınıf olarak adlandırabiliriz...
	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;

	//constructorları yapalım:
	//constructor yapıcı method...
	
	public Personel() {
		System.out.println("Personel sınıfının 1 nolu Constructoru çağırıldı...");
		
	}
	
	public Personel(String s , int y ) {// personelde çift parametreli 
		System.out.println("Personel sınıfının 2 nolu Constructoru çağırıldı...");
		
	}
	
	
	
	// getter-setterlarını da yapalım...
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

	public String getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public int getKidemBilgisi() {
		return kidemBilgisi;
	}

	public void setKidemBilgisi(int kidemBilgisi) {
		this.kidemBilgisi = kidemBilgisi;
	}

	public long getCepTelNo() {
		return cepTelNo;
	}

	public void setCepTelNo(long cepTelNo) {
		this.cepTelNo = cepTelNo;
	}

}
