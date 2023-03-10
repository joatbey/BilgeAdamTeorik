
package com.dorukbiyikli;

public class VeriTipleriBoolean {

	public static void main(String[] args) {

		// boolean veritipi 1 bitlik yer kaplar. Byte değil. on off . 1 0 . gibi . çok
		// sık kullanılır algoritmaları yazarken
		boolean boolDegisken;
		boolDegisken = true; // true veya false olarak 2 değerden birini alabilir.
		System.out.println(boolDegisken);
		// boolean değişkende ne tutulabilir ? ör. bir kullanıcının online-offline
		// olacağını tutabilirsiniz.
		boolean agirMi = false; // ilk değer verme / initializing bu önemli bişi initilize etmeden bişi
								// çağırırsan sıkıntı oluyor.
		int agirlik = 84;
		agirMi = (agirlik >= 85); // sanki if varmış gibi böyle check edebiliyoruz.
		System.out.println("Ağır mı ? \n" + agirMi); // if yapar gibi yaptık ama {} koymadık .

		// == != >= <= < >
		boolean durum = agirlik == 50; // hatta parantez () kullanmasak da olur
		System.out.println("Durum:" + durum);

		boolean durum2 = agirlik != 50;
		System.out.println("Durum " + durum2);

		int boy = 180;
		boolean uzunKilolu = (boy >= 180 && agirlik >= 85);
		System.out.println("Şahıs uzun boylu ve kilolu mu ? \n" + uzunKilolu);

		// Soru:
		char cinsiyet = 'K'; // veya 'E'
		if (uzunKilolu && cinsiyet == 'K') {
			System.out.println("Şahıs kadın , uzun ve kilolu");

			// if => Ternary kullanımı
			// örnek:
			int yas = 19;
			String deger;
			if (yas >= 18) {
				deger = "Yetişkin";
			} else {
				deger = "Yetişkin değil";
			}

			// yukarıdaki işlemi Ternary ile yap
			yas = 11;
			deger = yas >= 18 ? "Yetişkin " : "Yetişkin değil"; // yas 18>= ise yetişkini değere ata yok değilse
																// yetişkin değili değere ata.
			System.out.println(deger);
		}
			// microsoft USA in mülakatta sorduğu soru:
			// swap numbers question 3. değişken kullanmadan sayi1 ve sayi2 sayılarını
			// swaplayın
			int sayi1 = 5;
			int sayi2 = 3;
			System.out.println(sayi1 +" "+ sayi2);
			sayi1 = sayi1 * sayi2;
			System.out.println(sayi1 +" "+ sayi2);
			sayi2 = sayi1 / sayi2;
			System.out.println(sayi1 +" "+ sayi2);
			sayi1 = sayi1 / sayi2;
			System.out.println(sayi1+" "+ sayi2);

			int x = 10;
			int y = 3;
			
			int result = x/y ;
			System.out.println(result);
		
			System.out.println( (float)x/y);
			
			int kalan = x & y ;
			System.out.println(kalan);
			
			double res =  x/y  ; // eşitliğin sağ tarafı int olacağı için küsürat görünmeyecek iki integeri bölerken int verecek
								// çözüm1 x ve y 'yi double yapmak
			double xx = 10;
			double yy = 3;
			res = xx / yy ; 
			System.out.println("result: " + res);
			String kusurat = String.format("%.3f", res); // stringe çevirip decimal ayarlamak
			System.out.println("result: " + kusurat); // 3 decimal olanı print et


			System.out.println("\n\n ------------");
			int sayisalDeger = 4;
			System.out.println("sayisal değer: "+ sayisalDeger);
			
			// += ++ ** -= ...
			sayisalDeger += 1;
			System.out.println("sayisal değer: "+ sayisalDeger);
			
			sayisalDeger++;
			System.out.println("sayisal değer: "+ sayisalDeger);
			
			sayisalDeger += 5;
			System.out.println("sayisal değer: "+ sayisalDeger);
			
			sayisalDeger -- ;
			System.out.println("sayisal değer: "+ sayisalDeger);
			
			// *=   /=  &=  yukarıdaki mantıkla aynı çalışır bunlara bakabilrisin...
			
			int a = 3;
			int b = a++; // DİKKAT b ye önce a'yı atar. sonra ++ işlemiyle atanan değeri bir artırır. 
			System.out.println("a: "+ a + " b: "+ b); // a:4 b:3 döner
			
			int aa = 3 ; 
			int bb = ++aa ; //
			System.out.println("aa: "+ aa + " bb: "+ bb); // aa:4 bb:4 atar 

			int aaa=3 ;
			int bbb= 4;
			int ccc= 5;
			int  tpl = aaa++ + ++bbb + --ccc ; // tpl = 3(toplamadan sonra artıracak) + 5(toplamadan önce artıracak) + 4(toplamadan önce azaltacak) = 12 // aaa: 3 bbb:5 ccc:4 // aaanın değeri şimdi 4 oldu
			System.out.println("tpl: "  + tpl); 
			
	}

}
