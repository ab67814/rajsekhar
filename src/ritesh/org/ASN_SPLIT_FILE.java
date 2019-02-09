package ritesh.org;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.TimeZone;

import org.apache.log4j.Logger;


public class ASN_SPLIT_FILE {
	static int  sequence[]=new int[10];
	static String movefolder;         
	
	private static Logger logger = Logger.getLogger(ASN_SPLIT_FILE.class);
	
	 static void read_File(String filename, String newfileLoc)
	{     int seq=0;
	int tempSeq=0;
		 sequence[0]=0;    
		 sequence[1]=0;    
		 sequence[2]=0;    
		 int split;
		 String aline;
    try
    { 
    	logger.debug("Reading file started." );
    	logger.debug("Checking sequence numbers" );
		 FileReader fr=new FileReader(filename);
		 BufferedReader br = new BufferedReader(fr);
		 while((aline=br.readLine())!=null)
		 {
			 
		
			 if(aline.contains("HEADER"))
			 {
				 //System.out.println(aline.contains("HEADER"));
				 
				 tempSeq = Integer.parseInt(aline.substring(34,38));
				   if(sequence[0]==0)
				   {
					  // System.out.println(tempSeq+"inside 1st loop");
					   sequence[0]=tempSeq;
				   }
		
			else{
				   if(tempSeq>sequence[0])
				   {
					   sequence[1]= tempSeq;
					  // System.out.println(sequence[1]+"second");
			       }		   
				   if(tempSeq>sequence[0] && tempSeq>sequence[1] )
				   {
					   sequence[2]= tempSeq;
					  // System.out.println(sequence[2]+"third");
			       }	
			}   
				seq=  (sequence[0]>sequence[1]) ? ((sequence[0]>sequence[2])? sequence[0]:sequence[2]):
					  ((sequence[1]>sequence[2]) ? sequence[1]:sequence[2]);
				
			
				 
			}
		}br.close();
		 logger.debug("Highest sequence available in file-->" + seq);
		 if (seq>sequence[0])
			{
				split=seq-sequence[0];
				
				logger.debug("File needs to be split into"+" "+ (split+1)+" " + "parts");
				if(split>0)
				{split_file(filename,newfileLoc);
				logger.debug("File split successfully." );
				}
	}
		 else{
				logger.debug("File having only one sequence. Copying to IN" );
							write_file(filename,newfileLoc);
							logger.debug("File copied successfully." );
						}	
		br.close(); 
	}
    catch(Exception e)
    {
    	logger.debug("Exception caught." );
    	logger.debug(e);
    }
	}
	
	  static   void split_file(String filename, String newfileLoc) 
	     { 
		     String aline= "Start";
		     logger.debug("Inside split_file"+ aline);
		     BufferedReader br = null;
			    try
			    { 
			    	String newfile ;
			    	File nfile[]= new File[10];
			    	br = new BufferedReader(new FileReader(filename));
			    
				for(int x=0; x<10; x++)
				{    
			
                     if((aline=br.readLine()) !=null && aline.contains("HEADER"))
				  {	 
					
                    	 logger.debug("First Line of split file :"+ aline);
 
                    	 newfile=newfileLoc+"_"+getTimeStamp();
                    	 logger.debug("new file name :"+ newfile);
				    	 nfile[x]= new File(newfile);
				    	BufferedWriter []out1 = new BufferedWriter[10];
				    			out1[x]=new BufferedWriter( new FileWriter(nfile[x]));
				    			
				    	out1[x].write(aline+"\n");
				    	
	                while(!((aline=br.readLine()).contains("9TRAILRASNCTBRIG2")))
	                {
	                	out1[x].write(aline);
	                	out1[x].newLine();
	                	out1[x].flush();
	                 }
	                
	                   logger.debug("Last Line ignored to write in file :"+ aline);
	                //String lline=aline.substring(0,33)+"00000000000";
	                   //out1[x].write(lline);
	                   //logger.debug("Last Line of splited file after changing trailer count :"+ lline);
					  out1[x].close();
					  
				String	  movedfile=movefolder+"_"+getTimeStamp();
				 logger.debug("copy_fileToIn is called :-->"+ movedfile);	 
				copy_fileToIn(newfile,movedfile); 
					  logger.debug("deleting existing split is called :-->"+ newfile);
					  manySec(300);
					  nfile[x].delete();
				  }
				  else 
					  return;
			    }
			    br.close();
			    }
			    catch(Exception e)
			    {
			    	e.printStackTrace();
			    } finally {
			    	try {
			    		if (br != null)
			    			br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			    }
			    
			    
		    
	     }
	  
	  static void write_file(String filename, String newfileLoc )
	  {
		   String aline;
		  try{
		  BufferedReader br = new BufferedReader(new FileReader(filename));
		String  newfile=newfileLoc+"_"+getTimeStamp();
		  File xfile=new File(newfile);
		  BufferedWriter out1 = new BufferedWriter( new FileWriter(xfile));
		  
		  while(!((aline=br.readLine()).contains("9TRAILRASNCTBRIG2")))
          {
          	out1.write(aline);
          	out1.newLine();
          	out1.flush();
           }
		  out1.close();
		  logger.debug("Last Line ignored to write in file :"+ aline);
		  
		  String	  movedfile=movefolder+"_"+getTimeStamp();
			 logger.debug("copy_fileToIn is called :-->"+ movedfile);	 
			copy_fileToIn(newfile,movedfile); 
				  logger.debug("deleting existing file in split_folder is called :-->"+ newfile);
				  xfile.delete();
		  br.close();
		  }
		  catch(Exception e)
		  {
			  logger.debug("Exception occured :-->"+ e);
		  }
		  
	  }
	  
	  public static void manySec(long s) {
		     try {
		       Thread.currentThread();
			Thread.sleep(s * 1000);
		       }
		     catch (InterruptedException e) {
		       e.printStackTrace();
		       }
		     }
	  
	 
	     public static String getFileName(String folderLoc) throws Exception
	 	{
	 		
	 		
	 		File inboxDir = new File(folderLoc);
	 		File[] files = inboxDir.listFiles();
	 		
	 		
	 		Arrays.sort(files, comparator());
	 		
	 		return (files[0].getName());
	 		
	 	}

		private static Comparator<Object> comparator() {
			return new Comparator<Object>() {
	 			public int compare(Object o1, Object o2) {
	 				return new Long(((File) o2).lastModified())
	 						.compareTo(new Long(((File) o1).lastModified()));
	 			}

	 		};
		}
	     
	     static String getTimeStamp() {
			 Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
			  DateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
			  String timeStamp = format.format(c.getTime());
			  return timeStamp;
			}
	
	     
	     static void copy_fileToIn(String source, String destination)
	     {
	    	 Path FROM = Paths.get(source);
	    	 Path TO = Paths.get(destination);
	    	 CopyOption[] options = new CopyOption[]{
	    	   StandardCopyOption.REPLACE_EXISTING,
	    	   StandardCopyOption.COPY_ATTRIBUTES
	    	 }; 
	    	 try {
				java.nio.file.Files.copy(FROM, TO, options);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	 
	     }
	     
	     
	     
	 public static void main(String ... st)throws Exception
	 {
		 ResourceBundle bundle = ResourceBundle.getBundle("App");
			String strfolderLoc = bundle.getString("folderLoc");
			String newfileLoc = bundle.getString("newfileLoc");
			movefolder= bundle.getString("movefolder");
			System.out.println("calling read_File()" + strfolderLoc+getFileName(strfolderLoc));
			read_File((strfolderLoc+"/"+getFileName(strfolderLoc)),newfileLoc);
			
			
	 }
}
