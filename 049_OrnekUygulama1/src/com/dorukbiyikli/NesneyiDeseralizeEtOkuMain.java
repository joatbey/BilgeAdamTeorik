package com.dorukbiyikli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.sql.rowset.serial.SerialException;

public class NesneyiDeseralizeEtOkuMain {

	public static void main(String[] args) {

		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("karisikNesneler.bin"))) {
			// yazdığımız sırayla okumalıyız bu onemli
			Otomobil oto1 = (Otomobil) inputStream.readObject();
			Otomobil oto2 = (Otomobil) inputStream.readObject();
			Otomobil oto3 = (Otomobil) inputStream.readObject();
			Ogrenci ogr1 = (Ogrenci) inputStream.readObject();
			Ogrenci ogr2 = (Ogrenci) inputStream.readObject();
			
			

			System.out.println(oto1);
			System.out.println(oto2);
			System.out.println(oto3);
			System.out.println(ogr1);
			System.out.println(ogr2);
			
			

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (InvalidClassException e) {
			System.out.println("Not serializable hatası ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası ");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Bilinemeyen bir hata oluştu");
			e.printStackTrace();
		}

	}

}
