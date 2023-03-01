package com.dorukbiyikli;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {


	// HashSetler Javada elemanlara random olarak çok hızlı bir şekilde erişmek için kullanılan veri yapılarıdır.
	// Hızlı olmasının nedeni elemanlara erişilirken elemanlarının hash kodlarının kullanılmasıdır.
	// Hash code sayesinde herhangi bir input elemanı unique olarak tanımlanabilir...
	// HashSet aynı elemandan 2 tane barındıramaz...
	
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Kus");
		hashSet.add("Kedi");
		hashSet.add("Kopek");
		
		for(String s : hashSet) {// random olduguna dikkat et. Eklendiği sıralamayı korumuyor for each dongusunde...
			System.out.println(s);
		}
		System.out.println("* * * * * *");
		// ArrayListten farkı:
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Kus");
		arrayList.add("Kedi");
		arrayList.add("Kopek");
		arrayList.add("Kus");
	
		for(String s : arrayList) {// sıralama korunuyor, multiple kullanılabilir aynı şey
			System.out.println(s);
		}
	
		System.out.println();
		// Bu hashing işini öğren. Mesela şifreleri hashlemeden saklarsak sisteme erişebilen herkes görebilir. Şifreler için hashing kütüphanesi var javada...
		// çok fazla eleman olsaydı eğer bu ikisi çok farklı olacaktı:
		if(hashSet.contains("Kus")) { //daha hızlı
			System.out.println("kus hashSet içinde mevcut");
			
		}
		else {
			System.out.println("Kus set içinde mevcut değil.");
		}
		
		System.out.println();
		
		if(arrayList.contains("Kus")) {// daha yavaş
			System.out.println("Kus arrayList içinde mevcut");
		}
		else {
			System.out.println("Kus arrayList içinde mevcut değil");
		}
		System.out.println("* * * * * *");

		
		//HashSetler arası fark bulma
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("Kaplan");
		hashSet2.add("Kedi");
		hashSet2.add("Aslan");
		
		//Fark 2 adımda bulnur.
		//1. Adım: 
		HashSet<String> fark = new HashSet<>(hashSet2); // hashSet2'nin fark isminde bir kopyasını oluşturdum
		
		//2. Adım: 
		fark.removeAll(hashSet); // fark isimli hashSet'ten ilk hashSetimin aynı olan elemanlarını çıkardım. Geriye farklı olanlar kaldı.
		
		System.out.println("hashSet2'de olup hashSet'te olmayanlar  : " +fark);
		
		
		
		
		
		}
		
		

}
