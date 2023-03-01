package com.dorukbiyikli;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// HashMapler key-value pairler (anahtar değer çiftleri) olarak tutulur.
		// Key -> Value
		// HashMap de (HashSet gibi) içindeki elemanları sıralı tutmaz ( ArrayKist ve
		// LinkedList in aksine)
		// HashMap içindeki elemanları hashleyerek random bi sırada tutar
		// Hash Map'ler List'lere göre random access(rastgele erişim)

		// HashMap<Key,Value>
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// burada add yok put var...
		hashMap.put(10, "Opel");
		hashMap.put(20, "Audi");
		hashMap.put(30, "VW");
		hashMap.put(40, "BMW");
		hashMap.put(50, "Renault");
		System.out.println(hashMap);
		// sıranın kafasına göre olduğuna dikkat et...

		// aynı keye ait başka bir kayıt eklemeye kalkarsanız overwrite eder ustune
		// yazar. bunun olayı bu
		hashMap.put(30, "DEĞİŞTİRDİM");
		System.out.println("\n" + hashMap);

		System.out.println(hashMap.get(20));
		System.out.println(hashMap.get(70)); // olmayan bişi olursa null donecek.

		if (hashMap.containsKey(70))
			System.out.println("mevcut");
		else
			System.out.println("mevcut değil");

		// HashMap içeriğini bastırmak...
		// 1.yol HashMapi sete dönüştürür loop ederiz...
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar: " + entry.getKey() + " Değer: " + entry.getValue());
		}

		System.out.println("* * * * * * * * * * * ");

		// 2. yol
		for (Integer key : hashMap.keySet()) {
			System.out.println("Key: " + key + " Value : " + hashMap.get(key));
		}

		// önemli bir iki method:
		//contains key
		if (hashMap.containsKey(200)) {
			System.out.println("mevcut");
		} else {
			System.out.println("mevcut değil");
		}
		
		//containsValue
		if(hashMap.containsValue("Renault")){
			System.out.println("mevcut");
		}  else {
			System.out.println("mevcut değil");
		}
		
	}

}
