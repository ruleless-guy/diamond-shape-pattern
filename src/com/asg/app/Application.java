package com.asg.app;

public class Application {
	
	public static void main(String[] args) {
		int num = 26;
		showDiamondShapePattern(num);
	}
	
	
	public static void showDiamondShapePattern(int num) {
		
		int totalDigit = findDigits(2*num-1);
		
		for(int i = 1; i<=num; i++) {
			
			int spaceLength = ((totalDigit / 2) - findDigits(2*i-1) / 2 );
			
			for(int j = 1; j <= spaceLength; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<= 2*i-1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(int i = num-1; i >= 1; i--) {
			
			int spaceLength = ((totalDigit / 2) - findDigits(2*i-1) / 2 );
			
			for (int k = 1; k <= spaceLength; k++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
	
	
	public static int findDigits(int num) {
		if(num < 1) {
			return 0;
		}
		int digit = String.valueOf(num).length();
		int base = (int)Math.pow(10, digit-1);
		int numCount = num - base +1;
		return numCount * digit + findDigits(base-1);
	}
	
}
