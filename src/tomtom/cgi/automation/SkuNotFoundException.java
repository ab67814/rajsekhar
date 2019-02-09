package tomtom.cgi.automation;

public class SkuNotFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SkuNotFoundException(String message)
    {
	   if(message != null && message.isEmpty()) {
		   for (int i=0;i<message.length();i++){
			   
		   }
	   }
		
       System.out.println(message);
    }

}
