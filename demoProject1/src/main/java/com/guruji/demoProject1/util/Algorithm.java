package com.guruji.demoProject1.util;

public class Algorithm {

	public static void main(String[] args) {
		//String testCase = "Guru";
		//String testCase = "Kaabali";
		//String testCase = "Koomaali";
		String testCase = "bubealboori";
		int i,k;
		int[] countCharRepetation = new int[testCase.length()];
		int count;
		int max,temp =1;
		String result = "nothing";
		System.out.println("\tFind the largest substring without the repeatative char\n\n");
		for(i = 0; i < testCase.length(); i++) {			
					
			for(k = i+2; k < testCase.length()+1; k++) {
				//System.out.print("\n\ti ="+i+" k: "+k);				
				String value = testCase.substring(i, k);
				//tocheck string contains common char or not
				//System.out.println("\n"+testCase.substring(i, k)+" checkStringHavingCommonChar(value) "+checkStringHavingCommonChar(value));
				if(!checkStringHavingCommonChar(value)) {
					max = value.length();
					System.out.println(""+value+" length = "+max);
					
					if(temp<max) {
						temp = max;
						result = value;
					}
					
				}
				
			}
			
			System.out.print("\n");
		}
		System.out.print("output  :"+result);
		for(i = 0; i < testCase.length(); i++) {
			//System.out.print("\t"+countCharRepetation[i]);
		}

		//System.out.print("\n\t"+testCase.substring(0, 3));
	}
	
	public static boolean checkStringHavingCommonChar(String value) {
		//System.out.print("\n Now checking the string :"+value);
		boolean isStringHavingCommonString = false;
		int i,k;
		int count;
		for(i = 0; i < value.length(); i++) {	
			count = 0;
			for(k = 0;k < value.length(); k ++) {
				if(value.charAt(i) == value.charAt(k)) {
					count++;
					if(count>1) {
						isStringHavingCommonString = true;
					}					
				}
			}	
			//System.out.print("\n\t"+value.charAt(i)+" "+count);
		}
		return isStringHavingCommonString;
	}

}
