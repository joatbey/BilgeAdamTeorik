package com.dorukbiyikli;

import java.io.Serializable;

public class Motor implements Serializable { // mutlaka içerdeki nesnelerin de serializable olması lazım aksi takdirde
												// java.io.NotSerializableException: com.dorukbiyikli.Motor hatası alırız
	private int motorNo;

	public Motor(int motorNo) {
		super();
		this.motorNo = motorNo;
	}

	public int getMotorNo() {
		return motorNo;
	}

	public void setMotorNo(int motorNo) {
		this.motorNo = motorNo;
	}

	@Override
	public String toString() {
		return "Motor [motorNo=" + motorNo + "]";
	}

}
