package com.dorukbiyikli;

public class OtoGaleri {

	private String galeriAdi;
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;

	// OtoGaleri Constructor

	public OtoGaleri(String galeriAdi, int kapasite) {// kapasite constructorun parametresi...
		this.otomobilDizisi = new Otomobil[kapasite];
		this.galeridekiOtomobilSayisi = 0;
		this.setGaleriAdi(galeriAdi); // this.galeriAdi = galeriAdi;
	}

	public int findCount(String marka) {
		int counter = 0;
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			if (otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				counter++;
			}
		}
		return counter;
	}

	public Otomobil[] search(String marka) { // markasına göre, ne getirecek Otomobil nesnesinin dizisini ... ona göre
												// yazıyoruz methodu
		//count: aranan marka otomobil sayısı  kadardır.
		int count = findCount(marka);
		Otomobil[] aramaSonuclari = new Otomobil[count]; // bu boyda bi dizi oluşturduk
		// ya bu yeni dizinin her i si için döner, onun içinde galeriyi arar döneriz.
		// ya da böyle bir sayac tutarız.
		int sayac = 0 ;
		for (int i = 0 ; i< galeridekiOtomobilSayisi ; i++) {
			if(otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac] = otomobilDizisi[i];
				sayac++;
			}
		}
		//System.out.println(aramaSonuclari);
		return aramaSonuclari;
		
	}

	
	public void galeridenOtomobilSil2(int siraNo) {
		Otomobil[] otomobilDizisiTemp = new Otomobil[otomobilDizisi.length] ;// arrayi ufaltmadan...
		System.out.println(siraNo + " . indexte bulunan otomobil " + galeriAdi + " galerisinden siliniyor...");
		int j=0;
		for(int i =0; i<otomobilDizisi.length ; i++) {
			if(i != siraNo) {
				otomobilDizisiTemp[j] = otomobilDizisi[i];
				j++;
			}
		}// burada azaltmayalım galeridekiOtomobilSayisini 
		// son değere null yazsın istiyorum
		otomobilDizisi = otomobilDizisiTemp;
		
		
	}
	
	
	public void galeridenOtomobilSil(int siraNo) {
		// bir diziden bir şey silmek kapasitesini lengthini de değiştirmeyi gerektiriyor.
		// daha iyi bir yolu yok dizilerde bunun
		// yeni bir dizi oluşturacaksın...
	
		Otomobil[] otomobilDizisiTemp = new Otomobil[otomobilDizisi.length-1] ;// arrayi ufalt
		System.out.println(siraNo + " . indexte bulunan otomobil " + galeriAdi + " galerisinden siliniyor...");
		int j=0;
		for(int i =0; i<otomobilDizisi.length ; i++) {
			if(i != siraNo) {
				otomobilDizisiTemp[j] = otomobilDizisi[i];
				j++;
			}
		}this.galeridekiOtomobilSayisi--;
		otomobilDizisi = otomobilDizisiTemp;
		
		

		
	}
	
	public void galeridekiOtomobilleriListele() {
		System.out.println("\n\n" + this.galeriAdi + " galerisindeki Otomobiller Listesi: " + "(kapasite:"
				+ this.otomobilDizisi.length + ")" + "(Galerideki anlık otomobil sayısı: "
				+ this.galeridekiOtomobilSayisi + ")");
		for (int i = 0; i < galeridekiOtomobilSayisi; i++) {
			System.out.println(otomobilDizisi[i]);

		}
	}

	public void galeriyeOtomobilEkle(Otomobil otomobil) {
		if (galeridekiOtomobilSayisi < otomobilDizisi.length) {
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil;
			galeridekiOtomobilSayisi++;

		} else {
			System.err.println("galeri kapasitesi full , arac eklenemedi");
		}
	}

	public String getGaleriAdi() {
		return galeriAdi;
	}

	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}

	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}

}
