package com.dorukbiyikli;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Okul {

	private String okulAdi;
	private String okulAdresi;
//	private ArrayList<Sinif> siniflarList;
	private List<Sinif> siniflarList;

	
	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		//this.siniflarList = new ArrayList<Sinif>(); // linkedlist arraylist değişimi kolay...
		this.siniflarList = new LinkedList<Sinif>();
	}

	// Okulun içindeki sınıfları yazdırır.
	public void siniflariYazdir() {
		System.out.println("\n * * * * " + this.okulAdi + " Okulundaki Sınıflar * * * * \n");
		for (Sinif sinif : this.siniflarList) {
			System.out.println("Sınıf Adı : " + sinif.getSinifAdi() + " Lokasyon : " + sinif.getLokasyon());
		}
	}

	//Parametre olarak sınıf adı girilen ve sonuçta ilgili sınıf listesini return eden bir method yazalım...
	public Sinif getSinif(String sinifAdi) {
		for( Sinif sinif : siniflarList) {
			if(sinif.getSinifAdi().equalsIgnoreCase(sinifAdi));
			return sinif;
		}
		return null; // ife girmezse de void değil ta Sinif dönmeli. null dönüyoruz onun için. Eğer bulamazsa bulamadığımızı anlayalım.
	}
	
	public void sinifEkle(Sinif sinif) {
		this.siniflarList.add(sinif);
	}

	public void okuldanSinifCikar(String sinifAdi) {
		Sinif silinecekSinif = null;
		for (Sinif sinif : this.siniflarList) {
			if (sinif.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				silinecekSinif = sinif;
				break;
			}
		}
		if (silinecekSinif != null) {
			this.siniflarList.remove(silinecekSinif);
		} else {
			System.err.println(sinifAdi + " adlı sınıf bu okulda bulunmadı");
		}
	}

	// Iterators ile safe delete operation:
	// remove komutunu for içinde verirken indexleme işi karıştığı için bu common bir hata olmuş...Iterator diye bişi var javada...
	public void okuldanSinifCikarIterators(String sinifAdi) {
		Iterator<Sinif> i = this.siniflarList.iterator(); 
		while (i.hasNext()) {// iterator dışardan kontrol ediyor(sıkıntı olmama sebebi bu)  bi sonraki elenman varsa true dönüyor. boolean java.util.Iterator.hasNext()
			Sinif snf = i.next();//Returns the next element in the iteration. 
			if (snf.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				i.remove();
				break;
			}
		}
	}

	public void okuldakiOgrencileriYazdir() {
		System.out.println("\n*****" + this.okulAdi + " Okulundaki Öğrenci Listesi*****\n");
		int sayac = 0;
		for (Sinif sinif : siniflarList) {// her sınıf için...
			int sinifSayac= 0;
			System.out.println("\n" + sinif.getSinifAdi() +": ");
			for (Ogrenci ogrenci : sinif.getOgrencilerArrayList()) {// öğrenci bilgilerini yazdır:
				System.out.println("Öğrenci Adı : " + ogrenci.getAd() + " Öğrenci Soyadı : " + ogrenci.getSoyad()
						+ " Öğrenci Numarası : " + ogrenci.getOkulNo() + " Not Ortalaması : "
						+ ogrenci.getNotOrtalamasi());
				sayac++;
				sinifSayac++;
			}
			System.out.println("\nBu sınıfta " + sinifSayac + " öğrenci vardır.");
		}
		System.out.println("\nBu okulda " + sayac + " öğrenci vardır.");
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}

	public String getOkulAdresi() {
		return okulAdresi;
	}

	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}

	public List<Sinif> getSiniflarList() {
		return siniflarList;
	}

	public void setSiniflarList(List<Sinif> siniflarList) {
		this.siniflarList = siniflarList;
	}

}