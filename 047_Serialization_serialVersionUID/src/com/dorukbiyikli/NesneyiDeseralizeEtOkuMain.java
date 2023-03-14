package com.dorukbiyikli;

import java.io.EOFException;
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

		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("otomobil.bin"))) {
			// yazdığımız sırayla okumalıyız

			// kaç tane nesne olduğunu bilmiyorsak ne yapacağız ?

			Otomobil oto = null;

			while ((oto = (Otomobil) inputStream.readObject()) != null) { // oto nesnesi null değilse while loopu
																		// çalıştır... Hiç dosya yoksa null olacak cunku

				if (oto != null) {
					System.out.println(oto);}
				
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Dosya sonu ");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Serialization hatası ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinemeyen bir hata oluştu");
			e.printStackTrace();
		}
		
		System.out.println("Bye");
	}

}
