package ritesh.org;

import java.io.*;

 public class Auto1 {
   public static void main(String args[]){
     try {
    	 String content = "<meta content=\"IE=EmulateIE9\" http-equiv=\"X-UA-Compatible\">";
       Auto1 j = new Auto1();
       j.insertStringInFile
          (new File("C:\\Livingston\\NewLine1\\common\\html\\billing.html"),content);
          		
       }
     catch (Exception e) {
       e.printStackTrace();
       }
     }

   public void insertStringInFile
         (File inFile,String lineToBeInserted) 
       throws Exception {
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
    	 if(line.endsWith("charset=UTF-8\">"))
     	{
     		System.out.println("inside");
     		out.println(lineToBeInserted);
     		out.println('\n');
     	}
    	 out.println('\n');
       }
    out.flush();
    out.close();
    in.close();
    
    inFile.delete();
    outFile.renameTo(inFile);
    }
}