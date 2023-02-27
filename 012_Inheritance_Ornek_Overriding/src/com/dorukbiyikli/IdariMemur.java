package com.dorukbiyikli;

public class IdariMemur extends Personel {

	// bu ikisi sadece bu classa ait fieldler bunlar
	private String gorevi;
	private long telSeriNo;

	// getter setter methodları oluşturdum otomatik olarak.
	// burada da sadece bu sınıfa ait olan getter-setterlar kalsın

	public IdariMemur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.gorevi = gorevi;
		this.telSeriNo = telSeriNo;
	}
	
	// method overRIDING
	public int getZamKatsayisi() {
		return 2;
	}

	@Override
	public String toString() {
		return "IdariMemur [gorevi=" + gorevi + ", telSeriNo=" + telSeriNo + ", getAd()=" + getAd() + ", getSoyad()="
				+ getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas() + ", getMaas()="
				+ getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()=" + getCepTelNo() + "]";
	}

	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

}
