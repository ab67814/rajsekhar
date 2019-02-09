package rajsekhar.org;

import java.io.BufferedReader;
//import java.io.File;

//import java.io.File;
import java.io.FileReader;
//import java.nio.file.Files;

//import java.util.StringTokenizer;

//import ritesh.org.Auto;

public class Check {
	void readfile(String filename)
	   {
	
		   String code1="";
		  /* File sourceFile = new File("directory-source/test1.txt");
		  File destinationDir = new File("directory-destination");
*/
		 // Files.moveFileToDirectory(sourceFile, destinationDir, true);
			 
		   String check;
		    try
		    { 
		    	
				 FileReader fr=new FileReader(filename);
				 BufferedReader br = new BufferedReader(fr);
			
				 check=br.readLine();
			//	 System.out.println(check);
				 String s = check;
				 int counter = 0;
				 for( int i=0; i<s.length(); i++ ) {
				     if( s.charAt(i) == '|' ) {
				         counter++;
				       //  System.out.println(counter);
				         if(counter==3)
				         {
				        	// System.out.println("hi");
				        	
				        	 for( int j=i+1; j<s.length(); j++ ){
				        		 
				        		
				        		 
				        		 if( s.charAt(j) == '|' ) {
							         counter++;
							       //  System.out.println(counter); 
				        		 }
				        		
				        		 if(counter==4)
				        		 {System.out.println(code1);
				        			 break;
				        		 }
				        		 char ch = s.charAt(j);
				        		 String code =Character.toString(ch);
				        		 code1=code1.concat(code);
				        		// System.out.println(code1);
				        		 if(code1.equals(""))
				        		 {
				        			 System.out.println("move to error folder");
				        		 }
				        	//	 System.out.println(s.charAt(j));
				        		 } 
				        		 
				        			 
				        			 
				        		 
				        		 
				        		 
				        	  
				         
				     } br.close();
				 }
				
				 /*StringTokenizer st = new StringTokenizer(check,"|");  
				 int cnt=st.countTokens();
		         System.out.println(cnt);
			     while (st.hasMoreTokens()) {  
			         System.out.println(st.nextToken()); 
			       
			     }  */
			     
		         
				 } 
		      }
				
				 
				 catch(Exception e)
				    {
				    	System.out.println("Exception caught." );
				    	System.out.println(e);
				    }
	   }
	public Check() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Check  ck =new Check();
	    ck.readfile("C:/Users/tiwarirt/Desktop/KC-RPS_Customer_Vendor_1513009.txt");
	    
	}

}
