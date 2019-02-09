package connection;

public interface Provider {

	/*String DRIVER="oracle.jdbc.driver.OracleDriver";  
	String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
	String USERNAME="ritesh";  
	String PASSWORD="ritesh"; */
	String DRIVER="com.mysql.jdbc.Driver";  
	String CONNECTION_URL="jdbc:mysql://localhost:3306/philadelphia";  
	String USERNAME="root";  
	String PASSWORD="root"; 
}
