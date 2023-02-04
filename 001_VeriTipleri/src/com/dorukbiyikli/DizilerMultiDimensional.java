package com.dorukbiyikli;

public class DizilerMultiDimensional {

	public static void main(String[] args) {
		int[] tekBoyutluDizi = new int[4]; // {0,0,0,0}
		int[] tekBoyutluDizi2 = {3,7,12,95,23} ; 
		
		// çok boyutlu dizi yani matrix
		int[][] cokBoyutluDizi = new int[2][3] ; // 2 row (satır)    3 column (sütun) // çift [][] olduğunu unutma 
		// { {0,0,0}, {0,0,0} }
		//
		// 0 0 0 
		// 0 0 0 
		
		cokBoyutluDizi[0][0] = 1;
		// 1 0 0 
		// 0 0 0 
		
		cokBoyutluDizi[1][2] = 8;
		// 1 0 0 
		// 0 0 8
		
		System.out.println(cokBoyutluDizi[0][0]); //1 yazsın
		System.out.println(cokBoyutluDizi[1][2]); // 8 yazsın
 	}

}
