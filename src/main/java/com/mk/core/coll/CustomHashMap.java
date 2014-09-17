/**
 * 
 */
package com.mk.core.coll;

import java.util.HashMap;

/**
 * 
 *
 * @author mpatra
 */

public class CustomHashMap extends HashMap {
	
	/* (non-Javadoc)
	 * @see java.util.AbstractMap#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	/* (non-Javadoc)
	 * @see java.util.AbstractMap#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.toString().equals(o.toString());
	}

}
