package com.dorukbiyikli;

public abstract class Hayvan {// abstract bi class olarak tanımladım. soyut. hayvan sınıfından bir nesne
								// oluşturulmasın istiyorum.// ya kedi ya köpek ya kuş sınıfından oluşabilsin
								// istiyorum.
	
	// abstract işinin olayı subclasslarda override edilmeyi zorunlu kılmak...

	private String ad;
	private int kilosu;
	private int uzunluk;

	// bu constructor olayına da dikkat ...
	public Hayvan() {

	}

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

	public abstract void sesCikar(); // {} bile yok. abstract method // abstract methodlar implementation içermez... Sadece method tanımı yazılır.
	// abstract methodlar subclasslardan çağırılarak içi doldurularak (kod bloğu yazılarak) kullanılır yani implement edilir.
	//method overriding ile ... 

	//bilgi:  abstract methodlar yalnızca abstract sınıflarda yazılabilir...
	
	public abstract void yemekYe(); // bunu şimdi yazınca tum subclasslarda hata verdi implement edilmedikleri için... override edilmediği için...
	
	
	
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
