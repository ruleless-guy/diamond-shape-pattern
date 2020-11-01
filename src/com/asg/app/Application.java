package com.asg.app;

public class Application {
	
	public static void main(String[] args) {
		int num = 26;
		Application app = new Application();
		app.showDiamondShapePattern(num);
	}
	
	private int countDigitsFromOne(int num) {
		if(num < 1) {
			return 0;
		}
		int digit = String.valueOf(num).length();
		int minimunNumber = (int)Math.pow(10, digit-1);
		int numCount = num - minimunNumber +1;
		return numCount * digit + countDigitsFromOne(minimunNumber-1);
	}
	
	
	public void showDiamondShapePattern(int num) {
		
		int totalDigit = countDigitsFromOne(2*num-1);
		
		for(int i = 1; i<=num; i++) {
			
			int spaceLength = ((totalDigit / 2) - countDigitsFromOne(2*i-1) / 2 );
			
			for(int j = 1; j <= spaceLength; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<= 2*i-1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(int i = num-1; i >= 1; i--) {
			
			int spaceLength = ((totalDigit / 2) - countDigitsFromOne(2*i-1) / 2 );
			
			for (int k = 1; k <= spaceLength; k++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
	
}
