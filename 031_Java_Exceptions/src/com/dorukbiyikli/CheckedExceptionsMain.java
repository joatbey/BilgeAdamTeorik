package com.dorukbiyikli;

public class CheckedExceptionsMain {

	public static void main(String[] args) {
		// Checked exceptionlar direkt Exception sınıfından türerler
		// Bunlar program compile edilirken yakalanması ve handle edilmesi zorunlu exceptionlardır.
		// Yani programı run ettirmez java bunları çözmeniz gerekir.
		// Bu tarz exceptionlar mutlaka kod run edilmeden try-catch blokları içinde handle edilmelidir.Aksi takdirde compile hatası alırsınız.
		// Programı run edemezsiniz...
		// Checked exceptionlar runtime exceptionlardan türemezler...
		//
		
	//	Thread.sleep(1000); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Unhandled exception type InterruptedException

		
		//try cath ile surround edelim.
		System.out.println(1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println(2);
	}

}
