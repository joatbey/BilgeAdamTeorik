package com.dorukbiyikli;

public class Sekreter extends Personel {

	private long tel1SeriNo;
	private long tel2SeriNo;

	//hicbir constructor yazamasak da direkt sunu oluşturuyor java: 
	public Sekreter() {
		super(); // biz bunu yazmasak da java buraya gorunmez bi super() çağrısı ekler.
	}
	
	// alt sinif constructorları mutlaka 1 tane üst sınıf constructor'ı çağırlak zorundadur. Extra constructor otomatik cağrılmaz!...
	// Siz üst sınıf constructorı cagirmazsanız java boş constructoru çağırır.
	// Siz özel bir constructor yazarsanız onu kullanır kendisi super() i cagirmaz.
	public Sekreter(long tel1SeriNo) {
		super("test stringi",7); // ben özellikle bunu çağırıyorum
		this.tel1SeriNo = tel1SeriNo;
		System.out.println("public Sekreter(long tel1SeriNo) cağrıldı");
	}
	
	public long getTel1SeriNo() {
		return tel1SeriNo;
	}

	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}

	public long getTel2SeriNo() {
		return tel2SeriNo;
	}

	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}

}
