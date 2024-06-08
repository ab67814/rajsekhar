package ritesh.org;

//package com.cgi.in;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MetaTag {

	    /*public void listFilesAndFolders(String directoryName){
 
        File directory = new File(directoryName);
 
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            System.out.println(file.getName());
        }
    }*/
	 // To insert the line into the file
    public void insertStringInFile(File inFile,String lineToBeInserted) throws Exception {
    // temp file
    File outFile = new File("$$$$$$$$.tmp");

    // input
    FileInputStream fis  = new FileInputStream(inFile);
    BufferedReader in = new BufferedReader
    (new InputStreamReader(fis));

    // output         
    FileOutputStream fos = new FileOutputStream(outFile);
    PrintWriter out = new PrintWriter(fos);

    String line = "";

    while ((line = in.readLine()) != null) {
	out.println(line);
	if((line.endsWith("charset=UTF-8\">"))||(line.endsWith("http-equiv='Content-Type'>")))
	{
		System.out.println("inside");
		out.println(lineToBeInserted);
		out.println('\n');
	}
	// out.println('\n');
  }
  out.flush();
  out.close();
  in.close();

  inFile.delete();
  outFile.renameTo(inFile);
}
 
    /*public void listFiles(String directoryName){
 
        File directory = new File(directoryName);
 
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
 
    public void listFolders(String directoryName){
 
        File directory = new File(directoryName);
 
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            if (file.isDirectory()){
                System.out.println(file.getName());
            }
        }
    }*/
 
    public void listFilesAndFilesSubDirectories(String directoryName) throws Exception {
 
        File directory = new File(directoryName);
 
        File[] fList = directory.listFiles();
        //Iterating into list of files in a directory
        for (File file : fList){
            if (file.isFile()){
            	if(file.getAbsolutePath().endsWith(".html"))
            	{
            		System.out.println(file.getAbsolutePath());
            		String content = "<meta content=\"IE=EmulateIE9\" http-equiv=\"X-UA-Compatible\">";
	                
            		insertStringInFile(new File(file.getAbsolutePath()),content);
            	}       
            } else if (file.isDirectory()){
            	System.out.println("In Directory");
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        
    }
    }
    public static void main (String[] args) throws Exception{
 
    	MetaTag mt = new MetaTag();
        //String directoryWindows ="E:\\common\\html";       
    	String directoryWindows ="C:\\Livingston\\NewLine1\\common\\html";
    	 mt.listFilesAndFilesSubDirectories(directoryWindows);
    }

 	}
	     
	    	 
	        
	        
	 
