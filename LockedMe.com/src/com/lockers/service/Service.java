package com.lockers.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Service {

	Map<String,File> map = new HashMap<String,File>();
	
	public boolean addFile(String fileName,String fileLocation ,String fileData )
	{
		boolean status = false;
	
		try {
			FileWriter fw = new FileWriter(fileLocation+"/"+fileName+".txt");
			
			fw.write(fileData);
			System.out.println("File write completed!!");
			fw.close();
	        status = true;
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		
		return status;
	}
	
	public boolean deleteFile()
	{
        boolean status = false;
		
        
		return status;
	}
	public BufferedReader searchFile(String fName, String fLocation) throws FileNotFoundException
	{
		BufferedReader br =null;
		
		   File directoryPath = new File(fLocation);
		      //List of all files and directories
		      String contents[] = directoryPath.list();
		      
		     // System.out.println("List of files and directories in the specified directory:");
		      for(int i=0; i<contents.length; i++) {
		         if(contents[i].equalsIgnoreCase(fName+".txt"))
		         {
		        	 File file = new File(fLocation+"/"+fName+".txt");
		        	  br = new BufferedReader(new FileReader(file));
		        	 
		         }
		      }
		
		return br;
		
	}
	

}
