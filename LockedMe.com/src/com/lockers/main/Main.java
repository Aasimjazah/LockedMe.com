package com.lockers.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import com.lockers.service.Service;

public class Main {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";

    static int exit =0;

	
	public static void main(String[] args) throws IOException 
	{
		 File file = new File("D://file handling");
	      //Creating the directory
	     file.mkdir();
	     
		
		Service serv = new Service();
		int choice=0;
		int option;
	   System.out.println(ANSI_YELLOW+"<---------Welcome to LockedMe.com-------->");
	   System.out.println("<-----Developed by Mohd Aasim Ansari----->");
	   System.out.println("------------------------------------------");
	   
	   do {
	   System.out.println(ANSI_YELLOW+"*Please choose any option below*");
	   System.out.println("Default directory - D://file handling");
	   System.out.println("Option 1 -> Retreive files from current directory");
	   System.out.println("Option 2 -> Add a file to the exsiting directory");
	   System.out.println("Option 3 -> Search a file");
	   System.out.println("Option 4 -> Delete a file");
       System.out.println("option 5 -> Exit"+ANSI_RESET);
       Scanner sc = new Scanner(System.in);
       option = sc.nextInt();
       
       switch(option)
       {
          case 1: {
		        	  //To get all files in specified directory   
			           List<String> files =serv.getAllFiles();
			           
			           
			           System.out.println(files);
			           
			           break;
        	        
                  }
          // Case 3: to add the file in specified path
          case 2: {
        	          sc.nextLine();
        	          System.out.println("Enter file name");
        	          String fName = sc.nextLine();
        	         // sc.nextLine();
        	          System.out.println("Enter the file location");
        	          String fLocation = sc.nextLine();
        	          System.out.println("Enter file Data");
        	         // sc.nextLine();
        	          String fData = sc.nextLine();
        	          boolean status =   serv.addFile(fName,fLocation, fData);
        	          if(status)
        	        	  System.out.println("File stored successfully");
        	          else
        	        	  System.out.println("File not stored! Enter proper File location");
        	          break;
                  }
          
          case 3: {
        	  sc.nextLine();
                System.out.println("Enter file name");
                String fName = sc.nextLine();
                System.out.println("Enter file Location");
                String fLocatoin = sc.nextLine();
                
              
                try {
					BufferedReader br = serv.searchFile(fName, fLocatoin);
						if(br!=null) {
						 System.out.println(ANSI_GREEN+fName+".txt Found on the given path, below is file content"+ANSI_RESET);
			  	         System.out.println("-------------------------------------");
						 String st;
					        // Condition holds true till
					        // there is character in a string
					        while ((st = br.readLine()) != null)
					 
					            // Print the string
					            System.out.println(st);
					        System.out.println("--------------------------------------");
					    }
						else
						{
							System.out.println(ANSI_RED+"File not found!"+ANSI_RESET);
						}
					
						br.close();
                	}
				    	catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	break;  
            }
          
          case 4: {
        	  //To delete a file  
        	  sc.nextLine();
              System.out.println("Enter file name");
              String fName = sc.nextLine();
              System.out.println("Enter file Location");
              String fLocatoin = sc.nextLine();
              
              if(serv.deleteFile(fName, fLocatoin))
              {
            	  System.out.println(ANSI_GREEN+"File deleted Successfully"+ANSI_RESET);
              }
              else
              {
            	  System.out.println("File not found");
              }
  	          
 	           
 	           break;
          }
          case 5: {
        	  
  	          
	           exit=1;
	           choice=0;
	           break;
         }
	        
          
       }

       if(exit!=1)
       {

       System.out.println("Do you want to continue? press 1 for Yes press 0 for No");
      
	   
	   choice = sc.nextInt();
	   }
	   }
	   while(choice==1);

	   System.out.println("Thanks! Have a nice day");


	}

}
