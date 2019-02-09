package rajsekhar.org;




//package com.livingston;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//import org.apache.commons.io.FileUtils;

//import java.io.File;
import java.io.FileReader;
import java.util.logging.Logger;

//import java.nio.file.Files;


//import java.util.StringTokenizer;
public class FTP_Version1 
 {
                final static Logger logger = Logger.getLogger(FTP_Version1.class.getName());
                /*public static void //sendEmail(String msg) throws AddressException, MessagingException
    {
        String fromUser = "noreply@vastera.com";
        String emailHost = "172.17.33.186";
        String emailTo = "ramesh.pathak@cgi.com";
       String emailSub = "RPL FTP Script";
        System.out.println("Inside mail");
        //get base on where it is trasferring the file done or error?
        String emailContent = "Error with the file";
        StringBuffer emailInfo = new StringBuffer();
        emailInfo.append(emailContent).append('\n').append(msg);
        
        
       Properties sys_Props = new Properties();
        sys_Props.put("mail.smtp.host", emailHost);
        Session mailSession = Session.getDefaultInstance(sys_Props, null);
        
        try {
                 
                                                Message message = new MimeMessage(mailSession);
                                                message.setFrom(new InternetAddress(fromUser));
                                                message.setRecipients(Message.RecipientType.TO,
                                                                InternetAddress.parse(emailTo));
                                                message.setSubject(emailSub);
                                                message.setText(emailInfo.toString());

                                                Transport.send(message);
                                } catch (MessagingException e) {
                                                throw new RuntimeException(e);
                                }
       
        logger.info("Email sent successfully.");
    }*/
                static void moveFileToDone(String filename,String suborg)
                {
                                InputStream inStream = null;
                                OutputStream outStream = null;
                
                                try{
                                                //pass the files dynamically
                                    File source =new File(filename);
                                    //get the filename
                                    String FileName=filename.substring(14);
                                    File file1 = new File("C:\\Ramesh\\FTP\\Done\\"+suborg+"\\IN\\");
                                    if (!file1.exists()) {
                                		if (file1.mkdirs()) {
                                			System.out.println("Directory is created!");
                                			
                                		} else {
                                			System.out.println("Failed to create directory!");
                                		}
                                	}
                                    
                                    System.out.println("Current File Done="+FileName);
                                    File desitination =new File("C:/Ramesh/FTP/Done/"+suborg+"/IN/"+FileName);
                                    inStream = new FileInputStream(source);
                                    outStream = new FileOutputStream(desitination);
                
                                    byte[] buffer = new byte[1024];
                
                                    int length;
                                    //copy the file content in bytes 
                                    while ((length = inStream.read(buffer)) > 0){
                
                                                outStream.write(buffer, 0, length);
                
                                    }
                
                                    inStream.close();
                                    outStream.close();
                
                                    //delete the original file
                                    if(source.delete()==true)
                                    {
                                    	System.out.println("original file is deleted");
                                    }
                                    else
                                    {
                                    	System.out.println("original file is not deleted");
                                    }
                                    System.out.println("File is copied successful in done!");
                
                                }
                               catch(IOException e){
                                    e.printStackTrace();
                                }
                    }
                static void moveFileToError(String filename)
                {
                                InputStream inStream = null;
                                OutputStream outStream = null;
                     
                                try{
                                    //pass the files dynamically
                                    File source =new File(filename);
                                    //get the filename
                                    String FileName=filename.substring(14);
                                    System.out.println("Current File Error="+FileName);
                                   
                                    File desitination =new File("C:/Ramesh/FTP/Error/"+FileName);
                                    
                                    inStream = new FileInputStream(source);
                                    outStream = new FileOutputStream(desitination);
                
                                    byte[] buffer = new byte[1024];
                
                                    int length;
                                    //copy the file content in bytes 
                                    while ((length = inStream.read(buffer)) > 0){
                
                                                                                  outStream.write(buffer, 0, length);
                
                                                                                 }
                                    
                                    //delete the original file
                                    inStream.close();
                                    outStream.close();
                                    
                                    if(source.delete()==true){
                                    	                      System.out.println("original file is deleted");
                                                             }
                                    else{
                                          System.out.println("original file is not deleted");
                                        }
                
                                    System.out.println("File is copied successful to error!");

                                }                   
                                
                                catch(IOException e){
                                	                 e.printStackTrace();
                                                    }
                    }
                
                
                void readfile(String filename)
                   {
                       //System.out.println("FileName inside readfile"+filename);
                                   String code1="";
                                   String check;
                                    try
                                    { 
                                     FileReader fr=new FileReader(filename);
                                     BufferedReader br = new BufferedReader(fr);
                                     check=br.readLine();
                                     System.out.println("First Line of the File="+check);
                                     boolean b=check.contains("|");
                                     System.out.println("First Line Contains '|' ="+b);
                                     br.close();
                                     if(b)
                                          {//file contains '|'
                                           System.out.println("Correct Folder");
                                           //Move the file to respective folder
                                           String s = check;
                                           int counter = 0;
                                           
                                           for( int i=0; i<s.length(); i++ )
                                           {
                                            if( s.charAt(i) == '|' ) 
                                            {
                                             counter++;
                                            // System.out.println(counter);
                                             if(counter==3)
                                             {
                                              for( int j=i+1; j<s.length(); j++ )
                                              {
                                            	  
                                               if( s.charAt(j) == '|' ) 
                                               {
                                                counter++;
                                                //  System.out.println(counter); 
                                               }
                                                                                                
                                                if(counter==4)
                                                {
                                                	//data(suborg) is in between 3rd '|' and 4th '|' so move to done folder
                                                 System.out.println("Suborg="+code1);
                                                 if(code1.equals(""))
                                                   {
                                                    System.out.println("File does not contain suborg");
                                                    System.out.println("move to error folder");
                                                    moveFileToError(filename);
                                                    System.out.println("Sending email");
                                                    //sendEmail(filename);
                                                    System.out.println("Mail sent");
                                                   }                                                                           
                                                  
                                                 break; 
                                                 
                                                 } 
                                               
                                                  //To convert the characters to String
                                                
                                                  char ch = s.charAt(j);
                                                  String code =Character.toString(ch);
                                                  code1=code1.concat(code);
                                                } 
                                              }
                                             }  
                                            }  
                                            
                                              
                                           if(code1 != null && !code1.isEmpty() && !(counter<=3)) { 
                                                                                                   System.out.println(counter);
                                                                                                   System.out.println("File conatins Suborg");
                                                                                                   System.out.println("move to done folder");
                                                                                                   moveFileToDone(filename,code1);
                                                                                                   System.out.println("Sending email");
                                                                                                   //sendEmail(filename);
                                                                                                   System.out.println("Mail sent");
                                           
                                                                                                  }
                                            else{
                                           	     // if Files contains less than 3 '|'
                                           	     System.out.println("File contains less than 3 '|' ");	
                                                 System.out.println("so, Moving file to  Error Folder");
                                                 moveFileToError(filename);
                                                 System.out.println("Sending email");
                                                 //sendEmail(filename);
                                                 System.out.println("Mail sent");
                                                 
                                                }
                                                
                                                                     
                                             }       
                                         
                                             else{
                                                 //Move the file to Error Folder
                                                 System.out.println("Error Folder");
                                                 moveFileToError(filename);
                                                 System.out.println("Sending email");
                                                 //sendEmail(filename);
                                                 System.out.println("Mail sent");  
                                                }
        
                                    }
                                    
                                    
                                    catch(Exception e)
                                    {
                                    	
                                     System.out.println("Exception caught." );
                                     System.out.println(e);
                                     
                                    }               
                                                
                                                  
                                               
                   }                           
                                               
                                                 
                                               
public static void main(String[] args) throws IOException 
    {
                                
                                
                                FTP_Version1  ftp =new FTP_Version1();
                                //Scan all the files present in the folder
                    //Location where the files will be present
                                String Location="C:/Ramesh/FTP";
                                File folder = new File(Location);
                                File[] listOfFiles = folder.listFiles();

                                for (int i = 0; i < listOfFiles.length; i++) 
                                {                                        
                                 File file = listOfFiles[i];
                                 if (file.isFile() && file.getName().endsWith(".txt")) 
                                                                                       {
                                                                                        //file.getAbsolutePath();
                                                                                        System.out.println("File Start************");
                                                                                        //String content = FileUtils.readFileToString(file);
                                                                                        //System.out.println("File Name is = " + listOfFiles[i].getName());
                                                                                        System.out.println(" absolute path:" + file.getAbsolutePath());
                                                                                        //ftp.readfile(file.getAbsolutePath()listOfFiles[i].getName());
                                                                                        String aPath=file.getAbsolutePath();
                                                                                        ftp.readfile(aPath);
                                                                                        System.out.println("File End************");
                                                                                        /* do somthing with content */
                                                                                       } 
                                  
                                 }
                                //end
                                /*String path="cmd /c start C:/Users/tiwarirt/Desktop/del.bat";
                                Runtime rn=Runtime.getRuntime();
                                rn.exec(path);*/
                                
                
                    
                }

 }

