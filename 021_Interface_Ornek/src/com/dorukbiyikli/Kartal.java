package com.dorukbiyikli;

public class Kartal extends Hayvan implements IUcabilir , IYirticiHayvan{
	
	

	public Kartal() {
		// TODO Auto-generated constructor stub
	}

	public Kartal(String ad, int kilosu, int uzunluk) {
		super(ad, kilosu, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub

	}

	@Override
	public void kanatCirp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kanatlariTemizle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adlı kartal sert gagasıyla " + nesne + " gagalıyor...");
		
	}

	@Override
	public void saldir(String nesne) {
		System.out.println(this.getAd()+" isimli kartal" + nesne + " ye pençe ve gagasiyla saldırıyor...");		
		
	}

	
}
