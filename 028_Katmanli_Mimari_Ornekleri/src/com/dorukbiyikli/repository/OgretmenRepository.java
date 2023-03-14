package com.dorukbiyikli.repository;

import java.util.List;

import com.dorukbiyikli.repository.entity.Ogrenci;
import com.dorukbiyikli.repository.entity.Ogretmen;
import com.dorukbiyikli.utility.DataBase;

public class OgretmenRepository {

	public void save(Ogretmen ogretmen) {
		DataBase.ogretmenListesi.add(ogretmen);
	}

	public void delete(int id) {
		Ogretmen silinecekOgretmen = null; // önce bir silinecekOgretmen nesnesi oluşturdum null olarak.
		for (Ogretmen ogr : DataBase.ogretmenListesi) {// ogretmenListesinde donup tcKimlikNosu
			if (ogr.getTcKimlikNo() == id) {
				silinecekOgretmen = ogr;
				break;
			}
		}
		if (silinecekOgretmen != null) {
			DataBase.ogretmenListesi.remove(silinecekOgretmen);
		}

	}

	public void update(Ogretmen ogretmen) {
		for (int i = 0; i < DataBase.ogretmenListesi.size(); i++) {
			if (DataBase.ogretmenListesi.get(i).getTcKimlikNo() == ogretmen.getTcKimlikNo()) {
				DataBase.ogretmenListesi.get(i).setAdi(ogretmen.getAdi());
				DataBase.ogretmenListesi.get(i).setSoyadi(ogretmen.getSoyadi());
			}
		}
	}

	public Ogretmen findById(int id) {
		Ogretmen bulunanOgretmen = null;
		for (Ogretmen ogr : DataBase.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == id) {
				bulunanOgretmen = ogr;
				break;
			}
		}
		return bulunanOgretmen;

	}

	public List<Ogretmen> findAll() {
		return DataBase.ogretmenListesi;
	}

}
