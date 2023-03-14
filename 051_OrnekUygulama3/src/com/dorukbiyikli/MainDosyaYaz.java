package com.dorukbiyikli;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainDosyaYaz {
	public static void main(String[] args) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))) {

			Otomobil oto1 = new Otomobil("Renault", "Clio", 2011);
			Otomobil oto2 = new Otomobil("Mercedes", "A180", 2013);
			Otomobil oto3 = new Otomobil("Opel", "Insignia", 2012);
			Otomobil oto4 = new Otomobil("Renault", "Clio", 2014);

			Motor m1 = new Motor(1111);
			oto1.setMotor(m1);
			Motor m2 = new Motor(2222);
			oto2.setMotor(m2);
			Motor m3 = new Motor(3333);
			oto3.setMotor(m3);
			Motor m4 = new Motor(4444);
			oto4.setMotor(m4);

			out.writeObject(oto1);
			out.writeObject(oto2);
			out.writeObject(oto3);
			out.writeObject(oto4);
			
			ArrayList<Otomobil> otoList = new ArrayList<Otomobil>();
			otoList.add(oto1);
			otoList.add(oto2);
			otoList.add(oto3);
			otoList.add(oto4);
		
			out.writeObject(otoList);
		
			Ogrenci ogr1 = new Ogrenci("Ali Kaya", 100, "Maden Mühendisliği");
			Ogrenci ogr2 = new Ogrenci("Veli Taş", 102 , "Jeoloji Mühendisliği");
			
			ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
			ogrenciList.add(ogr1);
			ogrenciList.add(ogr2);
			out.writeObject(ogrenciList);
		
		}
		catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (NotSerializableException e) {
			System.out.println("Serialization hatası");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası");
			e.printStackTrace();
		}

		System.out.println("Process complete...");
	}

}
