package com.dorukbiyikli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOgrenciLise {

	
	public static void main(String[] args) {
		
		List<OgrenciLise> ogrenciler = new ArrayList<OgrenciLise>();
		ogrenciler.add(new OgrenciLise("Berk", 1050, 80.0));
		ogrenciler.add(new OgrenciLise("Sinem", 1051,85.2));
		ogrenciler.add(new OgrenciLise("Gülsu", 1052 , 90.2));
		ogrenciler.add(new OgrenciLise("Ahmet", 113,92.8));
		ogrenciler.add(new OgrenciLise("Hivda", 750,70.6));
		
		System.out.println(ogrenciler + "\n");
		
		Collections.sort(ogrenciler);
		
		System.out.println(ogrenciler);
	}
}
