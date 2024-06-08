package org.chin;
import java.io.UnsupportedEncodingException;
import java.sql.*;



import connection.ConnectionProvider;
public class Chin_character {

	
	
	public Chin_character() {
		// TODO Auto-generated constructor stub
	}
	
	public String chinese(String chine) throws UnsupportedEncodingException 
	{  /* byte[] bs = "中".getBytes("iso-8859-1");
	    
	  for(byte b : bs)
	    	System.out.print(Integer.toOctalString(b)+ " ");*/
		  
		String chn1 ="";
	    String str="北京华中世通科技发展";
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (Character.isHighSurrogate(ch)) {
	            System.out.println("Codepoint: " + 
	                   Character.toCodePoint(ch, str.charAt(i + 1)));
	            i++;
	        }
	        
	        String chn ="&#"+String.valueOf((int)ch)+";";
	        chn1=chn1.concat(chn);
	       // System.out.println(chn1);
	        
	       // System.out.println("Codepoint: " + (int)ch);
	    }
	  return(chn1);
	 // System.out.println(chn1);
	}
	public void insertRecords(){
		
		
			try {
				String d="";
				String c=chinese(d);
				System.out.println(c);
				//String qry = "insert into t_blob values(,'4EAC')";
				String qry ="insert into chinese values('"+c+"','Deharadun')";
				PreparedStatement pst;
				Connection con=ConnectionProvider.getCon();
				con.setAutoCommit(true);
                pst = con.prepareStatement(qry);
                int j=pst.executeUpdate();
    			if(j>0){System.out.println("Record inserted succesfully");}
    		  }
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void dispalyRecords() throws SQLException {
		
		ResultSet rs = null;
        String qry = "select * from chinese";
       //Connection con = null;
        try {
        	PreparedStatement pst = null;
			Connection con=ConnectionProvider.getCon();
			con.setAutoCommit(true);
			pst = con.prepareStatement(qry);
            rs = pst.executeQuery();
          
            while (rs.next()) {
            	System.out.println("The inserted record: "); 
            	System.out.println("   Chinese name = "
                        +new String(rs.getBytes("name")));
                System.out.println("   City = "+rs.getString("city"));
                
              /* String s =new String(rs.getBytes("image"));
                System.out.println(s.charAt(1));*/
                
            	}
            rs.close();
            con.close();
            
 
        } catch (SQLException ex) {
           System.out.println(ex); 
        } 
       
	}
		
   

	public static void main(String[] args) throws SQLException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
      Chin_character chnc =new Chin_character();
      chnc.insertRecords();
      System.out.println("INSERTED");
      System.out.println("displayed");
      chnc.dispalyRecords();
     
      
     
      /*String s = "北京华中世通科技发展有限公司"; //0xFF6E
       
      System.out.println(s);;
      System.out.println(s.getBytes().length);//length of the string
      System.out.println(s.charAt(1));//first character in the string
*/      
     
		 
	}
	}


