package com.dorukbiyikli;

// unchecked exception sınıflarının birinden turetelim:
public class AsiriHizException extends ArithmeticException{

	public AsiriHizException(String message) {
		
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir aşırı hız");
	}
	
	
	
	
	
	
	
}
