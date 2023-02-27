package com.dorukbiyikli;

public class Arzum implements INemOlcer , ITermometre, ITarihSaatGoster {// bu şekilde multiple ... sıra önemsiz.

	@Override
	public String tarihGoster() {
		// TODO Auto-generated method stub
		return "17 Kasım 2022";
	}

	@Override
	public String saatGoster() {
		// TODO Auto-generated method stub
		return "12:45";
	}

	@Override
	public int sicakligiOlc() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	public double nemOlc() {
		// TODO Auto-generated method stub
		return 30.5;
	} 
	
	

}
