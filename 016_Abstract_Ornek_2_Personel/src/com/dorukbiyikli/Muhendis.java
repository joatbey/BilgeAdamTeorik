package com.dorukbiyikli;

public class Muhendis extends Personel{
	
	private String uzmanlikAlani;
	
	public Muhendis() {
		
	}
	
	
	
	public Muhendis(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo, String uzmanlikAlani) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.uzmanlikAlani =uzmanlikAlani;
		}

	// method overRIDING
		public int getZamKatsayisi() {
			return 3;
		}

	@Override
	public String toString() {
		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + ", getUzmanlikAlani()=" + getUzmanlikAlani() + ", getAd()="
				+ getAd() + ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + "]";
	}



	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}

}
