package com.alikaya;

public class YardimciSinif2 {

	public static void main(String[] args) {
		YardimciSinif.hello();
		
		YardimciSinif.hello2(); // protected olunca aynı package içinde kullanabiliriz.
		
		//YardimciSinif.hello3(); // private olunca burada kullanamam: The method hello3() from the type YardimciSinif is not visible hatası verir...
	}

}
