package com.dorukbiyikli;

public class Sekreter extends Personel {

	private long tel1SeriNo;
	private long tel2SeriNo;

	//hicbir constructor yazamasak da direkt sunu oluşturuyor java: 
	public Sekreter() {
		super(); // biz bunu yazmasak da java buraya gorunmez bi super() çağrısı ekler.
	}

	public Sekreter(String ad, String soyad, String tcKimlik ,int yas , int maas , int kidemBilgisi , long cepTelNo, String makamAdi, long telSeriNo ) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.tel1SeriNo = telSeriNo;
		this.tel2SeriNo = tel2SeriNo;
		
	}
	// method overRIDING
		public int getZamKatsayisi() {
			return 2;
		}
	@Override
	public String toString() {
		return "Sekreter [tel1SeriNo=" + tel1SeriNo + ", tel2SeriNo=" + tel2SeriNo + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

	public long getTel1SeriNo() {
		return tel1SeriNo;
	}

	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}

	public long getTel2SeriNo() {
		return tel2SeriNo;
	}

	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}

}
