package com.dorukbiyikli;

public class Simbo implements ITermometre, INemOlcer {// bunu classı oluştururken interfaceleri de seçerek oluşturduk.

	
	// buarada bunları arduino sensorleriyle ya da internetten .
	
	@Override
	public double nemOlc() {
		// TODO Auto-generated method stub
		return 45;
	}

	@Override
	public int sicakligiOlc() {
		// TODO Auto-generated method stub
		return 27;
	}

}
