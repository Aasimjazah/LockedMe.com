package com.lockers.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.lockers.File;

public class Service {

	Map<String,File> map = new HashMap<String,File>();
	
	public boolean addFile(String fileName,String fileLocation ,String fileData )
	{
		boolean status = false;
		File f = new File(fileName, fileLocation, fileData);
		map.put(fileName,f);
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
	public File searchFile()
	{
		File f= null;
		
		return f;
		
	}
	

}
