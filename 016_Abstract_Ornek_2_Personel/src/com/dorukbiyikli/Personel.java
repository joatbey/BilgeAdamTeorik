package com.dorukbiyikli;

// bu arada final deseydim 
// public final class Personel deseydim. IdariMemur Muhendis Mudur vs gibi sınıflar buradan extend edemezdi.

// final olan bir sınıftan miras alınamaz yani inheritance yapılamaz. 
// buna da dikkat et.
//

public class Personel {
	
	//public static final int dunyaninCevresi = 40000;// global variable yok javada ama bu öyle davranıyor.
	
	
	
	private String ad;
	private String soyad;
	private String tcKimlik;
	private int yas;
	private int maas;
	private int kidemBilgisi;
	private long cepTelNo;

	
	public Personel() {
//		System.out.println("Personel sınıfının 1 nolu Constructoru çağırıldı...");
		
	}
	
	public Personel(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tcKimlik = tcKimlik;
		this.yas = yas;
		this.maas = maas;
		this.kidemBilgisi = kidemBilgisi;
		this.cepTelNo = cepTelNo;
	}


	public int getZamKatsayisi() {
		return 1 ; 
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
