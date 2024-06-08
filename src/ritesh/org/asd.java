package ritesh.org;

//package com.cgi.in;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class asd {

    public void listFilesAndFolders(String directoryName){
 
        File directory = new File(directoryName);
 
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            System.out.println(file.getName());
        }
    }
 
    public void listFiles(String directoryName){
 
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
    }
 
    public void listFilesAndFilesSubDirectories(String directoryName) throws Exception {
 
        File directory = new File(directoryName);
 
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            if (file.isFile()){
            	if(file.getAbsolutePath().endsWith(".html"))
            	{
            		FileReader fileReader = new FileReader(file.getAbsolutePath());

            		String content = "<meta content=\"IE=EmulateIE9\" http-equiv=\"X-UA-Compatible\">";
	                // Always wrap FileReader in BufferedReader.
	                BufferedReader bufferedReader = new BufferedReader(fileReader);
	                String line = "";
	                StringBuffer sb = new StringBuffer();
	                while((line = bufferedReader.readLine()) != null) {
	                	
	                	sb.append(line);
	                	if(line.endsWith("charset=UTF-8\">"))
	                	{
	                		System.out.println("inside");
	                		sb.append("\n"+content+"\n");
	                	}	
	                   // System.out.println(line);
	                }    
	
	                // Always close files.
	                bufferedReader.close(); 

            		FileWriter fw = new FileWriter(file.getAbsolutePath());
    			BufferedWriter bw = new BufferedWriter(fw);
    			bw.write(sb.toString());
    			bw.close();

    			System.out.println("updated...");
            		System.out.println(file.getAbsolutePath());
            	}
            	
            } else if (file.isDirectory()){
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
    }
 
    public static void main (String[] args) throws Exception{
 
    	MetaTag mt = new MetaTag();
 
 
        String directoryWindows ="E:\\common\\html";       
 
        mt.listFilesAndFilesSubDirectories(directoryWindows);
        
    }

}
