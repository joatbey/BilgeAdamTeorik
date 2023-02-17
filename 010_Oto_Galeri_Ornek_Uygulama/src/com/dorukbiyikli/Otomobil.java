package com.dorukbiyikli;

public class Otomobil {

	public static final String ARAC_TIPI = "Kara Aracı";
	
	// Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği nesnete ait özellikler
	//üye özellikler :
	private String marka; // String nesneleri null olarak initialize edilir.
	private String model; // String nesneleri null olarak initialize edilir.
	private int yil; 	 // Sayisal veri tipleri 0 olarak initialize edilir.
	private int aracinKm; // Sayisal veri tipleri 0 olarak initialize edilir.
	private Motor motor; // Otomobil sınıfının içinde farklı bir sınıfın nesnesini (Motor sınıfının nesnesini) üye değişken olarak tutuyoruz
	
	// parametre bir methodun parantez içinde aldığı değişkenlere denir.
	public Otomobil(String marka, String model , int yil , int aracinKm, Motor motor) {
		this.setAracinKm(aracinKm);
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);
		// motoru set edelim:
		this.setMotor(motor);
		
	}

	
	public Otomobil(String marka, String model) {
		this.setMarka(marka);
		this.setModel(model);
	}
	
	
	
	public Otomobil(String model, int yil, Motor motor) {
		//super();
		this.model = model;
		this.yil = yil;
		this.setMotor(motor);
	}


	public Otomobil() {
		
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getAracinKm() {
		return aracinKm;
	}

	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		if(motor == null) {
			System.out.println("otomobile null olan motor nesnesi takılmaya çalışılıyor.");
		}
		else {
		this.motor = motor;
			
		}
	}

	public void araciSur(int km) {
		System.out.println("Araç "+ km+ " km yol yapıyor...");
		aracinKm += km; //this.aracinKm += km ;
	}
	
	
	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", aracinKm=" + aracinKm + ", motor="
				+ motor + "]";
	}

	public void aracYilBilgisiDegistir(int yil) {
		//yil = yil; // ambiguity var çünkü parametre ismi de yil 
		this.yil = yil ; // bu kullanım parametreyi de ayni isimle kullanmak için
		//this yazılan şeyler üye değişkenler
	}
}
