package tomtom.cgi.automation;

import java.io.File;
import java.io.IOException;

public class PreparingAkamaiScript {
    static String directorySource = "D:/NameReading";
	String fileName="";
	private void listFilesAndFolders(String directoryName) throws IOException{
		 
        File directory = new File(directoryName);
 
        File[] fList = directory.listFiles();
       // BufferedWriter out = new BufferedWriter(new FileWriter("c://Users//tiwarirt//Desktop//curl.txt"));
        int i =0;
        int j =0;
        try {
        	if (fList != null) {
        		for (File file : fList){
    				if (file.isFile()) {
    					j++;
    					if (i==0) {
    						System.out.println("curl -k -T");
    						System.out.print("\"{"+file.getName());
    					}else {
    						if (fList.length == j) {
    							System.out.print(","+file.getName()+"}\"");
    							System.out.println();
    							System.out.println("https://mapshopupload:be82Ed71Mf42eLab@prod-alabama-003.amsterdam.tomtom.com/upload"+fileName.replace(directorySource, ""));
    							System.out.println("******************************************************************************************************************************************************************************************************************");
    						}else {
    							System.out.print(","+file.getName());
    						}
    					}
    					i++;
    				} else if(file.isDirectory())  {
    					i=0;
    					fileName=file.getAbsolutePath().replace("\\", "/");
    					System.out.println();
    					System.out.println("In Directory : "+file.getAbsolutePath());
    					listFilesAndFolders(file.getAbsolutePath());
    				 } 
    			}
        	}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PreparingAkamaiScript pakamaiscript = new PreparingAkamaiScript();
		pakamaiscript.listFilesAndFolders(directorySource);
		
	}

}
