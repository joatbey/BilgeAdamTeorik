package com.dorukbiyikli;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NesneyiSerilestirDosyayaYazMain {

	public static void main(String[] args) {

		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))) {

			Otomobil otomobil1 = new Otomobil("Opel", "Astra", 2017);
			Otomobil otomobil2 = new Otomobil("Audi", "A3", 2018);
			Otomobil otomobil3 = new Otomobil("BMW", "1.18", 2015);

			outStream.writeObject(otomobil1);// java gonderdiğimiz otomobil objesini Object sınıfından bir nesneye
												// donusturecek sonra da bunu byte dizisi olarak otomobil.bin dosyasına
												// yazdıracak
			outStream.writeObject(otomobil2);
			outStream.writeObject(otomobil3);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı hatası...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası... ");
			e.printStackTrace();
		}

		System.out.println("Serialization process completed");
	}

}