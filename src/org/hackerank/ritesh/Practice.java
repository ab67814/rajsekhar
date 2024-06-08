package org.hackerank.ritesh;


public class Practice {

	   public static void main(String[] args) {
	        
		    String str="北京华中世通科技发展";
		    for (int i = 0; i < str.length(); i++) {
		        char ch = str.charAt(i);
		        if (Character.isHighSurrogate(ch)) {
		            System.out.println("Codepoint: " + 
		                   Character.toCodePoint(ch, str.charAt(i + 1)));
		            i++;
		        }
		        
		        String chn ="&#"+String.valueOf((int)ch)+";";
		        System.out.println(chn);
		    }
	   }
	      
}
	 
	   
		        
		        
		        
		        
		        
		    