package com.dorukbiyikli;

public class DaireBaskani extends Personel{

	private String makamAdi;
	private long telSeriNo;
	private Mudur[] bagliMudurler;

	//constructor.
	public DaireBaskani(String ad, String soyad, String tcKimlik ,int yas , int maas , int kidemBilgisi , long cepTelNo, String makamAdi, long telSeriNo ) {
		//this.ad yazarsam erişemiyorum çünkü java kuralı bozmuyor. Personel bunun superclassı da olsa
		//encapsulation kullanmak zorundayiz. private yaziyoruz çünkü superclassta fieldlari
//		this.setAd(ad);
//		this.setSoyad(soyad);
//		this.setTcKimlik(tcKimlik);
//		this.setYas(yas);
//		this.setMaas(maas);
//		this.setKidemBilgisi(kidemBilgisi);
//		
		// yukaridaki satırlar yerine üst sınıfın constructorını çağırın:
		super(ad,soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo); // clean code
		//super();
		this.setTelSeriNo(telSeriNo);
		this.setBagliMudurler(bagliMudurler);
		this.setMakamAdi(makamAdi);
	}
	
	// method overRIDING
	public int getZamKatsayisi() {
		return 8 ; 
	}

	public String getMakamAdi() {
		return makamAdi;
	}

	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}

	public Mudur[] getBagliMudurler() {
		return bagliMudurler;
	}

	public void setBagliMudurler(Mudur[] bagliMudurler) {
		this.bagliMudurler = bagliMudurler;
	}

	@Override
	public String toString() {
		return "DaireBaskani [getMakamAdi()=" + getMakamAdi() + ", getTelSeriNo()=" + getTelSeriNo() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}

	
}
