package com.dorukbiyikli;

public class Main {
	//method overloading 
	//method aşırı yüklemesi
	public static int topla( int x , int y ) {
		return (x + y );
	}
	public static int topla(int x, int y , int z ) {
		return ( x+y+z);
	}
	
	public static void main(String[] args) {
		DaireBaskani daireBaskani = new DaireBaskani("Ali", "Veli", "111223344", 50, 30000, 1, 5331112233L, "insaat emlak daire ", 11223L);
		System.out.println(daireBaskani);
		
		Muhendis m  =  new Muhendis("Mahmut", "Kara", "1112223234", 50, 30000,2, 533112233L, "İnsaat Müh.");
		System.out.println(m);
		
		
		// getZamKatsayisi() metodu => METOD OVERRIDING işlemi kullanılmıştır 
		// inheritance ile ilgili bu
		// ust sinifta tanımladiğin bi methodu her alt sınıfta değiştirebiliyorsun.
		
		System.out.println(m.getAd() + " zam katsayisi: "+ m.getZamKatsayisi());
		System.out.println(daireBaskani.getAd() + " zam katsayisi: "+ daireBaskani.getZamKatsayisi());
		
		// **** METOD OVERLOADING - METHOD ASIRI YUKLEMESİ		- bunun inheritance ile alakası yok... aynı methodu farklı parametrelerle kullanmak
		System.out.println(Main.topla(2, 3));
		System.out.println(Main.topla(2, 3, 4));
		
	}

}
