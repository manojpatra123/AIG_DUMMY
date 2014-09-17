/**
 * 
 */
package com.mk.apache.pdfbox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 * 
 *
 * @author mpatra
 */

public class HelloWorldPDF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PDDocument pdfDoc = null;
		try {
			
			PDPage page = null;
			pdfDoc = new PDDocument();
			page = new PDPage();
			pdfDoc.addPage(page);
			PDFont font = PDType1Font.HELVETICA_BOLD;

	   			PDPageContentStream contentStream = new PDPageContentStream(pdfDoc, page);
/*				contentStream.beginText();
				contentStream.setFont( font, 12 );
*/			
	           
/*	           content.moveTextPositionByAmount( 100, 700 );
	           content.drawString("Hello from AIG");
	           //content..moveTextPositionByAmount(200, 700);
	           content.drawString("This is my 2nd line");

	           content.endText();
	           content.close();
	          pdfDoc.save("HelloWorld.pdf");1
	          pdfDoc.close();*/
	          PDFont pdfFont = PDType1Font.HELVETICA;
	          float fontSize = 25;
	          float leading = 1.5f * fontSize;

	          PDRectangle mediabox = page.findMediaBox();
	          float margin = 72;
	          float width = mediabox.getWidth() - 2*margin;
	          float startX = mediabox.getLowerLeftX() + margin;
	          float startY = mediabox.getUpperRightY() - margin;

	          String text = "I am trying to create a PDF file with a lot of text contents in the document. I am using PDFBox"; 
	          List<String> lines = new ArrayList<String>();
	          int lastSpace = -1;
	          while (text.length() > 0)
	          {
	              int spaceIndex = text.indexOf(' ', lastSpace + 1);
	              if (spaceIndex < 0)
	              {
	                  lines.add(text);
	                  text = "";
	              }
	              else
	              {
	                  String subString = text.substring(0, spaceIndex);
	                  float size = fontSize * pdfFont.getStringWidth(subString) / 1000;
	                  if (size > width)
	                  {
	                      if (lastSpace < 0) // So we have a word longer than the line... draw it anyways
	                          lastSpace = spaceIndex;
	                      subString = text.substring(0, lastSpace);
	                      lines.add(subString);
	                      text = text.substring(lastSpace).trim();
	                      lastSpace = -1;
	                  }
	                  else
	                  {
	                      lastSpace = spaceIndex;
	                  }
	              }
	          }

	          contentStream.beginText();
	          contentStream.setFont(pdfFont, fontSize);
	          contentStream.moveTextPositionByAmount(startX, startY);            
	          for (String line: lines)
	          {
	              contentStream.drawString(line);
	              contentStream.moveTextPositionByAmount(0, -leading);
	          }
	          contentStream.endText(); 
	          contentStream.close();

	          try {
				pdfDoc.save("break-long-string.pdf");
			} catch (COSVisitorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      finally
	      {
	          if (pdfDoc != null)
	          {
	        	  try {
					pdfDoc.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          }
	      }	
		
		
	}

}
