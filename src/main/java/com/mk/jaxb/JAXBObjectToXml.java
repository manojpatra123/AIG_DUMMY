/**
 * 
 */
package com.mk.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 * 
 *
 * @author mpatra
 */
 
public class JAXBObjectToXml {
    public static void main(String[] args) {
        Track track = new Track();
        track.setId(1);
        track.setTitle("Hey <<><<<><<><< \"\"\"'Dude");
 
        try {
            JAXBContext context = JAXBContext.newInstance(Track.class);
 
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(track, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
