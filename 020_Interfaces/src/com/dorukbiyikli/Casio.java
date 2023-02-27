package com.dorukbiyikli;

public class Casio implements ITarihSaatGoster {// casio classı artık bu interfacein içindeki 'sözleşmeleri' yapmak zorunda...

	@Override
	public String tarihGoster() {
		// TODO Auto-generated method stub
		return "1 Ocak 2020";
	}

	@Override
	public String saatGoster() {
		// TODO Auto-generated method stub
		return "14:58";
	} 
	

}
