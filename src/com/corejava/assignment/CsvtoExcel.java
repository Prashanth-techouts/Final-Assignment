package com.corejava.assignment;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class CsvtoExcel {

	
	public static void main(String[] args) throws FileNotFoundException {
	
		 
	        String fName = "files\\addresses.csv";
	        String thisLine;
	        String finalfile = null;
	        int count=0;
	        FileInputStream fis = new FileInputStream(fName);
	        DataInputStream dis = new DataInputStream(fis);
	        int i=0;
	        ArrayList arList = new ArrayList();
	        try {
				while ((thisLine = dis.readLine()) != null)
				{
				   ArrayList al = new ArrayList();
				    String strar[] = thisLine.split(",");
				   // System.out.println(Arrays.toString(strar));
				    for(int j=0;j<strar.length;j++)
				    {
				    	//String edit = strar[j].replace('\n', ' ');
				        al.add(strar[j]);
				    }
				    arList.add(al);
				   // System.out.println(arList.toString());
				    i++;
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}

	        try
	        {
	            HSSFWorkbook hwb = new HSSFWorkbook();
	            FileWriter fw=new FileWriter("files\\test.xls");
                BufferedWriter bw=new BufferedWriter(fw);
	            HSSFSheet sheet = hwb.createSheet("new sheet");
	            String data = null;
	            for(int k=0; k<arList.size(); k++)
	            {
	            	HSSFCell cell;
	                ArrayList ardata = (ArrayList)arList.get(k);
	                HSSFRow row = sheet.createRow((short) 0+k);
	                for(int p=0;p<ardata.size();p++)
	                {
	                     cell = row.createCell((short) p);
	                     data = ardata.get(p).toString();
	                 
	                    cell.setCellValue(data);
	                    finalfile=cell.toString();
	                   // System.out.println(finalfile);
	                    bw.write(finalfile);
	                }
	  
	            }
	            
	            bw.close();
	            FileReader fr;
	        	
	            System.out.println("Your excel file has been generated");
	        } catch ( Exception ex ) {
	            ex.printStackTrace();
	        } 
	}

}
