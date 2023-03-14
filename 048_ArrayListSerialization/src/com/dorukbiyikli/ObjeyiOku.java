package com.dorukbiyikli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {

	public static void main(String[] args) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrencilerliste.bin"))) {
			// yazdığımız sırayla okumalıyız
			
			ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) inputStream.readObject();
			
			System.out.println(ogrenciList);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		}  catch (IOException e) {
			System.out.println("Dosya okuma hatası ");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("Serilaziation hatası");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Bilinemeyen bir hata oluştu");
			e.printStackTrace();
		}

		System.out.println("liste yazıldı");
	}

}
