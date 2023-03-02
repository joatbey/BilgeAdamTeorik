package com.dorukbiyikli;

import com.dorukbiyikli.MainEnumOrnek.Mevsimler;

public class Lastik {

	public Mevsimler lastikMevsimi;
	
	
	
	public static void main(String[] args) {
		Lastik lastik = new Lastik();
		Lastik lastik2 = new Lastik();
		Lastik lastik3 = new Lastik();
		Lastik lastik4 = new Lastik();

		lastik.lastikMevsimi = Mevsimler.ILKBAHAR; // buraya direkt ILKBAHAR KIS SONBAHAR YAZ gibi şeyler girilebilir yani başka bişi olmaz...

		lastik2.lastikMevsimi = Mevsimler.KIS;

		lastik3.lastikMevsimi = Mevsimler.SONBAHAR;

		lastik4.lastikMevsimi = Mevsimler.YAZ;
		
		System.out.println(lastik.lastikMevsimi);
		System.out.println(lastik2.lastikMevsimi);
		System.out.println(lastik3.lastikMevsimi);
		System.out.println(lastik4.lastikMevsimi);

		
	}
}
