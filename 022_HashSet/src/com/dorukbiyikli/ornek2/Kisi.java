package com.dorukbiyikli.ornek2;

import java.util.Objects;

// eğer bir sınıfı hashset ile kullanacaksanız, hashSetin doğru calısması için equals() ve hashCode() metodlarını implement etmek gerekir.

public class Kisi {

	private int id;
	private String ad;
	
	//constructors://
	public Kisi(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}
	
	//gettersetter//
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	

	public int hashCode(){
		return Objects.hash(id,ad);
		
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass()) // hashSetlerde kontrol etmek lazım alakasız bi sınıf da koyabilirsin yanlışlıkla çünkü
			return false;

		Kisi other = (Kisi) obj; // obje aldık Kisiye cast ettik... other bir kisi nesnesi ...
		return( Objects.equals(ad, other.ad) && (Objects.equals(id, other.id)) ) ;
	
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", ad=" + ad + "]";
	}	
	
	
	
	
		
}
