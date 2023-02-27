package com.dorukbiyikli;

import java.util.ArrayList; // bu import edilmeli
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	private static void printArrayList(ArrayList<Kisi> kisiList) { // buraya ArrayList yazmak yerine List<Kisi> kisiList
																	// yazarsak interface işine gireriz.

		System.out.println("\n--------------------\n");
		for (Kisi kisi : kisiList) {
			System.out.println(kisi); // Kisi classının içinde toString olmazsa adresi yazar.
		}
	}

	public static void printList(List<String> list) {
		System.out.println();
		for (String name : list) {
			System.out.println(name);
		}
	}

	private static List<String> listeOlustur() { // interface return ediyor
//		List<String> lst = new ArrayList<> ();  burada ArrayList 
//		lst.add("Ali");
//		lst.add("Veli");
//		return lst;

		List<String> lst = new LinkedList<>();// burada LinkedList...
		lst.add("Ali");
		lst.add("Veli");
		return lst;

	}

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String> () ; // java1.7den önce sağ tarafa da new ArrayList<String>() ; yazmak lazımmış
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		for (int i = 0; i < cars.size() ;  i++) {
			System.out.println(cars.get(i));
			
		}
		System.out.println("****************");
		
		for (String car : cars) {
			System.out.println(car);
		}
	
		//---------------------------------
		
		ArrayList<Integer> arrList = new ArrayList<> () ; // ArrayList içine primitive veri tipleri almaz. Onların yerine onların wrapper sınıfları yazılır.
		// içinde yalnızca nesne tutacak
		// int yerinte Integer
		//float yerine Float gibi
		
		arrList.add(3); // ama içine 3 yazabiliyoruz. o alıp onu bir Integer tipinde nesneye çeviriyor içinde 3 olan
		arrList.add(7);
		arrList.add(10);
	
		System.out.println(arrList);// [3, 7, 10]

		// ArrayList'ler içinde kendi Nesnelerimizin Kullanımı : 
		Kisi k1 = new Kisi ("John", "Smith");
		Kisi k2 = new Kisi ();
		k2.setAd("Robert");
		k2.setAd("Donavan");
		Kisi k3 = new Kisi ("Ali" , "Kaya");
		Kisi k4 = new Kisi( "At ", "Atoglu" );
		
		ArrayList<Kisi> kisiList = new ArrayList<>();
		kisiList.add(k1);
		kisiList.add(k2);
		kisiList.add(k3);		
		Main.printArrayList(kisiList);

		
		kisiList.add(2, k4);//  istediğin indekse de ekleyebiliyorsun...
		Main.printArrayList(kisiList);
		
		//remove : 
		
		kisiList.remove(k2); // nesne referansı ile de kullanınabilir.
		Main.printArrayList(kisiList);

		kisiList.remove(0);// indexi kullanarak da kullanılabilir.
		Main.printArrayList(kisiList);
	
		List<Kisi> kisiList2 = new ArrayList <Kisi> () ; // import java.util.List; lazım
		// burada baştaki List daha farklı bişi
		// interface bu detaylı sonra anlatılacak...
		kisiList2.add(new Kisi ( "Ahmet" , "Emre")) ;
		
		//Main.printArrayList(kisiList2); // The method printArrayList(ArrayList<Kisi>) in the type Main is not applicable for the arguments (List<Kisi>) hatası verir
		// yukarda methodu tanımlarken List değil de ArrayList yazdık diye . List<Kisi> kisiList2 = new ArrayList <Kisi> () ;  bun
		
		System.out.println("**********");
		// ArrayListlerde araya ekleme : 
		List<String> l = Main.listeOlustur();
		for (String s: l) {
			System.out.println(s);
		}
		Main.printArrayList(kisiList);
		l.add(2, "asd");
		
		
		Main.listeOlustur();
		Main.printArrayList(kisiList);
		
		
		// LINKED LIST 
		//
		// ARRAY LIST hızlı random erişimi sağlar dizinin içindeki herhangi bir elemanı sabit sürede getirir
		// Ancak ArrayListte araya eleman ekleme veya aradan eleman çıkarma gibi işlemler çok uzun vakit alır . 
		// 
		// LINKED LIST lerde ise araya eleman ekleme veya aradan eleman çıkarma çok daha hızlıdır.
		// Ancak LinkedList belirli bir indexteki elemana erişim hızında ARrayListe göre çok yavaş kalır.
		
	
		List<String> linkedList = new LinkedList<>();
		linkedList.add("John");
		linkedList.add("Barbara");
		//System.out.println(linkedList);
		
		Main.printList(linkedList);
		Main.printList(cars);
		
		linkedList.remove("John");
		Main.printList(linkedList);
		
		System.out.println(linkedList.get(0));
		
		// Araya eleman ekleme
		linkedList.add(1, "Robert");
		Main.printList(linkedList);
		
	}

}
