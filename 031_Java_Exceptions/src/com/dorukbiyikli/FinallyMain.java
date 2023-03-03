package com.dorukbiyikli;

public class FinallyMain {

	
	// finally bloku içindeki kodlarınız try-catch statementların sonunda mutlaka çalıştırılır...
	// hatayı bulamadık mesela...
	// yine de çalıştırır.
	// çok acayip bir hata oluştu der mesela öyle yazarım...
	// yani program patlasa da finally bloku çalışır...
	
	
	
	// dosya kapama veritabanı bağlantısı kapama açık bir network soketini kapmaa
	// gibi işlemler mutlaka finally kod bloğu içinde yapılır...
	
	
	public static void main(String[] args) {

		try {
			int x =5/0;
			// x=5/1 ; de yazsak yine finally blokuna girer
		} catch (Exception e) {
			System.out.println("Bir hata oluştu.");
		}finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır..."); // hata olsa da bunu çalıştırdı.
			
		}
		System.out.println("bye");
	}

}


