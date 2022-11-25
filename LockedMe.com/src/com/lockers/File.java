package com.lockers;

public class File 
{
	String fileName;
	String fileLocation;
	String fileData;
	
	public File(String fileName, String fileLocation, String fileData) {
		super();
		this.fileName = fileName;
		this.fileLocation = fileLocation;
		this.fileData = fileData;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	public String getFileData() {
		return fileData;
	}
	public void setFileData(String fileData) {
		this.fileData = fileData;
	}
	
	

}
