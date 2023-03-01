package com.dorukbiyikli;

public class Ogrenci implements Comparable<Ogrenci> {

	private String ad;
	private int id;
	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", Id=" + id + "]";
	}
	@Override
	public int compareTo(Ogrenci ogr) {
		// su anki yani sınıfın uye ogrencisi this.ogrenci ile parametre olarak gelen ogr nesnesini karsılastırır. Bunu java.util.collections kullanıyor. 
		if(this.id < ogr.id){
			return -1;
		}
		else if (this.id > ogr.id) {
			return 1 ; 
		}
		return 0;
	}
	
	
}
