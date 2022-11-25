package com.lockers.main;

import java.util.Scanner;

import com.lockers.service.Service;

public class Main {
    

	
	public static void main(String[] args) 
	{
		Service serv = new Service();
		int choice;
		int option;
	   System.out.println("<---------Welcome to LockedMe.com-------->");
	   System.out.println("<-----Developed by Mohd Aasim Ansari----->");
	   System.out.println("------------------------------------------");
	   
	   do {
	   System.out.println("*Please choose any option below*");
	   System.out.println("Default directory - D://file handling");
	   System.out.println("Option 1 -> Retreive files from current directory");
	   System.out.println("Option 2 -> Add a file to the exsiting directory");
	   System.out.println("Option 3 -> Search a file");
       System.out.println("option 4 -> Exit");
       Scanner sc = new Scanner(System.in);
       option = sc.nextInt();
       
       switch(option)
       {
          case 1: {
        	        //To get all files in specified directory   
        	        
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
  	              //To search a file in directory  
  	        
            }
       }
       
       System.out.println("Do you want to continue? press 1 for Yes press 0 for No");
	   
	   choice = sc.nextInt();
	   }
	   while(choice==1);

	}

}
