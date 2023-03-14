package com.dorukbiyikli;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjeyiYaz {

	public static void main(String[] args) {
		Ogrenci ogrenci1 =new Ogrenci("Ali ", 101,"Bilgisayar Mühendisliği");
		Ogrenci ogrenci2 =new Ogrenci("Zeynep ", 102,"Elektrik Mühendisliği");
		Ogrenci ogrenci3 =new Ogrenci("Fatma", 103,"Maden Mühendisliği");
		Ogrenci ogrenci4 =new Ogrenci("Gamze", 104,"Çevre Mühendisliği");
		Ogrenci ogrenci5 =new Ogrenci("Ahmet", 105,"Kaldırım Mühendisliği");
	
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(ogrenci1);
		ogrenciList.add(ogrenci2);
		ogrenciList.add(ogrenci3);
		ogrenciList.add(ogrenci4);
		ogrenciList.add(ogrenci5);
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrencilerliste.bin"))){
			
			out.writeObject(ogrenciList);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı hatası");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("Dosyaya Yazılamadı hatası");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştus");
			e.printStackTrace();
		}
		
		System.out.println("ArrayList ve içindeki ogrenci nesneleri dosyaya yazıldı");
		
	}

}
