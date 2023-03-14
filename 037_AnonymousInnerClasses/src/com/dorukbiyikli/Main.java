package com.dorukbiyikli;

public class Main {

	// Java Anonymous Inner Class sınıf ismi olmayan ve sadece 1 nesnesi olan sınıf
	// türleridir.

	// Anonymous Inner Class'lar ne zaman faydalıdır?
	// Bir sınıfın bir metodunu override edip tek bir nesne oluşturmak istediğimiz
	// zaman kullanılabilir.

	public static void main(String[] args) {

		// Anonymous Inner Class: bi nesne kullanmak için class yazıp inheritance
		// almakla uğraşmamak için. obje için methodu override etmişim ama class olarak
		// bi adı yok o yuzden anonymous deniyor.

		Insan vejeteryanInsan = new Insan() {
			public void yemekYe() {
				System.out.println("sadece sebze ve meyve yiyor..");
			}
		};
		Insan vejeteryanInsan2 = new Insan() {
			public void yemekYe() {
				System.out.println("sadece sebze ve meyve yiyor..");
			}
		};

		vejeteryanInsan.yemekYe();
		vejeteryanInsan.suIc();

		System.out.println("* * * * * * * * *");
		Insan insan = new Insan();
		insan.yemekYe();
		insan.suIc();
		System.out.println("* * * * * * * * *");
		vejeteryanInsan2.yemekYe();
		vejeteryanInsan2.suIc();

	}

}