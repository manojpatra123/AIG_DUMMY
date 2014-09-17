/**
 * 
 */
package com.mk.enumPkg;

/**
 * 
 *
 * @author mpatra
 */

public enum SampleEnum {
//	PENNY, NICKLE,DIME,QUARTER;
//	PENNY(1.0), NICKLE(5.5),DIME(10),QUARTER(25);
	PENNY(1) {
        @Override
        public String color() {
                return "copper";
        }
	},
	NICKLE(5) {
        @Override
        public String color() {
                return "bronze";
        }
	}, 
	DIME(10) {
        @Override
        public String color() {
                return "silver";
        }
	},
	QUARTER(25) {
        @Override
        public String color() {
                return "silver";
        }
	};
	
	double value;
	
/*	private SampleEnum(){
		System.out.println("Inside SampleEnum constructor");
	}*/
	private SampleEnum(double param){
		value = param;
		System.out.println("Inside SampleEnum constructor");
	}
	
	  /**
	 * @return
	 */
	public abstract String color();

	@Override
	  public String toString() {
	       switch (this) {
	         case PENNY:
	              System.out.println("Penny: " + value);
	              break;
	         case NICKLE:
	              System.out.println("Nickle: " + value);
	              break;
	         case DIME:
	              System.out.println("Dime: " + value);
	              break;
	         case QUARTER:
	              System.out.println("Quarter: " + value);
	        }
	  return super.toString();
	 }

}
