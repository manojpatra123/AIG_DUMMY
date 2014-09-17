/**
 * 
 */
package com.mk.spring.Transaction;

/**
 * 
 *
 * @author mpatra
 */

public class User {

	private int PK_ID;
	private String PRODUCT_CD;

	public int getPK_ID() {
		return PK_ID;
	}
	public void setPK_ID(int pK_ID) {
		PK_ID = pK_ID;
	}
	public String getPRODUCT_CD() {
		return PRODUCT_CD;
	}
	public void setPRODUCT_CD(String pRODUCT_CD) {
		PRODUCT_CD = pRODUCT_CD;
	}
}
