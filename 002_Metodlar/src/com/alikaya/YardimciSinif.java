package com.alikaya;

public class YardimciSinif {

	public static void hello() {
		System.out.println("Hello from YardimciSinif");
	// protected ya da private yazsaydık public yerine , diğer packagelardan kullanılamayacaktı.
		
		
	}

	protected static void hello2() {
		System.out.println("Hello2 from YardımciSinif");
	}
	
	private static void hello3() {
		System.out.println("Hello3 from YardimciSinif");
	}


	public static void main(String[] args) {
		YardimciSinif.hello3(); // aynı class içinde private olanı çağırabilirsin.
		
	}






}




