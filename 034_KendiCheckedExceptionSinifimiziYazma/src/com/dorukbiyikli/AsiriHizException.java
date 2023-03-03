package com.dorukbiyikli;

import java.io.IOException;

//Checked exception sınıflarından birinden turetelim:
public class AsiriHizException  extends IOException{
	
	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir asiri hiz checked exceptiondır...");
	}



}
