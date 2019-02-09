package ritesh.org;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Auto {
   static int sequence[]=new int[10];
   void readfile(String filename)
   {
			 sequence[0]=0;    
			 sequence[1]=0;    
			 sequence[2]=0;    
			 
			 String aline;
	    try
	    { 
	    	System.out.println("Reading file started." );
	    	System.out.println("Checking sequence numbers" );
			 FileReader fr=new FileReader(filename);
			 BufferedReader br = new BufferedReader(fr);
			File f= new File("C:/Users/tiwarirt/Desktop/output.txt");
			FileWriter f1 =new FileWriter(f);
			 BufferedWriter br1 = new BufferedWriter(f1);
			 aline=br.readLine();
			String aline1=(aline.replaceAll(" ",""));
			
			
			 System.out.println(aline);
			 System.out.println(aline1);
			/* while(!((aline=br.readLine()).contains("FCSD")))
			 {
				br1.write(aline1);
			 }*/
			
			 if(aline.contains("HDR"))
			 {
				 br1.write("Part File"+"\t");
				 br1.write(aline.substring(9, 12));
			 }
			 br1.flush();		 
			 br1.close();
			 br.close();
			 
			 }
			 
			 catch(Exception e)
			    {
			    	System.out.println("Exception caught." );
			    	System.out.println(e);
			    }
	    
   }
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	void write_file(String filename, String newfileLoc )
	  {
		   String aline;
		  try{
		  BufferedReader br = new BufferedReader(new FileReader(filename));
		String  newfile=newfileLoc;
		  File xfile=new File(newfile);
		  BufferedWriter out1 = new BufferedWriter( new FileWriter(xfile));
		  
		  while(!((aline=br.readLine()).contains("TRL 000000326")))
        {
        	out1.write(aline);
        	out1.newLine();
        	out1.flush();
         }
		  out1.close();
		  System.out.println("Last Line ignored to write in file :"+ aline);
		  
		  br.close();
		  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Exception occured :-->"+ e);
		  }
		  
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Auto  au =new Auto();
    au.readfile("C:/Livingston/Backup/Prisma_cert/AH.AH0030.AH00306G.VASTERA(0)");
    au.write_file("C:/Livingston/Backup/Prisma_cert/AH.AH0030.AH00306G.VASTERA(0)","C:/Users/tiwarirt/Desktop/user.txt");

	}

}
