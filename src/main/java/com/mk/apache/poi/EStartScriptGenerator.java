/**
 * 
 */
package com.mk.apache.poi;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * 
 *
 * @author mpatra
 */

public class EStartScriptGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileInputStream file = null;
		try{
			file = new FileInputStream(new File("resource/spring/OL_eStart_ReferenceData_Template_Sheet.xls"));
			//Get the workbook instance for XLS file
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			 
			//Get first sheet from the workbook
			HSSFSheet sheet = workbook.getSheetAt(0);

			Row headerRow = sheet.getRow(0);
			Scanner in = new Scanner(System.in);
			System.out.println("-- Confirm the header change");
			System.out.print("--Enter Target MapId Column No(Source Map Id starts with Column 0):");
			// Cells start with position 0
			int targetMapIdPos = new Integer(in.nextLine()).intValue();
			System.out.print("--Enter Target System Code(ES for eStart, PS for Publishing Service, BS for NGBS Service):");
			String targetSystem = in.nextLine().toUpperCase();
			//Get iterator to all the rows in current sheet
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext()){
				Row row = rowIterator.next();
				if(row.getRowNum() >= 1){
					if(Cell.CELL_TYPE_BLANK != row.getCell(0).getCellType()){
						System.out.println("--TMAP_HEADER \n" + createTMapHeaderQuery(row, targetMapIdPos, targetSystem));
						System.out.println("--TMAPPING \n" + createTMappingQuery(row, targetMapIdPos, targetSystem));
						System.out.println("--TMAP_DETAIL \n" +createTMapDetailQuery(row, headerRow, targetMapIdPos, targetSystem));
						
					//	System.out.println(createSrcHeaderMap(headerRow, targetMapIdPos));
					//	System.out.println(createTrgHeaderMap(headerRow, targetMapIdPos));
	
					}
				}
				
			}


		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static String createTMapHeaderQuery(Row row, int targetMapIdPos, String targetSystem){
		String headerQuery = "INSERT INTO TMAP_HEADER(MAP_ID, MAP_DS, COLUMN_CT, CREATE_TS, CREATE_USER_ID, UPDATE_TS, UPDATE_USER_ID)\nVALUES(";
		String middleQuery = new String();
		if("ES".equalsIgnoreCase(targetSystem)){
			middleQuery = ", 'ESTART Standard Reference Mapping',";  
		} else if("PS".equalsIgnoreCase(targetSystem)){
			middleQuery = ", 'Publishing Service Reference Mapping',";
		} else if("BS".equalsIgnoreCase(targetSystem)){
			middleQuery = ", 'NGBS Service Reference Mapping',";
	}
		
		String tailQuery = ", current timestamp, 'CCUW4.5', current timestamp, 'CCUW4.5');";
		String srcMapId = cellStringValue(row.getCell(0)); 
		String trgMapId = cellStringValue(row.getCell(targetMapIdPos));
		StringBuffer srcQuery = new StringBuffer(headerQuery).append(srcMapId).append(middleQuery).append(targetMapIdPos-1).append(tailQuery);
		StringBuffer trgQuery = new StringBuffer(headerQuery).append(trgMapId).append(middleQuery).append(row.getLastCellNum()- targetMapIdPos-1).append(tailQuery);
		return srcQuery.append("\n").append(trgQuery).toString();
	}

	private static String createTMappingQuery(Row row , int targetMapIdPos, String targetSystem){
		String headerQuery = "INSERT INTO TMAPPING(SOURCE_MAP_ID, TARGET_SYSTEM_ID, EFFECTIVE_DT, TARGET_MAP_ID, EXPIRY_DT, CREATE_TS, CREATE_USER_ID, UPDATE_TS, UPDATE_USER_ID)\nVALUES(";
	//	String middleQuery = ", 'ES', '1900-01-01', ";
		StringBuffer middleQuery = new StringBuffer(", '").append(targetSystem).append("', '1900-01-01', ");
		String tailQuery = ", '2070-12-31', current timestamp, 'CCUW4.5', current timestamp, 'CCUW4.5');";
		String srcMapId = cellStringValue(row.getCell(0)); 
		String trgMapId = cellStringValue(row.getCell(targetMapIdPos));
		StringBuffer query = new StringBuffer(headerQuery).append(srcMapId).append(middleQuery).append(trgMapId).append(tailQuery);
		return query.toString();
	}
	
	private static String createTMapDetailQuery(Row row, Row headerRow, int targetMapIdPos, String targetSystem){
		StringBuffer query = new StringBuffer();
		String headerQuery = "INSERT INTO TMAP_DETAIL(MAP_ID, SYSTEM_ID, TABLE_NM, COLUMN_NM, COLUMN_VALUE_TX, COLUMN_SQN, CREATE_TS, CREATE_USER_ID, UPDATE_TS, UPDATE_USER_ID)\nVALUES(";
		String srcMiddleQuery = ", 'GB', 'GB', '";
//		String trgMiddleQuery = ", 'ES', 'ES', '";
		StringBuffer trgMiddleQuery = new StringBuffer(", '").append(targetSystem).append("', '").append(targetSystem).append("', '");
		String tailQuery = ", current timestamp, 'CCUW4.5', current timestamp, 'CCUW4.5');";
		Map<Integer, String> srcHeaderMap = createSrcHeaderMap(headerRow, targetMapIdPos);
		Map<Integer, String> trgHeaderMap = createTrgHeaderMap(headerRow, targetMapIdPos);
		String srcMapId = cellStringValue(row.getCell(0)); 
		String trgMapId = cellStringValue(row.getCell(targetMapIdPos));
		int loc = 1;
		for(Map.Entry entry: srcHeaderMap.entrySet() ){
			query = query.append(headerQuery).append(srcMapId).append(srcMiddleQuery).append(entry.getValue()).append("', '").append(cellStringValue(row.getCell(loc))).append("', ").append(entry.getKey()).append(tailQuery).append("\n");
			loc++;
		}
		loc = targetMapIdPos+1;
		for(Map.Entry entry: trgHeaderMap.entrySet() ){
			query = query.append(headerQuery).append(trgMapId).append(trgMiddleQuery).append(entry.getValue()).append("', '").append(cellStringValue(row.getCell(loc))).append("', ").append(entry.getKey()).append(tailQuery).append("\n");
			loc++;
		}
		
		return query.toString();
	}
	
	private static Map createSrcHeaderMap(Row row, int targetMapIdPos){
		Map<Integer, String> srcHeaderMap = new LinkedHashMap<>();
		
		for(int i=1; i<targetMapIdPos;i++){
			srcHeaderMap.put(new Integer(i), cellStringValue(row.getCell(i)));
		}		
		return srcHeaderMap;
	}
	
	private static Map createTrgHeaderMap(Row row, int targetMapIdPos){
		Map<Integer, String> trgHeaderMap = new LinkedHashMap<>();
		
//		System.out.println("LAST CELL NO:" + row.getLastCellNum());
		
		for(int i=targetMapIdPos+1; i< row.getLastCellNum();i++){
			if(Cell.CELL_TYPE_BLANK != row.getCell(i).getCellType()){
				trgHeaderMap.put(new Integer(i-targetMapIdPos), cellStringValue(row.getCell(i)));
			}
		}		
		return trgHeaderMap;
	}
	
	private static String cellStringValue(Cell cell){
		
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
		{
			return cell.getStringCellValue();
		}
		case Cell.CELL_TYPE_NUMERIC: 
		{
			return new Integer((int) cell.getNumericCellValue()).toString();			
		}

		default:
			return "";
		}
	}

}
