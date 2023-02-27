package com.dorukbiyikli;

/*    Nesne yönelimli programlamanın ilk prensibi kapsülleme (encapsulation) olarak adlandırılır. 
 *        
 *  Bu özellik, kodun nesne kullanıcısından gereksiz uygulama ayrıntılarını saklar.      
 *  
 *     Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi  
 *    için bazı işlemler birleştirilerek tek bir işlem gibi gösterilir. Bu birleştirme işlemine kapsülleme denir.   
 *  
 *    Erişim belirteçleri (access modifier) sayesinde kapsülleme çok daha kolay yapılmaktadır.  
 *    Erişim belirteçleri, oluşturulan sınıf veya sınıf içindeki elemanların erişim seviyelerini belirlemek için kullanılan   
 *    anahtar kelimeler grubuna verilen isimdir (public, private, protected).    
 *  
 *       Metotlar ve değişkenler bir anahtar sözcük ile önceden bellirlenen sınırlar dahilinde kullanılabilir.  
 *    Bu anahtar kelimeler şu şekilde sıralanabilir : public, private, protected.
 *  
 *  */

public class Motor {

	private int motorHacmi;
	private String motorNo = "";
	private int yakitTuketimi;

	public int getMotorHacmi() {
		return motorHacmi; // return this.motorHacmi ile aynı
	}

	public void setMotorHacmi(int motorHacmi) { // parametre olarak almış , aynı kelimetyi kullanmış , motorHacmi
												// parametre, this.motorHacmi üye değişken
		if (motorHacmi >= 800 && motorHacmi <= 10000) {
			this.motorHacmi = motorHacmi; // parametrelerin mantıklı isimler olması lazım . o yüzden içinde de aynısını
											// kullanıyorsak this.motorHacmi nesnenin üye deişkeni karıştırmamak için
		} else {
			System.out.println("Motor hacmi 800-10000 dışında girdiğiniz için otomatik olarak 800 olarak ayarlanmıştır.");
		}

	}

	public int getYakitTuketimi() {
		return yakitTuketimi;
	}

	public void setYakitTuketimi(int yakitTuketimi) {
		this.yakitTuketimi = yakitTuketimi;
	}

	public String getMotorNo() {
		return motorNo;
	}

	// getMotorNo var ama setMotorNo koymadık çünkü bunun değiştirilmesini
	// istemiyoruz.

	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", motorNo=" + motorNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}

}
