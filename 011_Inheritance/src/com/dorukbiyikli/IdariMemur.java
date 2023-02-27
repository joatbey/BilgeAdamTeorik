package com.dorukbiyikli;
// extedns Personel : IdariMemur sınıfı personel sınıfının bir alt sınıfıdır.
//extend etmek miras almak kalıtımla özelliklerini taşıyor olmak anlamına geliyor:

// personel classı IdariMemur sinifinin superclassıdır.

public class IdariMemur extends Personel { 
	// üye değişkenleri 
	
//	private String ad; // bunları commentledim çünkü extends Personel yazarak alıyorum bunları:
//	private String soyad;
//	private String tcKimlik;
//	private int yas;
//	private int maas;
//	private int kidemBilgisi;
//	private long cepTelNo;
	
	// bu ikisi sadece bu classa ait fieldler bunlar 
	private String gorevi;
	private long telSeriNo;

	//getter setter methodları oluşturdum otomatik olarak. 
	// burada da  sadece bu sınıfa ait olan getter-setterlar kalsın
	
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
