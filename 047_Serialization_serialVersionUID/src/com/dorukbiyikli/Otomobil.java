package com.dorukbiyikli;

import java.io.Serializable;

public class Otomobil implements Serializable{ // serializable olması lazım
	
	private static final long serialVersionUID =3 ; // sınıfta değişiklik yapan numarayı bir artırsın...
	
	// com.dorukbiyikli.Otomobil; local class incompatible: stream classdesc serialVersionUID = 2, local class serialVersionUID = 3 
	// hata almak istiyoruz grup işlerinde 
	
	private String marka;
	private String model;
	private int yil;
	
	
	public Otomobil(String marka, String model, int yil) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
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
	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + "]";
	}
	
	

}
