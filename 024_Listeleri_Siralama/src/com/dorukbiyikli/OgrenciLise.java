package com.dorukbiyikli;

public class OgrenciLise implements Comparable<OgrenciLise>{

	private String ad;
	private int id;
	private double notOrtalaması;
	public OgrenciLise(String ad, int id, double notOrtalaması) {
		super();
		this.ad = ad;
		this.id = id;
		this.notOrtalaması = notOrtalaması;
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
	public double getNotOrtalaması() {
		return notOrtalaması;
	}
	public void setNotOrtalaması(double notOrtalaması) {
		this.notOrtalaması = notOrtalaması;
	}
	@Override
	public String toString() {
		return "OgrenciList [ad=" + ad + ", id=" + id + ", notOrtalaması=" + notOrtalaması + "]";
	}
	
	
	public int compareTo(OgrenciLise ogr) { // bu bu şekilde , -1 ile 1 değiştirirsen ters de sıralıyor. ilk if -1 ise önce en düşük
		// ilk if 1 ise en büyükten.
		
		if(this.notOrtalaması < ogr.notOrtalaması){
			return 1;
		}
		else if (this.notOrtalaması > ogr.notOrtalaması) {
			return -1 ; 
		}
		return 0;
	}
	
	
}
