package com.dorukbiyikli;

public class Motor {

	public int motorHacmi;
	public String motorNo;
	public int yakitTuketimi;
	
	public void motorBilgileriniYazdir() {
		System.out.println("motor hacmi:"+this.motorHacmi+ " motor no :"+ this.motorNo+ " yakit tüketimi:"+this.yakitTuketimi);
	}
}
