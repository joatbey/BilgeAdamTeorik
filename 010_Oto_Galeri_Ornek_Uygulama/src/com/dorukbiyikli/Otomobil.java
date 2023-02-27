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
	private int depodakiYakit;
	private final int depoHacmi ; // ya hemen initalize edeceğiz burada final üye değişkeni ya da constructorda tanımla aşağıda... // ikisi birden de olmaz...
	
	
	// parametre bir methodun parantez içinde aldığı değişkenlere denir.
	public Otomobil(String marka, String model , int yil , int aracinKm, Motor motor, int depoHacmi) {
		this.setAracinKm(aracinKm);
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);
		// motoru set edelim:
		this.setMotor(motor);// motor nesnesini constructorun içinde olşturduk
		this.depoHacmi = depoHacmi;
		this.depodakiYakit = 0 ;
		
	}

	// bu arada constructorları böyle de yapbilirsin hangi parametrelerle çağırırsan öyle olur.
	
	
	


	public Otomobil(String marka, String model, int yil, int aracinKm, int motorHacmi, String motorNo, int yakitTuketimi, int depoHacmi) {
		this.setAracinKm(aracinKm);
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);
		this.motor = new Motor(motorHacmi, motorNo, yakitTuketimi); 
		//this.setMotor(new Motor(motorHacmi, motorNo, yakitTuketimi)); üstteki satırı böyle de yazabiliriz...
		this.depoHacmi = depoHacmi;
		this.depodakiYakit = 0 ;


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
				+ motor + ", depodakiYakit=" + depodakiYakit + ", depoHacmi=" + depoHacmi + "]";
	}

	public void aracYilBilgisiDegistir(int yil) {
		//yil = yil; // ambiguity var çünkü parametre ismi de yil 
		this.yil = yil ; // bu kullanım parametreyi de ayni isimle kullanmak için
		//this yazılan şeyler üye değişkenler
		
	}
	

	public int getDepodakiYakit() {
		return depodakiYakit;
	}

	public void setDepodakiYakit(int depodakiYakit) {
		this.depodakiYakit = depodakiYakit;
	}

	public int getDepoHacmi() {
		return depoHacmi;
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

}

