package com.dorukbiyikli;

// constructor: Nesnelerin ilk oluşumu sırasında çağırılan metoddur . Constructorlar public olur.

// yazılımcı sınıf içinde hiçbir constructor tanımlamazsa java o sınıf için otomatik boş bir constructor(yapıcı method) oluşturur

// ancak
// yazılımcı sınıf içine herhangi bir ya da birden fazla parametre alan bir constructor tanımlarsa - ki biz burada yaptık-
// java otomatik constructor oluşturmaz bu durumda boş constructora ihtiyac duyarsanız 
// sizin manuel olarak boş constructoru kendiniz oluşturmanız gerekir.

public class Motor {

	private int motorHacmi;
	private String motorNo = "";
	private int yakitTuketimi;

	public int getMotorHacmi() {
		return motorHacmi; // return this.motorHacmi ile aynı
	}

	public Motor(int motorHacmi, String motorNo, int yakitTuketimi) { // return tipi hep bu nesne oluğu için public
																		// Motor Motor yazmıyor öyle uygun görmüşler...
		// ilk nesne oluştururken hangi üye değişkenleri istersem onları yazıyorum ...

//		this.motorHacmi= motorHacmi;
//		this.motorNo = motorNo;
//		this.yakitTuketimi = yakitTuketimi; 
		this.setMotorHacmi(motorHacmi); // böyle yapmalı clean code işi... aynı methodu iki kere yazmak yerine
										// çağıralım...
		this.motorNo = motorNo; // bunun halihazırda yok mehtodu
		this.setYakitTuketimi(yakitTuketimi);
	}

	// boş constructor
	public Motor() {

	};

	public void setMotorHacmi(int motorHacmi) { // parametre olarak almış , aynı kelimetyi kullanmış , motorHacmi
												// parametre, this.motorHacmi üye değişken
		if (motorHacmi >= 800 && motorHacmi <= 10000) {
			this.motorHacmi = motorHacmi;
		} else {
			System.out.println("Motor hacmi 800-10000 dışında girdiğiniz için otomatik olarak 800 olarak ayarlanmıştır.");
			this.motorHacmi = 800;
		}

	}

	public int getYakitTuketimi() {
		return yakitTuketimi;
	}

	public void setYakitTuketimi(int yakitTuketimi) {
		if (yakitTuketimi >= 3 && yakitTuketimi <= 25) {
			this.yakitTuketimi = yakitTuketimi;
		} else {
			System.out.println("yakıt tüketimi makul sınırlar dışında muhtemelen yanlış değer girildi . en küçük değere ayarlanıyor.");
			this.yakitTuketimi = 3;
		}
	}

	public String getMotorNo() {
		return motorNo;
	}

	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", motorNo=" + motorNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}

}
