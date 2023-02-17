package com.dorukbiyikli;

public class Main {

	public static void main(String[] args) {
		Kutu kutu1 = new Kutu();
		kutu1.hacim = 50;
		kutu1.kutununGidecegiAdres = "Bursa " ; 
		
		Kutu kutu2 = new Kutu();
		kutu2.hacim = 75;
		kutu2.kutununGidecegiAdres = "İzmir "; 
		
		Kutu kutu3 = new Kutu();
		kutu3.hacim = 82;
		kutu3.kutununGidecegiAdres = "İstanbul " ;  

		// int[] dizi = new int[3];
		
		Kutu[] dizi = new Kutu[3];
		//dizi[0].hacim = 90; // hata verir çünkü dizinin 0. elemanı
		
		dizi[0] = kutu1;
		dizi[0].hacim = 90;
		System.out.println(dizi[0].hacim);
		System.out.println(kutu1.hacim);
		
		dizi[1] = new Kutu();
		dizi[1].hacim = 120;
		System.out.println(dizi[1].hacim);
	
		if (dizi[2]==null) {
			System.out.println("dizinin 2. indexli elemanı null");
			
		}
		
		//dizi[2].hacim = 500; // henüz assign etmedik null duruyor. bu halde atama yapamam önce dizi[2] =  new Kutu()...
		//dizi[2] = new Kutu();
		dizi[2] = kutu2 ;
		dizi[2].hacim = 500;
		System.out.println(dizi[2].hacim);
		
		
		System.out.println("\nDizi içinde döngü: ");
		for(int i=0; i<dizi.length;i++) {
			System.out.println(dizi[i].hacim);
		}
		
		System.out.println("\nDizi içinde döngü for each: ");
		for(Kutu kutu : dizi) {
				System.out.println("hacim: "+kutu.hacim+ " adres: "+ kutu.kutununGidecegiAdres +" ");
			}
		
		
		
	
	
	
	
	
	}
	

}
