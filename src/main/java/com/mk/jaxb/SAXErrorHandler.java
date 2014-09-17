/**
 * 
 */
package com.mk.jaxb;

/**
 * 
 *
 * @author mpatra
 */

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

public class SAXErrorHandler {
    public static void main(String[] args) throws Exception {
        SAXErrorHandler demo = new SAXErrorHandler();
        demo.run();
    }

    public void run() throws Exception {
        //
        // Creates the SAXParserFactory and SAXParser instance.
        //
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        //
        // Parse the error.xml file using MySAXHandler as the 
        // DefaultHandler implementation.
        //
        InputStream is = getClass().getResourceAsStream("Elements.xml");
        DefaultHandler handler = new MySAXHandler();
        parser.parse(is, handler);
    }

    //
    // Override the error handling methods defined by the ErrorHandler
    // interface. This method will handler exceptions thrown by the
    // parsing process.
    //
    class MySAXHandler extends DefaultHandler {
        @Override
        public void warning(SAXParseException e) throws SAXException {
            System.out.println("warning   : " + e.getMessage());
        }

        @Override
        public void error(SAXParseException e) throws SAXException {
            System.out.println("error     : " + e.getMessage());
        }

        @Override
        public void fatalError(SAXParseException e) throws SAXException {
            System.out.println("fatalError: " + e.getMessage());
        }
    }
}
