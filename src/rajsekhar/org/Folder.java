package rajsekhar.org;

import java.io.File;

public class Folder {

	public Folder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String suborg="ritesh";
		File file1 = new File("C:/Ramesh/FTP/Done/"+suborg+"/IN/");
		if(file1.mkdirs())
		{
			System.out.println("done");
		}
        /*if (!file1.exists()) {
    		if (file1.mkdir()) {
    			System.out.println("Directory is created!");
    			
    		} else {
    			System.out.println("Failed to create directory!");
    		}
    	}}*/

	}}


