package com.dorukbiyikli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	private static void listeyiIncele(List<String> list) { // ArrayList ya da LinkedList yerine Interface olan Link yazmak daha iyi parametre olarak çünkü ikisini de göderebiliyorum.
		//işlemler
		System.out.println( list  + "sıkıntı yok");
	}

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("Opel");
		list.add("Audi");
		list.add("VW");
		list.add("Renault");
		System.out.println(list);
		
		//Collections sınıfı:	
		//Collections sınıfı bir utility sınıfıdır. ( yani collections framework kullanırken bize yardımcı olabilecek metodları barındırır)
		
		Collections.sort(list); // alfabetik sıraladı.
		System.out.println();
		System.out.println(list);
		System.out.println("******");
		List<String> list1 = new LinkedList<String>();
		list1.add("Opel");
		list1.add("Audi");
		list1.add("VW");
		list1.add("Renault");
		System.out.println(list1);
		Collections.sort(list1); // alfabetik sıraladı.
		System.out.println();
		System.out.println(list1);
		
		Main.listeyiIncele(list);
		Main.listeyiIncele(list1);
		//sşimdi kendi sınıfıımızdan bir sınıf oluşturalım:
		
		List<Ogrenci> ogrenciler =new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("Berk", 1050));
		ogrenciler.add(new Ogrenci("Sinem", 1051));
		ogrenciler.add(new Ogrenci("Gülsu", 1052));
		ogrenciler.add(new Ogrenci("Ahmet", 113));
		ogrenciler.add(new Ogrenci("Hivda", 750));
		
		System.out.println("\n"+ ogrenciler); //
		//Collections.sort(ogrenciler);//- The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Ogrenci>)
		// kendi yazdığımız sınıfı Collections daki sort methodu ile sıralatmak istiyorsak yazdığımız sınıflar Comparable sınıfını implement etmeli.
		//Stringleri yaptı ama dersen... String sınıfı için yine içinde implements Comparable yazıyor
	
		Collections.sort(ogrenciler);
		System.out.println(ogrenciler);
	
		// Şimdi de nesnelerimizi ccompare edelm
		Ogrenci ogr1 = new Ogrenci("Ali",220);
		Ogrenci ogr2 = new Ogrenci("Veli",134);
		
		System.out.println(ogr1.compareTo(ogr2));
	
	
	}
}
