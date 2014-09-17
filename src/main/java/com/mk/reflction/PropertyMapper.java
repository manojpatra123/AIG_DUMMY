/**
 * 
 */
package com.mk.reflction;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
 
public class PropertyMapper {
 
	public static void main(String[] args) {
        Recording recording = new Recording();
        recording.setId(1);
        recording.setTitle("With The Beatles");
        
        List tracks = new ArrayList();
        Track track1 = new Track();
        track1.setTitle("It Won't Be Long");
        track1.setArtist(new Artist("Manoj"));
        
        Track track2 = new Track();
        track2.setTitle("All I've Got To Do");
 
        Track track3 = new Track();
        track3.setTitle("All My Loving");
        
        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);
        
        recording.setTracks(tracks);
        
        try {
            Track trackOne = (Track) PropertyUtils.getIndexedProperty(recording, "tracks[0]");
            Track trackThree = (Track) PropertyUtils.getIndexedProperty(recording, "tracks[2]");
            
            System.out.println("trackOne.getTitle() = " + trackOne.getTitle());
            System.out.println("trackThree.getTitle() = " + trackThree.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   

    	
 


        
    

