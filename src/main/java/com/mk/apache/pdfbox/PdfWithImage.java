/**
 * 
 */
package com.mk.apache.pdfbox;

/**
 * 
 *
 * @author mpatra
 */

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.edit.*;
import org.apache.pdfbox.pdmodel.graphics.xobject.*;
import java.io.*;
 
public class PdfWithImage {
    
     // Note that this code works ONLY with jpg files
    public static void main(String[] args) {
        PDDocument doc = null;
        try{
          /* Step 1: Prepare the document.
           */
         doc = new PDDocument();
         PDPage page = new PDPage();
         doc.addPage(page);
         
         /* Step 2: Prepare the image
          * PDJpeg is the class you use when dealing with jpg images.
          * You will need to mention the jpg file and the document to which it is to be added
          * Note that if you complete these steps after the creating the content stream the PDF
          * file created will show "Out of memory" error.
          */
         
         PDXObjectImage image = null;
         image = new PDJpeg(doc, new FileInputStream("CamilionDataModel.JPG"));
         
         /* Create a content stream mentioning the document, the page in the dcoument where the content stream is to be added.
          * Note that this step has to be completed after the above two steps are complete.
          */
         PDPageContentStream content = new PDPageContentStream(doc, page);
 
       /* Step 3:
        * Add (draw) the image to the content stream mentioning the position where it should be drawn
        * and leaving the size of the image as it is
        */
         content.drawImage(image,1,1);
         content.close();
       
         /* Step 4:
          * Save the document as a pdf file mentioning the name of the file
          */
        
        doc.save("ImageNowPdf.pdf");
       
        } catch (Exception e){
             System.out.println("Exception");
        }
    }
}
