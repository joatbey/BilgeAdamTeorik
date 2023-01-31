package com.dorukbiyikli;

public class VeriTipleriKarakter {

	public static void main(String[] args) {
		
		// char 1 Byte
		char charValue = 'A'; // tek tırnak char veri tipinde . ASCII tablosunda A nın karşılığı 65 . char ilkel veri tipi. nesne değil.
				System.out.println(charValue);	
		char charValue2 = 65;
				System.out.println(charValue2); // bu şekilde karakterleri ASCII binary olarak tutuyor.
				
		//string veritipi: karakter limiti yok gibi teorik olarak 2,147,483,647 karakter tutabiliriz . ilkel sınıf değil sınıf tabanlı bi veri tipi. nesne.
				
		//ekrana yazdırırken 
		String name = "Ali" ;
		String surname ="Kaya" ;
		System.out.println("isim: " + name + "soyisim ");
		
				
	}

}
