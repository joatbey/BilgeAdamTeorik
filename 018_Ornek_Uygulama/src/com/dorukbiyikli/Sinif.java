package com.dorukbiyikli;

import java.util.ArrayList;

public class Sinif {
	private String sinifAdi;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrenciListesi;

	public Sinif(String sinifAdi, String lokasyon, ArrayList<Ogrenci> ogrencilerArrayList) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrenciListesi = ogrencilerArrayList;
	}

	public Sinif(String sinifAdi, String lokasyon) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrenciListesi = new ArrayList<Ogrenci>();

	}

	// ogrenciNo parametresine göre ogrencinin silinmesi: // bu daha da güzel...

//	public void siniftanOgrenciCikar(int ogrenciNo) { // bu bi yöntem ama bazen çalışmıyor bu! Neden çalışmıyor peki ??
//														// Concurrent modification exception veriyo...
//		// remove ederken içinde loop yaptığımız yapıyı değiştirmeye çalışıyoruz indexleri karıştırır bu buna izin vermiyor java o yüzden... 		
//		for (Ogrenci ogr : this.ogrencilerArrayList) {
//			if (ogr.getOgrenciNo() == ogrenciNo) {
//				this.ogrencilerArrayList.remove(ogr);
//			}
//		}
//	}
	
	// loopun içinde iken remove etmiyorum da , Ogrenci silinecekOgrenci tanımlayıp ona atıyorum... sonra remove ediyorum..
	public void siniftanOgrenciCikar(int ogrenciNo) {// böyle çözelim: 
		Ogrenci silinecekOgrenci = null; // böyle bişi tanımlayıp bulduğumuzu onda tutalım...adresi de başta null olsun...
		for (Ogrenci ogr : this.ogrenciListesi) {
			if(ogr.getOgrenciNo() == ogrenciNo) { // memorydeki adresini bulup silinecekOgrenciye 
				silinecekOgrenci = ogr; 
				break; // bulduktan sonra tekrar bulamayacağımız için break ile döngüden çıkalım hepsini gezmeyelim...
			}
		}
		if(silinecekOgrenci!= null) {// saçmasapan bi değer girerse bu nulla point edecek . öyle oluşturduk yukarda ..
			this.ogrenciListesi.remove(silinecekOgrenci);
		}
		else {
			System.err.println(ogrenciNo + " numaralı ogrenci bu sınıfta bulunamadı!");
		}
		

	}
	
	

	// Gelen nesne referansına sahip ogrencinin silinmesi:
	public void siniftanOgrenciCikar(Ogrenci ogr) {
		this.ogrenciListesi.remove(ogr);
	}

	public void sinifaOgrenciEkle(Ogrenci ogrenci) {
		this.ogrenciListesi.add(ogrenci);
	}
	

	public void sinifaOgrenciEkle(String ad,String soyad,int okulNo,int notOrtalamasi) {
		if(ad.length()<2||soyad.length()<2) {// kontrol edelim gelen parametreleri tek karakter olmasın...
			System.err.println("Ad veya Soyad 2 karakterden küçük olamaz. Öğrenci sınıfa eklenemedi!!!!!");
		}
		else {
			this.ogrenciListesi.add(new Ogrenci(ad, soyad, okulNo, notOrtalamasi));
		}
	}


	public void siniftakiOgrenciListesiniYazdir() {
		System.out.println("\n* * * *  " + this.sinifAdi + " sınıfındaki öğrenci listesi  * * * * \n");// * * * * 1C
																										// sınıfındaki
																										// öğrenci
																										// listesi * * *
																										// *

		for (Ogrenci ogrenci : this.ogrenciListesi) {
			System.out.println(ogrenci);
		}
	}

	public ArrayList<Ogrenci> getOgrencilerArrayList() {
		return ogrenciListesi;
	}

	public String getSinifAdi() {
		return sinifAdi;
	}

	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}

	public String getLokasyon() {
		return lokasyon;
	}

	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}

}
