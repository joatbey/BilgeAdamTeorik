package com.alikaya;

public class Paralelkenar {
	
	int kisaKenar ; // int yazıp geçerse public int demezse protected kabul edilir. Aynı package içinden kullanılabilir ama başka package içinden erişilemez.
    int kenarUzun ;
	
	// public yazarsa başka paketlerden de classlardan da ulaşabiliriz...
	
	// direkt int olarak yazarsa protected yazmasıyla aynı olur. yani default hali protected...
	
	// private olursa yalnızca aynı classtan erişilebilir...
	
	private String isim; // buna alinin maininden de erişilemez..
	
	private String getIsim() { // buna da alinin maininden erişişlemez ... yani methodlarda da aynı üye değişkenlerdeki gibi...
		return isim;
	}
	
	public static void main ( String [ ] args ) {
		Paralelkenar paralelkenar = new Paralelkenar();
		paralelkenar.isim = " alinin paralelkenarı" ; 
		paralelkenar.getIsim() ;

	}
	
	
	
}
