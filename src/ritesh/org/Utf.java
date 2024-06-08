package ritesh.org;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Utf {

	public Utf() {
		// TODO Auto-generated constructor stub
	}
	
	
	static void writeOutput(String str) {
	    try {
	        FileOutputStream fos = new FileOutputStream("C:\\Users\\tiwarirt\\Desktop\\output.txt");
	        Writer out = new OutputStreamWriter(fos, "UTF8");
	        out.write(str);
	        out.close();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	static String readInput() {
	    StringBuffer buffer = new StringBuffer();
	    try {
	        FileInputStream fis = new FileInputStream("C:\\Users\\tiwarirt\\Desktop\\output.txt");
	        InputStreamReader isr = new InputStreamReader(fis, "UTF8");
	        Reader in = new BufferedReader(isr);
	        int ch;
	        while ((ch = in.read()) > -1) {
	            buffer.append((char)ch);
	        }
	        in.close();
	        return buffer.toString();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	        return null;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String jaString = new String("\u65e5\u672c\u8a9e\u6587\u5b57\u5217");
		    writeOutput(jaString); 
		    String inputString = readInput();
		    //String displayString = jaString + " " + inputString;
		    String displayString = inputString;
		    new ShowString(displayString, "Conversion Demo");
		   
	}

}
