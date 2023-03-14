package com.dorukbiyikli;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
		ogrenciList.add(new Ogrenci("Ali", 100));
		ogrenciList.add(new Ogrenci("Veli", 101));
		ogrenciList.add(new Ogrenci("Zeynep", 102));
		ogrenciList.add(new Ogrenci("Tuğçe", 103));
		ogrenciList.add(new Ogrenci("Kaan", 104));

//		for (Ogrenci ogr : ogrenciList) {
//			System.out.println(ogr);
//		}

		// Stream : Akış
		// Aşağıdaki örnekte ogrenciler listesinin üzerinden gidip işlemler yapmamızı
		// sağlar. Yani akış oluşturur.
		
		// ogrenciler.stream() yazdığımız zaman kaynağı ogrenciler listesi olan bir akış
		// oluşturulur.
		// 
		// Lambda functions: 
		// Ok -> 'un solundaki ogrenci parametre,
		// ok -> 'un sağındaki de parametrenin çalışacağı metoddur.		

		ogrenciList.stream().forEach(ogrenci -> System.out.println(ogrenci));
		System.out.println();
		
		ogrenciList.stream().forEach(ogrenci -> {
			System.out.println("Öğrenci bilgisi: ");
			System.out.println(ogrenci);
			System.out.println("- - - - -");
		});
		System.out.println("\n\n");
		
		ogrenciList.stream().forEach(ogr -> ogr.printSinavNotu());
		
		System.out.println();
		// Yukarıdaki ifadenin çok daha kısa yazılabilecek hali:
		// Bu kullanımın adı : Method Reference
		//						SinifAdi::MetodAdi
		// :: manası: bu Ogrenci sınıfının içindeki printSinavNotu metodunu
		// çağır demek.
		
		ogrenciList.stream().forEach(Ogrenci::printSinavNotu);
		
		// Stream API'ın en çok kullanılan birkaç metodu:
		//
		// filter metodu
		
		long id102denBuyukOgrenciSayisi = ogrenciList.stream().filter(ogrenci -> ogrenci.getId()>102).count();
		System.out.println("ID'si 102'den büyük öğrenci sayısı: " + id102denBuyukOgrenciSayisi);
		
		// collect() metodu ile filtre sonuçlarını liste haline çevirebiliriz.
		//
		List<Ogrenci> filtrelenmisListe = ogrenciList.stream().filter(ogrenci -> ogrenci.getId()>102).collect(Collectors.toList());
		System.out.println("\n* * * * *");
		filtrelenmisListe.stream().forEach(ogr -> System.out.println(ogr));
		
		// map() metodu: map'leme işlemi ile yeni nesneler oluşturulur
		List<Ogrenci> mappedList = ogrenciList.stream().map(ogr -> new Ogrenci(ogr.getAd(), ogr.getId()*100)).collect(Collectors.toList());
		mappedList.stream().forEach(ogr ->System.out.println(ogr));
		
		// Şimdi ise Map sınıfından bir HashMap nesne oluşturalım (Ogrenci sınıfından istediğimiz değerleri kullanarak)
		System.out.println("- - - - - - - - - - ");
		Map<Integer, String> ogrenciMap = ogrenciList.stream().collect(Collectors.toMap(ogr->ogr.getId(), ogr->ogr.getAd()));
		
		// Map içeriğini ekrana yazdıralım
		ogrenciMap.forEach((key, value) -> System.out.println(key + " -> " + value));
		
		System.out.println(ogrenciMap.containsKey(108));
		System.out.println(ogrenciMap.containsKey(103));
		
		String isim = ogrenciMap.get(103);
		System.out.println(isim);

	}

}