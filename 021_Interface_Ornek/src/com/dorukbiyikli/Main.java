package com.dorukbiyikli;

public class Main {

	
	//Polymorphism over interfaces
	public static void kisaSurelikUc(IUcabilir kus ) { // parametre olarak Hayvan h alırsa mesela kediyi de pass edeibliriz ana yanlış olur...
		System.out.println("\n-------\n");
		kus.kanatCirp();
	}
	
	// Polymorphism over inheritance 
	public static void hayvan2kezSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
		hayvan.sesCikar();
	}
	
	public static void yirticiSaldirisi(IYirticiHayvan yirtici) {
		System.out.println();
		yirtici.saldir("Tavşan");
	}
	
	public static IYirticiHayvan yirticiHayvanOlustur() {
		IYirticiHayvan yirticiHayvan = new Kartal("Amerikan Kartalı", 55 , 88);
//		IYirticiHayvan yirticiHayvan = new GoldenRetriever("Goldoo", 55 , 88);
		return yirticiHayvan;

	}
	

	
	
	
	public static void main(String[] args) {
		
		//IUcabilir beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı" ,1 ,12 );
		Guvercin beyazPacaliGuvercin = new Guvercin("Beyaz Paçalı" ,1 ,12 );
		beyazPacaliGuvercin.gagala("yem");
		
		//IUcabilir serce = new Serce("Minik Serce", 1 , 8 ); // bunu interfaceden türetmiş oluruz böyle...
		// öyle yaparsak hayvan2kezSesCikarsin methodunu kullanamayız...
		//nesneyi türetirken Serce sınıfından üretirsek Serce extend ettiği için Hayvan sınıfını... 
		
		Serce serce = new Serce("Minik Serce", 1 , 8 );
		serce.gagala("yem");

		AnkaraKedisi kedi = new AnkaraKedisi("Tekir", 5, 40);
		//Main.kisaSurelikUc(kedi);//The method kisaSurelikUc(IUcabilir) in the type Main is not applicable for the arguments (AnkaraKedisi)
		// kisaSurelikUc methoduna parametre olarak Hayvan h verirsem bu hata vermez... 
		
		Main.kisaSurelikUc(serce);
		Main.kisaSurelikUc(beyazPacaliGuvercin);
		System.out.println("***************");
		Main.hayvan2kezSesCikarsin(kedi);
		Main.hayvan2kezSesCikarsin(serce);
		Main.hayvan2kezSesCikarsin(kedi);
		
		
		// Yırtıcı Saldırısı:
		Kartal kartal = new Kartal();
		Main.yirticiSaldirisi(kartal);
		Main.yirticiSaldirisi(new GoldenRetriever("Goldie", 40, 100));
  		
		
		System.out.println("********************");
		
		// şu interfacei implement etsin diterek standartlara göre yazılım işi yapılıyor... 
		// mesela bir yazılım içn farklı şeyşer yapılabilir firmalar tarafından 
		// şu interfacei implement etmek gerektiğinde her firma detaylarını birbiriyle paylaşmadan ( çünkü ticari sır ) 
		// aynı işleri yapmak zorunda olduklarını bilebilirler...
		
		// ınterfaceler ile yazılınca bi nesneyi değiştirip kodu koruyabiliriz... 
		// A firmasının objectlerini B firmasının objectleriyle değiştirebiliriz. 
		// ikisi de önceden anlaşılan interface1 üzerinden çalışıyorsa
		// Interface1 nesne = new AFirmaObject();      Interface1 nesne = new BFirmaObject();
		// Bunlar interchangable olacak.
	}

}
