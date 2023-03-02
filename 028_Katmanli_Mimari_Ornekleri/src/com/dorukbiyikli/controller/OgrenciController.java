package com.dorukbiyikli.controller;

import java.util.Scanner;

import com.dorukbiyikli.repository.OgrenciRepository;
import com.dorukbiyikli.repository.entity.Ogrenci;
import com.dorukbiyikli.utility.DataBase;

public class OgrenciController {

	
	private OgrenciRepository ogrenciRepository;
	

	
	public OgrenciController() {
		this.ogrenciRepository = new OgrenciRepository ();
	}


	public void ogrenciEkleme() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek ogrencinin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek ogrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Eklenecek ogrencinin nosunu giriniz: ");
		int id = scanner.nextInt();
		
		Ogrenci ogrenci = new Ogrenci(adi,soyadi,id);
		
		
		//a:) 
		//DataBase.ogrenciListesi.add(ogrenci);
		
		//B:)
		this.ogrenciRepository.save(ogrenci);
		
		
	}


	public void ogrenciSil() {
		System.out.println("Silinecek ogrencinin nosunu giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogrenciRepository.delete(id);
		
	}


	public void ogrenciGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek ogrencinin nosunu giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek ogrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Guncellenecek ogrencinin nosunu giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = new Ogrenci(adi,soyadi,id);
		this.ogrenciRepository.update(ogrenci);
		
	}


	public void ogrenciBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görüntülemek istediğiniz öğrencinin numarasını giriniz: ");
		int id = scanner.nextInt();
		Ogrenci ogrenci = this.ogrenciRepository.findById(id);
		System.out.println("\nBilgilerini görmek istediğiniz öğrenci: ");
		System.out.println(ogrenci);
	}


	public void ogrenciListesiniGoster() {
		System.out.println("****************************");
		System.out.println("**                        **");
		System.out.println("**    Ogrenci Listesi     **");
		System.out.println("**                        **");
		System.out.println("****************************");
		
		for(Ogrenci ogr: this.ogrenciRepository.findAll()) {
			System.out.println(ogr);

		}
	}

}
