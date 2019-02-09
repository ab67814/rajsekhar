package org.chin;


	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.OutputStream;
	import java.util.Properties;
	 
	public class PropertiesSet {
	  public static void main(String[] args) {
	 
		Properties prop = new Properties();
		OutputStream output = null;
	 
		try {
	 
			output = new FileOutputStream("resources/config.properties");
	 System.out.println("executed");
			// set the properties value
			prop.setProperty("database", "北京华中世通科技发展有限公司");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");
			System.out.println("executed");
			// save properties to project root folder
			prop.store(output, null);
	 
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	 
		}
	  }
	}
	


