package com.revature.arrays;

import java.util.Arrays;

public class FunWIthArrays {
	//group of like typed variables that referred by a common name
	
	public static void main(String[] args) {
		
		int [] myArray = new int[6];
		int [] chaos = {12, 5, 10, 54, 3, 13, 16, 13, 99};
		//System.out.println(chaos[5]);
		//chaos[5] = 9;
		//System.out.println(chaos[5]);
		
		for(int i=0; i<chaos.length; i++) {
			chaos[i] = chaos[i]*4;
		}
		
		for(int i:chaos) {
			//System.out.println(i);
		}
		
		Arrays.sort(chaos);
		
		for(int i:chaos) {
			//System.out.println(i);
		}
		
		//System.out.println(Arrays.toString(chaos));
		Arrays.parallelSort(chaos);
		System.out.println(Arrays.toString(chaos));

	}

}
