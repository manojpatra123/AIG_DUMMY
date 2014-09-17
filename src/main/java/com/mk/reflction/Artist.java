/**
 * 
 */
package com.mk.reflction;

/**
 * 
 *
 * @author mpatra
 */

public class Artist {
    private Integer id;
    private String name;
 
    
    /**
	 * @param name
	 */
	public Artist(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }        
}
