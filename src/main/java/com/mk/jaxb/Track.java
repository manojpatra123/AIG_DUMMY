/**
 * 
 */
package com.mk.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//import com.sun.xml.internal.txw2.annotation.XmlCDATA;
/**
 * 
 *
 * @author mpatra
 */

 
@XmlRootElement
public class Track {
    private Integer id;
    private String title;
 
    public Track() {
    }
 
    public Integer getId() {
        return id;
    }
 
    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }
 
    @XmlElement
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
