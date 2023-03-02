package com.dorukbiyikli.controller;

import java.util.Scanner;

import com.dorukbiyikli.repository.OgretmenRepository;
import com.dorukbiyikli.repository.entity.Ogrenci;
import com.dorukbiyikli.repository.entity.Ogretmen;


public class OgretmenController {
	
private OgretmenRepository ogretmenRepository;
	

	
	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository ();
	}



	public void ogretmenEkleme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek ogretmen adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek ogretmen soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Eklenecek ogretmen tcKimlikNosunu giriniz: ");
		int id = scanner.nextInt();
		
		Ogretmen ogretmen = new Ogretmen(id,adi,soyadi);
		
		
		this.ogretmenRepository.save(ogretmen);
		
		
		
	}



	public void ogretmenSil() {
		System.out.println("Silinecek ogrencinin tcKimlikNosunu giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogretmenRepository.delete(id);
		
		
	}



	public void ogretmenGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek ogretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek ogretmeinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Guncellenecek ogretmenin tcKimlikNosunu giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = new Ogretmen(id,adi,soyadi);
		this.ogretmenRepository.update(ogretmen);
		
	}



	public void ogretmenBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görüntülemek istediğiniz öğretmenin tcKimlikNumarasını giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = this.ogretmenRepository.findById(id);
		System.out.println("\nBilgilerini görmek istediğiniz öğretmen: ");
		System.out.println(ogretmen);
		
	}



	public void ogretmenListesiniGoster() {
		System.out.println("****************************");
		System.out.println("**                        **");
		System.out.println("**    Ogretmen Listesi    **");
		System.out.println("**                        **");
		System.out.println("****************************");
		
		for(Ogretmen ogr: this.ogretmenRepository.findAll()) {
			System.out.println(ogr);
		}
	}
		
	

}
