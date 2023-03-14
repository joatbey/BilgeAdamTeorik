package com.dorukbiyikli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainDosyayiOku {
	public static void main(String[] args) {

		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))) {

			// yazdigimiz sırayla :
			Otomobil otomobil1 = (Otomobil) input.readObject();
			Otomobil otomobil2 = (Otomobil) input.readObject();
			Otomobil otomobil3 = (Otomobil) input.readObject();
			Otomobil otomobil4 = (Otomobil) input.readObject();

			System.out.println(otomobil1);
			System.out.println("motor no : " + otomobil1.getMotor().getMotorNo());
			System.out.println(otomobil2);
			System.out.println("motor no : " + otomobil2.getMotor().getMotorNo());
			System.out.println(otomobil3);
			System.out.println("motor no : " + otomobil3.getMotor().getMotorNo());
			System.out.println(otomobil4);
			System.out.println("motor no : " + otomobil4.getMotor().getMotorNo());

			System.out.println("-----------------------------------------------");

			ArrayList<Otomobil> otomobilList = (ArrayList<Otomobil>) input.readObject();

			for (Otomobil oto : otomobilList) {
				System.out.println(oto);
				System.out.println("motor no : " + oto.getMotor().getMotorNo());
			}


			System.out.println("-----------------------------------------------");
			
			ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) input.readObject();

			for (Ogrenci ogr : ogrenciList) {
				System.out.println(ogr);
			}

		} catch (FileNotFoundException e) {

			System.out.println("Dosya bulunamadı hatası");
			e.printStackTrace();
		} catch (IOException e) {

			System.out.println("Dosya okuma hatası");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata olustu");
			e.printStackTrace();
		}

	}

}
