package com.mk.core;

public class DoubleCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "1.2149759999999998";
		
		Double d1 = new Double(s1);
		Double d2 = new Double(0.0025000000000000000520417042793042128323577344417572021484375);
		System.out.println("Double value:" + Double.valueOf(s1).toString());

	}

}
