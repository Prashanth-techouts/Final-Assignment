package com.corejava.assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Converttocsv {

	public static void main(String[] args) throws IOException {
		File myfile=new File("C:\\Users\\d1\\Desktop\\input.xlsx");
		int sheetid=0;
		      FileWriter f = new FileWriter("files\\output.csv");
		      Cell cell;
		      OutputStream os;
			try {
			 
		      BufferedWriter bw=new BufferedWriter(f);
		      
			FileInputStream fis=new FileInputStream(myfile);
			
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheetAt(sheetid);
	       
			Iterator<Row> itr=sheet.iterator();
			while (itr.hasNext()) {
				Row row=itr.next();
				
				Iterator<Cell> cellitr=row.iterator();
				while (cellitr.hasNext()) {
					 cell=cellitr.next();
					 String cvfile=null;
					switch (cell.getCellType()) {
					case STRING:  
						cvfile=cell.getStringCellValue();
						break;
					case NUMERIC:
						cvfile=String.valueOf(cell.getNumericCellValue());

					default:
						break;
					}
					
					bw.write(cvfile);
					//System.out.println(cvfile);
					
				}
			}
			
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
